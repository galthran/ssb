package net.jarosinski.ssb.mapper;

import net.jarosinski.ssb.controller.dto.CustomerDTO;
import net.jarosinski.ssb.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer customerDTOToCustomer(CustomerDTO customerDTO);

    CustomerDTO customerToCustomerDTO(Customer customer);
}
