package com.example.CRM.Entity

import jakarta.persistence.*

@Entity
data class Customer(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val fullName: String,
    val email: String,
    val phone: String?,
    val address: String?
)