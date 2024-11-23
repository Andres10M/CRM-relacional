package com.example.CRM.service

import com.example.CRM.dto.ActivityDTO
import com.example.CRM.mapper.ActivityMapper
import com.example.CRM.repository.ActivityRepository

import org.springframework.stereotype.Service

@Service
class ActivityService(private val activityRepository: ActivityRepository) {

    fun getAllActivities(): List<ActivityDTO> {
        return activityRepository.findAll().map { ActivityMapper.toDto(it) }
    }

    fun createActivity(activityDto: ActivityDTO): ActivityDTO {
        val activity = ActivityMapper.toEntity(activityDto)
        val savedActivity = activityRepository.save(activity)
        return ActivityMapper.toDto(savedActivity)
    }

    fun getActivityById(id: Long): ActivityDTO {
        val activity = activityRepository.findById(id).orElseThrow { Exception("Activity not found") }
        return ActivityMapper.toDto(activity)
    }
}
