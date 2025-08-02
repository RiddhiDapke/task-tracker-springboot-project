package com.task_tracker.task_tracker.controllers;

import com.task_tracker.task_tracker.domain.dto.TaskListDto;
import com.task_tracker.task_tracker.domain.entities.TaskList;
import com.task_tracker.task_tracker.mappers.TaskListMapper;
import com.task_tracker.task_tracker.services.TaskListService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/task-lists")
public class TaskListController {

    private final TaskListService taskListService;
    private final TaskListMapper taskListMapper;

    public TaskListController(TaskListService taskListService, TaskListMapper taskListMapper) {
        this.taskListService = taskListService;
        this.taskListMapper = taskListMapper;
    }

    @GetMapping
    public List<TaskListDto> listTaskLists() {
        return taskListService.listTaskList()
                .stream()
                .map(taskListMapper::toDto)
                .toList();
    }
//    @PostMapping
//    public TaskListDto createTaskList(@RequestBody TaskListDto taskListDto) {
//        TaskList createdTaskList = taskListService.createTaskList(
//                taskListMapper.fromDto(taskListDto)  // corrected method name 'FromDto' → 'fromDto'
//        );
//        return taskListMapper.toDto(createdTaskList);
//    }

}
