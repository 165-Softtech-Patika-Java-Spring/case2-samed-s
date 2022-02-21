package com.softtech.case2.converter;

import com.softtech.case2.dto.AddressDto;
import com.softtech.case2.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);
    List<AddressDto> convertToAddressDtoList(List<Address> addressList);
    AddressDto convertToAddressDto(Address address);
    Address convertToAddress(AddressDto addressDto);
}
