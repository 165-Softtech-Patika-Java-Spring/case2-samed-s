package com.softtech.case2.service.entityservice;

import com.softtech.case2.dao.NeighborhoodDao;
import com.softtech.case2.entity.Neighborhood;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NeighborhoodEntityService {
    private final NeighborhoodDao neighborhoodDao;

    public Neighborhood save(Neighborhood neighborhood) {
        return neighborhoodDao.save(neighborhood);
    }

    public Neighborhood update(Neighborhood neighborhood) {
        controlIsNeighborhoodExists(neighborhood);
        return save(neighborhood);
    }

    public List<Neighborhood> findAllNeighborhoodsByDistrictId(Long districtId) {
        return neighborhoodDao.findByDistrictId(districtId);
    }

    private void controlIsNeighborhoodExists(Neighborhood neighborhood) {
        Long id = neighborhood.getId();
        boolean isExists = neighborhoodDao.existsById(id);
        if (!isExists){
            throw new RuntimeException("Neighborhood not found!");
        }
    }
}
