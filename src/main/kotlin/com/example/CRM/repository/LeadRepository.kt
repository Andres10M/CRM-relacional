package com.example.CRM.repository

import com.example.CRM.Entity.Lead
import org.springframework.data.jpa.repository.JpaRepository

interface LeadRepository : JpaRepository<Lead, Long>
