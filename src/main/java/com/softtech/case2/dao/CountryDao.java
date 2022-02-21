package com.softtech.case2.dao;

import com.softtech.case2.entity.Address;
import com.softtech.case2.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryDao extends JpaRepository<Country, Long> {

    List<Country> findByCode(String code);

}
