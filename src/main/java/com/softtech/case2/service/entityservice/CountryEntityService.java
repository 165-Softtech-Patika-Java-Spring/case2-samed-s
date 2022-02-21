package com.softtech.case2.service.entityservice;

import com.softtech.case2.dao.CountryDao;
import com.softtech.case2.entity.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryEntityService {
    private final CountryDao countryDao;

    public Country save(Country country) {
        return countryDao.save(country);
    }

    public List<Country> findByCode(String code) {
        return countryDao.findByCode(code);
    }
}
