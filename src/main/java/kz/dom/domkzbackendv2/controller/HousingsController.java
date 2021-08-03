package kz.dom.domkzbackendv2.controller;

import kz.dom.domkzbackendv2.model.jdbc.Housing;
import kz.dom.domkzbackendv2.repository.jdbc.HousingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("housings")
public class HousingsController {

    @Autowired
    private HousingRepository housingRepository;

    @GetMapping("")
    public Page all(@RequestParam("page") int page,
                    @RequestParam("size") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Housing> result = housingRepository.findAll(pageable);

        return result;
    }

}
