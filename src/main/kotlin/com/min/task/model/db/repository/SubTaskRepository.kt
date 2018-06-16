package com.min.task.model.db.repository

import com.min.task.model.db.entity.SubTask
import org.springframework.data.jpa.repository.JpaRepository

interface SubTaskRepository : JpaRepository<SubTask, Int>