package kz.dom.domkzbackendv2.jpa;

import kz.dom.domkzbackendv2.Printer;
import kz.dom.domkzbackendv2.dto.HousingSearchFilterDTO;
import kz.dom.domkzbackendv2.dto.HousingSearchResultDTO;
import kz.dom.domkzbackendv2.model.jpa.JpaHousing;
import kz.dom.domkzbackendv2.model.jpa.JpaPriceHistory;
import kz.dom.domkzbackendv2.model.jpa.dict.housing.JpaElectricityType;
import kz.dom.domkzbackendv2.repository.jpa.JpaHousingRepository;
import kz.dom.domkzbackendv2.repository.jpa.JpaHousingSearchRepository;
import kz.dom.domkzbackendv2.service.JpaHousingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

import static kz.dom.domkzbackendv2.Printer.println;

@SpringBootTest
public class JpaRepositoryTests {

    @Autowired
    JpaHousingRepository jpaHousingRepository;
    @Autowired
    JpaHousingSearchRepository jpaHousingSearchRepository;

    private final Pageable pageRequest = PageRequest.of(0, 10);

    @Test
    @Transactional
    public void housings() {
        println("=== findAll ===");
        Page<JpaHousing> page = jpaHousingRepository.findAll(pageRequest);
        page.forEach(jpaHousing -> println(jpaHousing));

        println("\n=== findAllById ===");
        Iterable<JpaHousing> housings = jpaHousingRepository.findAllById(Arrays.asList(267482L, 245477L, 260840L));
        housings.forEach(Printer::println);
    }

    @Test
    @Transactional
    @Commit
    public void housingSave() {
        println("=== save ===");

        JpaPriceHistory priceHistory1 = new JpaPriceHistory();
        priceHistory1.setPrice(260_000D);
        JpaPriceHistory priceHistory2 = new JpaPriceHistory();
        priceHistory2.setPrice(270_000D);

        JpaElectricityType electricityType = new JpaElectricityType();
        electricityType.setId(2);

        JpaHousing newHousing = new JpaHousing();
        newHousing.setRbdId(123001L);
        newHousing.setDtCreate(new Date());
        newHousing.setSupplySource(1L);
        newHousing.setEmail("mygrnail@gmail.com");
        newHousing.setContactName("Dias");
        newHousing.setRoomCount(2);
        newHousing.setFloorCount(5);
        newHousing.setNum("324");
        newHousing.setHouseNum("23");
        newHousing.setEntryNumber("3");
        newHousing.setTotalPrice(260_000D);
        newHousing.setSell(true);
        newHousing.setCorner(false);
        newHousing.setPricePerSquareMeter(260_000D);
        newHousing.setElectricityType(electricityType);
        newHousing.addPriceHistory(priceHistory1);
        newHousing.addPriceHistory(priceHistory2);

        JpaHousing savedJpaHousing = jpaHousingRepository.save(newHousing);

        println(savedJpaHousing);
    }

    @Test
    @Transactional
    @Commit
    public void housingUpdate() {
        JpaHousing housing = jpaHousingRepository.findById(239379L).get();
        JpaPriceHistory ph1 = new JpaPriceHistory();
        ph1.setPrice(271000.00);
        JpaPriceHistory ph2 = new JpaPriceHistory();
        ph2.setPrice(272000.00);

        housing.setPriceHistories(Arrays.asList(ph1, ph2));
        jpaHousingRepository.save(housing);
    }

    @Test
    public void housingSearch() {
        println("=== search ===");
        HousingSearchFilterDTO filter = HousingSearchFilterDTO.builder().pageNum(1).pageSize(15).build();
        HousingSearchResultDTO result = jpaHousingSearchRepository.search(filter);
        result.getJpaData().forEach(item -> {
            println(item);
            if (item.getPriceHistories() != null && item.getPriceHistories().size() > 0) {
                println("  priceHistories: " + item.getPriceHistories());
            }
        });
    }
}
