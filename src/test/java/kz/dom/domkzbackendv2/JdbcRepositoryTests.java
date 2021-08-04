package kz.dom.domkzbackendv2;

import kz.dom.domkzbackendv2.dto.HousingSearchFilterDTO;
import kz.dom.domkzbackendv2.dto.HousingSearchResultDTO;
import kz.dom.domkzbackendv2.model.jdbc.Housing;
import kz.dom.domkzbackendv2.model.jdbc.PriceHistory;
import kz.dom.domkzbackendv2.model.jdbc.dict.housing.HousingType;
import kz.dom.domkzbackendv2.model.jdbc.dict.location.Address;
import kz.dom.domkzbackendv2.model.jdbc.dict.location.City;
import kz.dom.domkzbackendv2.model.jdbc.dict.location.District;
import kz.dom.domkzbackendv2.repository.jdbc.HousingRepository;
import kz.dom.domkzbackendv2.repository.jdbc.HousingSearchRepository;
import kz.dom.domkzbackendv2.repository.jdbc.dict.housing.HousingTypeRepository;
import kz.dom.domkzbackendv2.repository.jdbc.dict.location.AddressRepository;
import kz.dom.domkzbackendv2.repository.jdbc.dict.location.CityRepository;
import kz.dom.domkzbackendv2.repository.jdbc.dict.location.DistrictRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

import static kz.dom.domkzbackendv2.Printer.println;

@SpringBootTest
public class JdbcRepositoryTests {

    @Autowired
    HousingRepository housingRepository;
    @Autowired
    HousingSearchRepository housingSearchRepository;
    @Autowired
    HousingTypeRepository housingTypeRepository;
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    CityRepository cityRepository;
    @Autowired
    DistrictRepository districtRepository;

    final PageRequest pageRequest = PageRequest.of(0, 5);

    @Test
    public void housings() {
        println("=== findAll ===");
        Page<Housing> page = housingRepository.findAll(PageRequest.of(0, 5));
        println("page: " + page.getPageable().getPageNumber() + ", size: " + page.getSize());
        page.forEach(Printer::println);

        println("\n=== findAllById ===");
        Iterable<Housing> housings = housingRepository.findAllById(Arrays.asList(267482L, 269490L));
        housings.forEach(Printer::println);

        println("\n=== findById ===");
        Optional<Housing> housing = housingRepository.findById(267482L);
        println(housing);
        println(" priceHistory: " + housing.get().getPriceHistories());

        println("\n=== count ===");
        long count = housingRepository.count();
        println("count: " + count);

        println("\n=== search ===");
        HousingSearchFilterDTO filter = HousingSearchFilterDTO.builder().housingTypeId(2L).pageNum(1).pageSize(15).build();
        HousingSearchResultDTO result = housingSearchRepository.search(filter);
        result.getData().forEach(item -> println(item.getId() + ". " + item));
    }

    @Test
    @Transactional
    @Commit
    public void housingSave() {
        PriceHistory ph1 = new PriceHistory();
        ph1.setPrice(260_000d);
        PriceHistory ph2 = new PriceHistory();
        ph2.setPrice(270_000d);

        Housing newHousing = new Housing();
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
        newHousing.setTotalPrice(260_000d);
        newHousing.setSell(true);
        newHousing.setCorner(false);
        newHousing.setPricePerSquareMeter(260_000d);
        newHousing.setPriceHistories(Arrays.asList(ph1, ph2));

        Housing saved = housingRepository.save(newHousing);
        println(saved);
    }

    @Test
    @Commit
    public void housingUpdate() {
        housingRepository.findById(267482L).ifPresent(housing -> {
            // change only root
            housing.setCeilingHeight(2.7);
            // change children
            //housing.getPriceHistories().get(0).setPrice(265_000d);
            housingRepository.save(housing);
        });
    }

    @Test
    public void housingDelete() {
        housingRepository.findById(269547L).ifPresent(housing -> {
            housingRepository.delete(housing);
        });
//        housingRepository.deleteById(269547L);
    }

    @Test
    public void housingTypes() {
        Page<HousingType> page = housingTypeRepository.findAll(pageRequest);
        page.forEach(Printer::println);
    }


    @Test
    @Transactional
    @Rollback
    public void cities() {
        Page<City> page = cityRepository.findAll(pageRequest);
        page.forEach(Printer::println);

        City karatobe = new City();
        karatobe.setName("Каратобе");
        karatobe.setCountryId(1L);
        karatobe.setRegionId(1L);
        City save = cityRepository.save(karatobe);

        println("=== load Karatobe city ===");
        Optional<City> rec = cityRepository.findById(save.getId());
        println(rec);
    }

    @Test
    public void addresses() {
        println("=== findAll ===");
        Page<Address> page = addressRepository.findAll(pageRequest);
        page.forEach(Printer::println);

        println("=== findAllByCityId ===");
        page = addressRepository.findAllByCityId(2L, pageRequest);
        page.forEach(Printer::println);
    }

    @Test
    public void districts() {
        println("=== findAll ===");
        Page<District> page = districtRepository.findAll(pageRequest);
        page.forEach(Printer::println);

        println("=== findAllByCityId ===");
        page = districtRepository.findAllByCityId(2L, pageRequest);
        page.forEach(Printer::println);
    }


}
