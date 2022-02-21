package com.softtech.case2.dao;

import com.softtech.case2.entity.Neighborhood;
import com.softtech.case2.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NeighborhoodDao extends JpaRepository<Neighborhood, Long> {

    List<Neighborhood> findByDistrictId(Long districtId);

}
