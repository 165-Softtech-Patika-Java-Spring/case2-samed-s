package com.softtech.case2.service.entityservice;

import com.softtech.case2.dao.StreetDao;
import com.softtech.case2.entity.Street;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StreetEntityService {
    private final StreetDao streetDao;

    public Street save(Street street) {
        return streetDao.save(street);
    }

    public Street update(Street street) {
        controlIsStreetExists(street);
        return save(street);
    }

    public List<Street> findAllStreetsByNeighborhoodId(Long neighborhoodId) {
        return streetDao.findByNeighborhoodId(neighborhoodId);
    }

    private void controlIsStreetExists(Street street) {
        Long id = street.getId();
        boolean isExists = streetDao.existsById(id);
        if (!isExists){
            throw new RuntimeException("Street not found!");
        }
    }
}
