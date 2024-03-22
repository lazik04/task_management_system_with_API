package uz.pdp.projection.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.pdp.projection.dto.CustomerClassDtoProjection;
import uz.pdp.projection.dto.CustomerUpdateDto;
import uz.pdp.projection.entity.Customer;
import uz.pdp.projection.repo.CustomerRepo;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerRepo customerRepo;


    @GetMapping("/{id}")
    public Optional<Customer> getById(@PathVariable("id") Long id) {
        return customerRepo.findById(id);
    }


    @GetMapping()
    public List<Customer> getAll() {
        return customerRepo.findAll();
    }

    @PostMapping("/update")
    public Customer updatedCustomer(@ModelAttribute CustomerUpdateDto customerDto) {
        Customer customer = customerRepo.findById(customerDto.getId()).orElse(null);

        if (customer.getId() != null) {
            Customer customer1 = customerRepo.findById(customerDto.getId()).get();

            if (customerDto.getFirstname() != null && !customerDto.getFirstname().isEmpty()) {
                customer1.setFirstname(customerDto.getFirstname());
            }

            if (customerDto.getLastname() != null && !customerDto.getLastname().isEmpty()) {
                customer1.setLastname(customerDto.getLastname());
            }

            if (customerDto.getUsername() != null && !customerDto.getUsername().isEmpty()) {
                customer1.setUsername(customerDto.getUsername());
            }

            if (customerDto.
                    getEmail() != null && !customerDto.
                    getEmail().isEmpty()) {
                customer1.setEmail(customerDto.
                        getEmail());
            }

            if (customerDto.getPassword() != null && !customerDto.getPassword().isEmpty()) {
                customer1.setPassword(customerDto.getPassword());
            }

            customerRepo.save(customer1);

        }

        return customer;
    }

    @PostMapping("/email")
    public CustomerClassDtoProjection findByEmail(@RequestParam("email") String email){
        return customerRepo.findByEmail(email);
    }

}
