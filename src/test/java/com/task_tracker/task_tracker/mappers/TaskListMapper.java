package com.task_tracker.task_tracker.mappers;

import com.task_tracker.task_tracker.domain.dto.TaskListDto;
import com.task_tracker.task_tracker.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);

}
