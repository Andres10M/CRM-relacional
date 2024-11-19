package com.example.CRM.repository

import com.example.CRM.model.Activity
import com.example.CRM.model.Lead
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ActivityRepository : JpaRepository<Activity, Long> {

    // Método personalizado para encontrar todas las actividades asociadas a un Lead
    fun findAllByLead(lead: Lead): List<Activity>
}
