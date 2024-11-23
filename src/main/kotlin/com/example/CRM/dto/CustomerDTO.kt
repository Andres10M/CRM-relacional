package com.example.CRM.dto

data class CustomerDTO(
    val id: Long,
    val fullName: String,
    val email: String,
    val phone: String? = null,
    val address: String? = null
)
