package kz.dom.domkzbackendv2.repository.jpa;

import kz.dom.domkzbackendv2.dto.HousingSearchFilterDTO;
import kz.dom.domkzbackendv2.dto.HousingSearchResultDTO;
import kz.dom.domkzbackendv2.model.jpa.JpaHousing;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JpaHousingSearchRepositoryImpl implements JpaHousingSearchRepository{
    @PersistenceContext
    private EntityManager em;

    @Override
    public HousingSearchResultDTO search(HousingSearchFilterDTO filter) {
        em.createNamedQuery("select h from JpaHousing h", JpaHousing.class);
        return HousingSearchResultDTO.builder().build();
    }
}
