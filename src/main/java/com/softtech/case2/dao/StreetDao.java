package com.softtech.case2.dao;

import com.softtech.case2.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StreetDao extends JpaRepository<Street, Long> {
    List<Street> findByNeighborhoodId(Long neighborhoodId);
}
