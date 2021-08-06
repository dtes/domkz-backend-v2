package kz.dom.domkzbackendv2.repository.jpa;

import kz.dom.domkzbackendv2.dto.HousingSearchFilterDTO;
import kz.dom.domkzbackendv2.dto.HousingSearchResultDTO;
import kz.dom.domkzbackendv2.model.jpa.JpaHousing;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaHousingSearchRepositoryImpl implements JpaHousingSearchRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public HousingSearchResultDTO search(HousingSearchFilterDTO filter) {
        // Variant 1
        TypedQuery<JpaHousing> query = em.createQuery("select h from JpaHousing h \n" +
                "where 1=1\n" +
                (filter.getHousingTypeId() != null ? "and h.housingTypeId=:housingTypeId\n": "") +
                "and h.electricityType is not null" +
                "", JpaHousing.class);
        // Variant 2
        /*Query query = em.createNativeQuery("select h.* from housings h \n" +
                "where 1=1\n" +
                (filter.getHousingTypeId() != null ? "and h.housing_type_id=:housingTypeId" : "") +
                JpaHousing.class);*/

        if (filter.getHousingTypeId() != null) {
            query.setParameter("housingTypeId", filter.getHousingTypeId());
        }
        query.setFirstResult((filter.getPageNum() - 1) * filter.getPageSize());
        query.setMaxResults(filter.getPageSize());

        List<JpaHousing> data = query.getResultList();

        return HousingSearchResultDTO.builder()
                .jpaData(data)
                .build();
    }
}
