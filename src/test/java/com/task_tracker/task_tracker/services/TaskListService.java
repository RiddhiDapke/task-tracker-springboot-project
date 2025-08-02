package com.task_tracker.task_tracker.services;

import com.task_tracker.task_tracker.domain.entities.TaskList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskListService {
    List<TaskList> listTaskList();
}
