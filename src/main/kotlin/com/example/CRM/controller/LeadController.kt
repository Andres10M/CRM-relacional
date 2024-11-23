package com.example.CRM.controller


import com.example.CRM.dto.LeadDTO
import com.example.CRM.service.LeadService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/leads")
class LeadController(private val leadService: LeadService) {

    @GetMapping
    fun getAllLeads(): List<LeadDTO> {
        return leadService.getAllLeads()
    }

    @PostMapping
    fun createLead(@RequestBody leadDto: LeadDTO): LeadDTO {
        return leadService.createLead(leadDto)
    }

    @GetMapping("/{id}")
    fun getLead(@PathVariable id: Long): LeadDTO {
        return leadService.getLeadById(id)
    }
}
