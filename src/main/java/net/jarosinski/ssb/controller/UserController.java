package net.jarosinski.ssb.controller;

import lombok.RequiredArgsConstructor;
import net.jarosinski.ssb.controller.dto.CustomerDTO;
import net.jarosinski.ssb.mapper.CustomerMapper;
import net.jarosinski.ssb.model.Customer;
import net.jarosinski.ssb.repository.CustomerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final CustomerRepository customerRepository;

    private final CustomerMapper customerMapper;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody CustomerDTO customerDTO) {
        Customer customer = customerMapper.customerDTOToCustomer(customerDTO);
        ResponseEntity responseEntity;

        try {
            Customer savedCustomer = customerRepository.save(customer);
            if(savedCustomer.getId() > 0) {
                responseEntity = ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body("Given user details are successfully registered");
            } else {
                responseEntity = ResponseEntity
                        .status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("Unknown error during user registration");
            }

        } catch (Exception e) {
            responseEntity = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An exception occured due to " + e.getMessage());
        }

        return responseEntity;
    }
}
