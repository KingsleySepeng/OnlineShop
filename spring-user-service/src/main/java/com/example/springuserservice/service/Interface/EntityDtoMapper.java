package com.example.springuserservice.service.Interface;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.springuserservice.dto.CustomerDto;
import com.example.springuserservice.entity.Customer;

@Mapper
public interface EntityDtoMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);

    @Mapping(target="id")
    CustomerDto createCustomerDtoWithoutId(Customer customer);
}
