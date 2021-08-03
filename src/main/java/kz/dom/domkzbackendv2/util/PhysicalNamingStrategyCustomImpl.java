package kz.dom.domkzbackendv2.util;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

import java.util.Locale;

public class PhysicalNamingStrategyCustomImpl extends PhysicalNamingStrategyStandardImpl {
    @Override
    public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context) {
        return getIdentifier(name.getText(), true, context);
    }

    protected Identifier getIdentifier(String name, boolean quoted, JdbcEnvironment jdbcEnvironment) {
        if (isCaseInsensitive(jdbcEnvironment)) {
            name = name.toLowerCase(Locale.ROOT);
        }
        return new Identifier(name, quoted);
    }

    /**
     * Specify whether the database is case sensitive.
     * @param jdbcEnvironment the JDBC environment which can be used to determine case
     * @return true if the database is case insensitive sensitivity
     */
    protected boolean isCaseInsensitive(JdbcEnvironment jdbcEnvironment) {
        return true;
    }

    private boolean isUnderscoreRequired(char before, char current, char after) {
        return Character.isLowerCase(before) && Character.isUpperCase(current) && Character.isLowerCase(after);
    }
}
