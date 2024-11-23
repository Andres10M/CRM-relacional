package com.example.CRM.service


import com.example.CRM.dto.CustomerDTO
import com.example.CRM.mapper.CustomerMapper
import com.example.CRM.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(private val customerRepository: CustomerRepository) {

    fun getAllCustomers(): List<CustomerDTO> {
        return customerRepository.findAll().map { CustomerMapper.toDto(it) }
    }

    fun createCustomer(customerDto: CustomerDTO): CustomerDTO {
        val customer = CustomerMapper.toEntity(customerDto)
        val savedCustomer = customerRepository.save(customer)
        return CustomerMapper.toDto(savedCustomer)
    }

    fun getCustomerById(id: Long): CustomerDTO{
        val customer = customerRepository.findById(id).orElseThrow { Exception("Customer not found") }
        return CustomerMapper.toDto(customer)
    }
}