package com.example.CRM.mapper



import com.example.CRM.Entity.LeadActivityView
import com.example.CRM.dto.LeadActivityViewDto


object LeadActivityViewMapper {

    fun toDto(leadActivityView: LeadActivityView): LeadActivityViewDto {
        return LeadActivityViewDto(
            activityId = leadActivityView.activityId,
            activityDate = leadActivityView.activityDate,
            activityDescription = leadActivityView.activityDescription,
            customerId = leadActivityView.customerId,
            customerName = leadActivityView.customerName,
            customerEmail = leadActivityView.customerEmail,
            leadId = leadActivityView.leadId,
            leadName = leadActivityView.leadName,
            leadEmail = leadActivityView.leadEmail
        )
    }

    fun toEntity(leadActivityViewDto: LeadActivityViewDto): LeadActivityView {
        return LeadActivityView(
            activityId = leadActivityViewDto.activityId,
            activityDate = leadActivityViewDto.activityDate,
            activityDescription = leadActivityViewDto.activityDescription,
            customerId = leadActivityViewDto.customerId,
            customerName = leadActivityViewDto.customerName,
            customerEmail = leadActivityViewDto.customerEmail,
            leadId = leadActivityViewDto.leadId,
            leadName = leadActivityViewDto.leadName,
            leadEmail = leadActivityViewDto.leadEmail
        )
    }
}
