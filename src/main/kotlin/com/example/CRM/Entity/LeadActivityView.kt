package com.example.CRM.Entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "lead_activity_view") // Nombre de la vista en la base de datos
data class LeadActivityView(
    @Id
    val activityId: Long, // activity_id
    val activityDate: LocalDateTime?, // activity_date
    val activityDescription: String?, // activity_description
    val customerId: Long?, // customer_id
    val customerName: String?, // customer_name
    val customerEmail: String?, // customer_email
    val leadId: Long?, // lead_id
    val leadName: String?, // lead_name
    val leadEmail: String? // lead_email
)
