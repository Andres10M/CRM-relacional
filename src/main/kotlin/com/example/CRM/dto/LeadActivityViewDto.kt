package com.example.CRM.dto

import java.time.LocalDateTime

data class LeadActivityViewDto(
    val activityId: Long,
    val activityDate: LocalDateTime?,
    val activityDescription: String?,
    val customerId: Long?,
    val customerName: String?,
    val customerEmail: String?,
    val leadId: Long?,
    val leadName: String?,
    val leadEmail: String?
)
