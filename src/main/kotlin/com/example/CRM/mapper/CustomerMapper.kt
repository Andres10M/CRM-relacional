package com.example.CRM.mapper



import com.example.CRM.Entity.Customer
import com.example.CRM.dto.CustomerDTO


object CustomerMapper {


    fun toDto(customer: Customer): CustomerDTO {
        return CustomerDTO(
            id = customer.id,
            fullName = customer.fullName,
            email = customer.email,
            phone = customer.phone,
            address = customer.address
        )
    }

    // Convierte un DTO CustomerDto a una entidad Customer
    fun toEntity(customerDto: CustomerDTO): Customer {
        return Customer(
            id = customerDto.id, // Usamos el id del DTO, el cual debería ser no nullable
            fullName = customerDto.fullName,
            email = customerDto.email,
            phone = customerDto.phone, // Puede ser nullable
            address = customerDto.address // Puede ser nullable
        )
    }
}
