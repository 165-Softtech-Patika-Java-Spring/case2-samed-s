package com.softtech.case2.service;

import com.softtech.case2.converter.AddressMapper;
import com.softtech.case2.dto.AddressDto;
import com.softtech.case2.entity.Address;
import com.softtech.case2.service.entityservice.AddressEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressEntityService addressEntityService;

    public AddressDto save(AddressDto addressDto) {
        Address address = AddressMapper.INSTANCE.convertToAddress(addressDto);
        address = addressEntityService.save(address);
        AddressDto newAddressDto = AddressMapper.INSTANCE.convertToAddressDto(address);
        return newAddressDto;
    }

    public void delete(Long addressId) {
        Address address = addressEntityService.findByIdWithControl(addressId);
        addressEntityService.delete(address);
    }

    public AddressDto findById(Long id) {
        Address address = addressEntityService.findByIdWithControl(id);
        AddressDto addressDto = AddressMapper.INSTANCE.convertToAddressDto(address);
        return addressDto;
    }
}
