package com.example.CRM.mapper

import com.example.CRM.Entity.Lead
import com.example.CRM.dto.LeadDTO


object LeadMapper {
    fun toDto(lead: Lead): LeadDTO {
        return LeadDTO(
            leadId = lead.leadId,
            name = lead.name,
            email = lead.email,
            status = lead.status,
            createdAt = lead.createdAt.toString(),
            customerId = lead.customer?.id
        )
    }

    fun toEntity(leadDto: LeadDTO): Lead {
        return Lead(
            leadId = leadDto.leadId,
            name = leadDto.name,
            email = leadDto.email,
            status = leadDto.status
        )
    }
}
