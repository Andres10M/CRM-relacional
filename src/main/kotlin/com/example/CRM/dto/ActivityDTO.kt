package com.example.CRM.dto

data class ActivityDTO(
    val activityId: Long = 0,
    val leadId: Long? = null,
    val description: String,
    val activityType: String?,
    val activityDate: String? = null
)
