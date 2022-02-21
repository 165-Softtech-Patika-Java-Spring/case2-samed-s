package com.softtech.case2.service.entityservice;

import com.softtech.case2.dao.AddressDao;
import com.softtech.case2.dto.AddressDto;
import com.softtech.case2.entity.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressEntityService {

    private final AddressDao addressDao;

    public List<Address> findAll(){
        return addressDao.findAll();
    }

    public Optional<Address> findById(Long id){
        return addressDao.findById(id);
    }

    public Address save(Address address) {
        return addressDao.save(address);
    }

    public void delete(Address address) {
        addressDao.delete(address);
    }


    public Address findByIdWithControl(Long id) {
        Optional<Address> addressOptional = findById(id);
        Address address;
        if(addressOptional.isPresent()) {
            address = addressOptional.get();
        }
        else {
            throw new RuntimeException("Address not found!");
        }
        return address;
    }
}
