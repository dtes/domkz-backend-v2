package kz.dom.domkzbackendv2.repository.jdbc;

import kz.dom.domkzbackendv2.dto.HousingSearchFilterDTO;
import kz.dom.domkzbackendv2.dto.HousingSearchResultDTO;
import kz.dom.domkzbackendv2.model.jdbc.Housing;
import kz.dom.domkzbackendv2.util.ColumnRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HousingSearchRepositoryImpl implements HousingSearchRepository {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public HousingSearchResultDTO search(HousingSearchFilterDTO filter) {
        Map params = new HashMap();
        params.put("housingType", filter.getHousingTypeId());
        params.put("offset", filter.getPageNum());
        params.put("limit", filter.getPageSize());

        String query = "select h.id, h.housing_type_id from housings h \n" +
                "where housing_type_id=:housingType \n" +
                "limit :limit offset :offset";

        List<Housing> data = jdbcTemplate.query(query, params, ColumnRowMapper.newInstance(Housing.class));

        return HousingSearchResultDTO.builder()
                .data(data)
                .build();
    }
}
