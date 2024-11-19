package com.example.CRM.controller

import com.example.CRM.dto.LeadDTO
import com.example.CRM.service.LeadService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/leads")
class LeadController {

    @Autowired
    private lateinit var leadService: LeadService


    @GetMapping
    fun getAllLeads(): List<LeadDTO> {
        return leadService.getAllLeads()
    }


    @GetMapping("/{id}")
    fun getLeadById(@PathVariable id: Long): LeadDTO {
        return leadService.getLeadById(id)
    }


    @PostMapping
    fun createLead(@RequestBody leadDTO: LeadDTO): LeadDTO {
        return leadService.createLead(leadDTO)
    }

        @PutMapping("/{id}")
    fun updateLead(@PathVariable id: Long, @RequestBody leadDTO: LeadDTO): LeadDTO {
        return leadService.updateLead(id, leadDTO)
    }


    @DeleteMapping("/{id}")
    fun deleteLead(@PathVariable id: Long) {
        leadService.deleteLead(id)
    }


    @PutMapping("/{id}/set-status")
    fun updateLeadStatus(@PathVariable id: Long, @RequestBody statusUpdate: Map<String, String>): LeadDTO {
        val status = statusUpdate["status"] ?: throw IllegalArgumentException("Status is required")
        return leadService.updateStatus(id, status)
    }
}
