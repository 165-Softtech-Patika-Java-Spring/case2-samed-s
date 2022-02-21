package com.softtech.case2.dao;

import com.softtech.case2.entity.Country;
import com.softtech.case2.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictDao extends JpaRepository<District, Long> {

    List<District> findByProvinceId(Long provinceId);
}
