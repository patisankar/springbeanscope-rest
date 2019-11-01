package com.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Customer;
import com.helper.Helper;
import com.service.CustomerService;

@RestController
@RequestMapping(value = "/customers")
@EnableHypermediaSupport(type = HypermediaType.HAL)
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    
    @Autowired
    private Helper helper; 
 
    @GetMapping("/all")
    public List<Customer> getCustomers() {
    	System.out.println(helper.toString());
        return customerService.allCustomers();
    }
    
    @GetMapping("/{customerId}")
    public Customer getCustomerById(@PathVariable String customerId) {
    	System.out.println(helper.toString());
        return customerService.getCustomerDetail(customerId);
    }
}
