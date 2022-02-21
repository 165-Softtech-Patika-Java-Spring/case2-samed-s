package com.softtech.case2.controller;

import com.softtech.case2.dto.AddressDto;
import com.softtech.case2.entity.*;
import com.softtech.case2.service.AddressService;
import com.softtech.case2.service.entityservice.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/address")
@RequiredArgsConstructor
public class Controller {
    private final CountryEntityService countryEntityService;
    private final ProvinceEntityService provinceEntityService;
    private final DistrictEntityService districtEntityService;
    private final NeighborhoodEntityService neighborhoodEntityService;
    private final StreetEntityService streetEntityService;
    private final AddressService addressService;

    @PostMapping("/country/save")
    public ResponseEntity saveCountry(@RequestBody Country country) {
        Country newCountry = countryEntityService.save(country);
        return ResponseEntity.ok(newCountry);
    }

    @GetMapping("/country/{code}")
    public ResponseEntity findCountryByCode(@PathVariable String code) {
        List<Country> countryList = countryEntityService.findByCode(code);
        return ResponseEntity.ok(countryList);
    }

    @PostMapping("/province/save")
    public ResponseEntity saveProvince(@RequestBody Province province) {
        Province newProvince = provinceEntityService.save(province);
        return ResponseEntity.ok(newProvince);
    }

    @GetMapping("/province/{plate}")
    public ResponseEntity findProvinceByPlate(@PathVariable Long plate) {
        List<Province> provinceList = provinceEntityService.findByPlate(plate);
        return ResponseEntity.ok(provinceList);
    }

    @PostMapping("/district/save")
    public ResponseEntity saveDistrict(@RequestBody District district) {
        District newDistrict = districtEntityService.save(district);
        return ResponseEntity.ok(newDistrict);
    }

    @GetMapping("/district/{provinceId}")
    public ResponseEntity findAllDistrictsByProvinceId(@PathVariable Long provinceId) {
        List<District> allDistrictsByProvinceId = districtEntityService.findAllDistrictsByProvinceId(provinceId);
        return ResponseEntity.ok(allDistrictsByProvinceId);
    }

    @PostMapping("/neighborhood/save")
    public ResponseEntity saveNeighborhood(@RequestBody Neighborhood neighborhood) {
        Neighborhood newNeighborhood = neighborhoodEntityService.save(neighborhood);
        return ResponseEntity.ok(newNeighborhood);
    }

    @PutMapping("/neighborhood/update")
    public ResponseEntity updateNeighborhood(@RequestBody Neighborhood neighborhood) {
        Neighborhood newNeighborhood = neighborhoodEntityService.update(neighborhood);
        return ResponseEntity.ok(newNeighborhood);
    }
    
    @GetMapping("/neighborhood/{districtId}")
    public ResponseEntity findAllNeighborhoodsByDistrictId(@PathVariable Long districtId) {
        List<Neighborhood> allNeighborhoodsByDistrictId = neighborhoodEntityService.findAllNeighborhoodsByDistrictId(districtId);
        return ResponseEntity.ok(allNeighborhoodsByDistrictId);
    }

    @PostMapping("/street/save")
    public ResponseEntity saveStreet(@RequestBody Street street) {
        Street newStreet = streetEntityService.save(street);
        return ResponseEntity.ok(newStreet);
    }

    @PutMapping("/street/update")
    public ResponseEntity updateStreet(@RequestBody Street street) {
        Street newStreet = streetEntityService.update(street);
        return ResponseEntity.ok(newStreet);
    }

    @GetMapping("/street/{neighborhoodId}")
    public ResponseEntity findAllStreetsByNeighborhoodId(@PathVariable Long neighborhoodId) {
        List<Street> allStreetsByNeighborhoodId = streetEntityService.findAllStreetsByNeighborhoodId(neighborhoodId);
        return ResponseEntity.ok(allStreetsByNeighborhoodId);
    }

    @PostMapping("/address/save")
    public ResponseEntity saveAddress(@RequestBody AddressDto addressDto) {
        AddressDto newAddressDto = addressService.save(addressDto);
        return ResponseEntity.ok(newAddressDto);
    }

    @DeleteMapping("/address/delete/{addressId}")
    public ResponseEntity deleteAddress(@PathVariable Long addressId) {
        addressService.delete(addressId);
        return ResponseEntity.ok(Void.TYPE);
    }

    @GetMapping("/address/{addressId}")
    public ResponseEntity findById(@PathVariable Long addressId) {
        AddressDto addressDto = addressService.findById(addressId);
        return ResponseEntity.ok(addressDto);
    }
}
