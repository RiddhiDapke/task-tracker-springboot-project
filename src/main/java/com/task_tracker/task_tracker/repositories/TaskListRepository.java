package com.task_tracker.task_tracker.repositories;

import com.task_tracker.task_tracker.domain.entities.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TaskListRepository extends JpaRepository<TaskList, UUID> { //JPA gives crud behaviour

} 