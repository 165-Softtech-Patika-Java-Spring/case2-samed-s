package com.softtech.case2.service.entityservice;

import com.softtech.case2.dao.DistrictDao;
import com.softtech.case2.entity.District;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DistrictEntityService {
    private final DistrictDao districtDao;

    public District save(District district) {
        return districtDao.save(district);
    }

    public List<District> findAllDistrictsByProvinceId(Long provinceId) {

        return districtDao.findByProvinceId(provinceId);
    }
}
