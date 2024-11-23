package com.example.CRM.repository


import com.example.CRM.Entity.Activity

import org.springframework.data.jpa.repository.JpaRepository

interface ActivityRepository : JpaRepository<Activity, Long>
