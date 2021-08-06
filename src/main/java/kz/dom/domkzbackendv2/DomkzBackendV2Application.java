package kz.dom.domkzbackendv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableJdbcRepositories(basePackages = {"kz.dom.domkzbackendv2.model.jdbc", "kz.dom.domkzbackendv2.repository.jdbc"})
@EnableJpaRepositories(basePackages = {"kz.dom.domkzbackendv2.model.jpa", "kz.dom.domkzbackendv2.repository.jpa"})
public class DomkzBackendV2Application {

    public static void main(String[] args) {
        SpringApplication.run(DomkzBackendV2Application.class, args);
    }

}
