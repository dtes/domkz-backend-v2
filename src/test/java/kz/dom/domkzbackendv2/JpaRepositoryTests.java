package kz.dom.domkzbackendv2;

import kz.dom.domkzbackendv2.model.jpa.JpaHousing;
import kz.dom.domkzbackendv2.repository.jpa.JpaHousingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import static kz.dom.domkzbackendv2.Printer.println;

@SpringBootTest
public class JpaRepositoryTests {

    @Autowired
    JpaHousingRepository jpaHousingRepository;

    private final Pageable pageRequest = PageRequest.of(0, 10);

    @Test
//    @Transactional
    public void housings() {
        Page<JpaHousing> page = jpaHousingRepository.findAll(pageRequest);
        page.forEach(jpaHousing -> println(jpaHousing));
    }
}
