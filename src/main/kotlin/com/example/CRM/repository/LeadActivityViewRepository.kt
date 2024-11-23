package com.example.CRM.repository

import com.example.CRM.Entity.LeadActivityView
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository

@Repository
interface LeadActivityViewRepository : JpaRepository<LeadActivityView, Long> {

    @Query("SELECT lav FROM LeadActivityView lav")
    fun findAllLeadActivities(): List<LeadActivityView>

    @Query("SELECT lav FROM LeadActivityView lav WHERE lav.activityId = :id")
    fun findLeadActivityById(@Param("id") id: Long): LeadActivityView?
}
