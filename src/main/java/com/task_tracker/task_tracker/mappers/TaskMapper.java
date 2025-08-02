package com.task_tracker.task_tracker.mappers;

import com.task_tracker.task_tracker.domain.dto.TaskDto;
import com.task_tracker.task_tracker.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);
} 