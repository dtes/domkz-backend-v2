package kz.dom.domkzbackendv2.service;

import kz.dom.domkzbackendv2.dto.HousingSearchFilterDTO;
import kz.dom.domkzbackendv2.dto.HousingSearchResultDTO;
import kz.dom.domkzbackendv2.model.jdbc.Housing;
import kz.dom.domkzbackendv2.repository.jdbc.HousingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class HousingService {

    private HousingRepository housingRepository;

    @Transactional(readOnly = true)
    public Housing getById(long id) {
        Optional<Housing> housing = housingRepository.findById(id);
        return housing.get();
    }

    @Transactional(readOnly = true)
    public HousingSearchResultDTO search(HousingSearchFilterDTO filter) {
        HousingSearchResultDTO result = HousingSearchResultDTO.builder().build();

        return result;
    }

    @Autowired
    public void setHousingRepository(HousingRepository housingRepository) {
        this.housingRepository = housingRepository;
    }
}
