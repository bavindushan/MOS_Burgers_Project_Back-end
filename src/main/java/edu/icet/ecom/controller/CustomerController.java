package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Customer;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {

    final CustomerService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> getAll(){
        return service.getAll();
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void updateCustomer(@RequestBody Customer customer){
        service.updateCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteCustomer(@PathVariable Integer id){
        service.deleteCustomer(id);
    }

    @GetMapping("/search/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Customer searchCustomerByID(@PathVariable Integer id){
        return service.searchCustomerById(id);
    }

    @GetMapping("/search-by-number/{number}")
    public Customer searchByNumber(@PathVariable String number){
        return service.searchByNumber(number);
    }
}
