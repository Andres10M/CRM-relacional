package com.example.CRM.controller

import com.example.CRM.dto.ActivityDTO
import com.example.CRM.service.ActivityService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/activities")
class ActivityController(private val activityService: ActivityService) {

    @GetMapping
    fun getAllActivities(): List<ActivityDTO> {
        return activityService.getAllActivities()
    }

    @PostMapping
    fun createActivity(@RequestBody activityDto: ActivityDTO): ActivityDTO {
        return activityService.createActivity(activityDto)
    }

    @GetMapping("/{id}")
    fun getActivity(@PathVariable id: Long): ActivityDTO {
        return activityService.getActivityById(id)
    }
}
