package com.example.CRM.mapper



import com.example.CRM.Entity.Activity
import com.example.CRM.dto.ActivityDTO
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object ActivityMapper {

    private val formatter = DateTimeFormatter.ISO_DATE_TIME

    fun toDto(activity: Activity): ActivityDTO {
        return ActivityDTO(
            activityId = activity.activityId,
            leadId = activity.leadId,
            description = activity.description,
            activityType = activity.activityType,
            activityDate = activity.activityDate.format(formatter)
        )
    }

    fun toEntity(activityDto: ActivityDTO): Activity {
        return Activity(
            activityId = activityDto.activityId,
            leadId = activityDto.leadId ?: 0L,
            description = activityDto.description,
            activityType = activityDto.activityType,
            activityDate = activityDto.activityDate?.let {
                LocalDateTime.parse(it, formatter)
            } ?: LocalDateTime.now()
        )
    }
}
