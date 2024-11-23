package com.example.CRM.controller

import com.example.CRM.dto.CustomerDTO

import com.example.CRM.service.CustomerService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers")
class CustomerController(private val customerService: CustomerService) {

    @GetMapping
    fun getAllCustomers(): List<CustomerDTO> {
        return customerService.getAllCustomers()
    }

    @PostMapping
    fun createCustomer(@RequestBody customerDto: CustomerDTO): CustomerDTO {
        return customerService.createCustomer(customerDto)
    }

    @GetMapping("/{id}")
    fun getCustomer(@PathVariable id: Long): CustomerDTO {
        return customerService.getCustomerById(id)
    }
}
