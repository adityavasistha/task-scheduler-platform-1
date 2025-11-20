package com.taskscheduler.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Map;

@Data
public class UpdateTaskRequest {

    @NotNull(message = "ID is required")
    private String id;
    
    @NotNull(message = "Scheduled time is required")
    private Long scheduledAt;

}
