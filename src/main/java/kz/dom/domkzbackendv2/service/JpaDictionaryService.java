package kz.dom.domkzbackendv2.service;

import kz.dom.domkzbackendv2.dto.JpaDictionaryDTO;
import kz.dom.domkzbackendv2.model.jpa.dict.JpaBuilder;
import kz.dom.domkzbackendv2.model.jpa.dict.housing.*;
import kz.dom.domkzbackendv2.model.jpa.dict.location.JpaCity;
import kz.dom.domkzbackendv2.repository.jpa.dict.JpaBuilderRepository;
import kz.dom.domkzbackendv2.repository.jpa.dict.housing.*;
import kz.dom.domkzbackendv2.repository.jpa.dict.location.JpaCityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class JpaDictionaryService {
    private JpaCityRepository jpaCityRepository;
    private JpaBalconyTypeRepository jpaBalconyTypeRepository;
    private JpaHeatingTypeRepository jpaHeatingTypeRepository;
    private JpaConditionRepository jpaConditionRepository;
    private JpaHousingTypeRepository jpaHousingTypeRepository;
    private JpaPropertyClassRepository jpaPropertyClassRepository;
    private JpaToiletTypeRepository jpaToiletTypeRepository;
    private JpaWallTypeRepository jpaWallTypeRepository;
    private JpaBuilderRepository jpaBuilderRepository;

    public JpaDictionaryDTO getDictionaries() {
        Iterable<JpaCity> cities = jpaCityRepository.findAll();
        Iterable<JpaBalconyType> balconyTypes = jpaBalconyTypeRepository.findAll();
        Iterable<JpaHeatingType> heatingTypes = jpaHeatingTypeRepository.findAll();
        Iterable<JpaCondition> conditions = jpaConditionRepository.findAll();
        Iterable<JpaHousingType> housingTypes = jpaHousingTypeRepository.findAll();
        Iterable<JpaPropertyClass> propertyClasses = jpaPropertyClassRepository.findAll();
        Iterable<JpaToiletType> toiletTypes = jpaToiletTypeRepository.findAll();
        Iterable<JpaWallType> wallTypes = jpaWallTypeRepository.findAll();
        Iterable<JpaBuilder> builders = jpaBuilderRepository.findAll();

        return JpaDictionaryDTO.builder()
                .cities(cities)
                .balconyTypes(balconyTypes)
                .heatingTypes(heatingTypes)
                .conditions(conditions)
                .housingTypes(housingTypes)
                .propertyClasses(propertyClasses)
                .toiletTypes(toiletTypes)
                .wallTypes(wallTypes)
                .builders(builders)
                .build();
    }

    @Autowired
    public void setJpaCityRepository(JpaCityRepository jpaCityRepository) {
        this.jpaCityRepository = jpaCityRepository;
    }

    @Autowired
    public void setJpaBalconyTypeRepository(JpaBalconyTypeRepository jpaBalconyTypeRepository) {
        this.jpaBalconyTypeRepository = jpaBalconyTypeRepository;
    }

    @Autowired
    public void setJpaHeatingTypeRepository(JpaHeatingTypeRepository jpaHeatingTypeRepository) {
        this.jpaHeatingTypeRepository = jpaHeatingTypeRepository;
    }

    @Autowired
    public void setJpaConditionRepository(JpaConditionRepository jpaConditionRepository) {
        this.jpaConditionRepository = jpaConditionRepository;
    }

    @Autowired
    public void setJpaHousingTypeRepository(JpaHousingTypeRepository jpaHousingTypeRepository) {
        this.jpaHousingTypeRepository = jpaHousingTypeRepository;
    }

    @Autowired
    public void setJpaPropertyClassRepository(JpaPropertyClassRepository jpaPropertyClassRepository) {
        this.jpaPropertyClassRepository = jpaPropertyClassRepository;
    }

    @Autowired
    public void setJpaToiletTypeRepository(JpaToiletTypeRepository jpaToiletTypeRepository) {
        this.jpaToiletTypeRepository = jpaToiletTypeRepository;
    }

    @Autowired
    public void setJpaWallTypeRepository(JpaWallTypeRepository jpaWallTypeRepository) {
        this.jpaWallTypeRepository = jpaWallTypeRepository;
    }

    @Autowired
    public void setJpaBuilderRepository(JpaBuilderRepository jpaBuilderRepository) {
        this.jpaBuilderRepository = jpaBuilderRepository;
    }
}
