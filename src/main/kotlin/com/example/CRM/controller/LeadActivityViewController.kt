package com.example.CRM.controller

import com.example.CRM.dto.LeadActivityViewDto
import com.example.CRM.service.LeadActivityViewService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/lead-activities")
class LeadActivityViewController(private val leadActivityViewService: LeadActivityViewService) {

    @GetMapping
    fun getAllLeadActivities(): List<LeadActivityViewDto> {
        return leadActivityViewService.getAllLeadActivities()
    }

    @GetMapping("/{id}")
    fun getLeadActivityById(@PathVariable id: Long): LeadActivityViewDto {
        return leadActivityViewService.getLeadActivityById(id)
    }
}
