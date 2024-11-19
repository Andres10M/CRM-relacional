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

    // Crear una nueva actividad asociada a un lead
    @PostMapping("/leads/{leadId}/activities") // Asegúrate de que la ruta sea correcta
    fun createActivity(@PathVariable leadId: Long, @RequestBody activityDTO: ActivityDTO): ActivityDTO {
        return activityService.createActivity(leadId, activityDTO) // Pasamos ambos parámetros
    }

    // Obtener todas las actividades
    @GetMapping
    fun getAllActivities(): List<ActivityDTO> {
        return activityService.getAllActivities()
    }

    // Obtener una actividad por ID
    @GetMapping("/{id}")
    fun getActivityById(@PathVariable id: Long): ActivityDTO? {
        return activityService.getActivityById(id)
    }
}
