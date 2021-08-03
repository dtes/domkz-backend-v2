package kz.dom.domkzbackendv2.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;

@Slf4j
public class ColumnRowMapper<T> extends BeanPropertyRowMapper<T> {

    private ColumnRowMapper(final Class<T> mappedClass) {
        super(mappedClass);
    }

    @Override
    protected String underscoreName(final String name) {
        final Column annotation;
        final String columnName;
        Field declaredField = null;

        try {
            declaredField = getMappedClass().getDeclaredField(name);
        } catch (NoSuchFieldException | SecurityException e) {
            log.warn("Ups, field «{}» not found in «{}».", name, getMappedClass());
        }

        if (declaredField == null || (annotation = declaredField.getAnnotation(Column.class)) == null
                || StringUtils.isEmpty(columnName = annotation.toString())) {
            return super.underscoreName(name);
        }

        return columnName;
    }

    /**
     * New instance.
     *
     * @param <T>         the generic type
     * @param mappedClass the mapped class
     * @return the bean property row mapper
     */
    public static <T> BeanPropertyRowMapper<T> newInstance(final Class<T> mappedClass) {
        return new ColumnRowMapper<>(mappedClass);
    }
}