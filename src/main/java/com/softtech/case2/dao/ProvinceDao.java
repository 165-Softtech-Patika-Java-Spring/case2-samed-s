package com.softtech.case2.dao;

import com.softtech.case2.entity.District;
import com.softtech.case2.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceDao extends JpaRepository<Province, Long> {

    List<Province> findByPlate(Long plate);
}
