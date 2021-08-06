package kz.dom.domkzbackendv2.jpa;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import kz.dom.domkzbackendv2.Printer;
import kz.dom.domkzbackendv2.dto.JpaDictionaryDTO;
import kz.dom.domkzbackendv2.service.JpaDictionaryService;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static kz.dom.domkzbackendv2.Printer.println;

@SpringBootTest
public class JpaDictionaryServiceTests {
    @Autowired
    private JpaDictionaryService jpaDictionaryService;

    @Test
    @SneakyThrows
    public void load() {
        JpaDictionaryDTO dictionaries = jpaDictionaryService.getDictionaries();

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(dictionaries);
        println(json);
    }

}
