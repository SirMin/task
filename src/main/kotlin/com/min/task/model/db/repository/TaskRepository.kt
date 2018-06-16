package com.min.task.model.db.repository

import com.min.task.model.db.entity.Task
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository : JpaRepository<Task, Int>