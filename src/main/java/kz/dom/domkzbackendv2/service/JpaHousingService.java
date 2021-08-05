package kz.dom.domkzbackendv2.service;

import kz.dom.domkzbackendv2.model.jpa.JpaHousing;
import kz.dom.domkzbackendv2.repository.jpa.JpaHousingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class JpaHousingService {

    @Autowired
    private JpaHousingRepository jpaHousingRepository;

    public JpaHousing findById(Long id) {
        return jpaHousingRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Transactional
    public JpaHousing save(JpaHousing housing) {
        return jpaHousingRepository.save(housing);
    }

}
