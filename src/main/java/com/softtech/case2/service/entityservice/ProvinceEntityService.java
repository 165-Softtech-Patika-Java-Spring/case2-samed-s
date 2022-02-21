package com.softtech.case2.service.entityservice;

import com.softtech.case2.dao.ProvinceDao;
import com.softtech.case2.entity.Province;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProvinceEntityService {
    private final ProvinceDao provinceDao;

    public Province save(Province province) {
        return provinceDao.save(province);
    }

    public List<Province> findByPlate(Long plate) {
        return provinceDao.findByPlate(plate);
    }
}
