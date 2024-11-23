
package com.example.CRM.dto

data class LeadDTO(
    val leadId: Long,
    val name: String,
    val email: String,
    val status: String = "active",
    val createdAt: String? = null,
    val customerId: Long? = null
)
