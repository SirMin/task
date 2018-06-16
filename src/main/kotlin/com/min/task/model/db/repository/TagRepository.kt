package com.min.task.model.db.repository

import com.min.task.model.db.entity.Tag
import org.springframework.data.jpa.repository.JpaRepository

interface TagRepository : JpaRepository<Tag, Int>