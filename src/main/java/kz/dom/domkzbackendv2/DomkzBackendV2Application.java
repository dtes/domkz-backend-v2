package kz.dom.domkzbackendv2;

import kz.dom.domkzbackendv2.repository.jdbc.HousingRepository;
import kz.dom.domkzbackendv2.repository.jpa.JpaHousingRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
//@EnableJdbcRepositories()
//@EnableJpaRepositories(basePackageClasses = JpaHousingRepository.class)
public class DomkzBackendV2Application {

	public static void main(String[] args) {
		SpringApplication.run(DomkzBackendV2Application.class, args);
	}

}
