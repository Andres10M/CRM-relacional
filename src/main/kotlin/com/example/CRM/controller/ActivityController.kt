package com.example.CRM.controller

import com.example.CRM.dto.ActivityDTO
import com.example.CRM.service.ActivityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/activities")
class ActivityController {

    @Autowired
    private lateinit var activityService: ActivityService


    @PostMapping("/leads/{leadId}/activities")
    fun createActivity(@PathVariable leadId: Long, @RequestBody activityDTO: ActivityDTO): ActivityDTO {
        return activityService.createActivity(leadId, activityDTO)
    }


    @GetMapping
    fun getAllActivities(): List<ActivityDTO> {
        return activityService.getAllActivities()
    }


    @GetMapping("/{id}")
    fun getActivityById(@PathVariable id: Long): ActivityDTO? {
        return activityService.getActivityById(id)
    }
}
