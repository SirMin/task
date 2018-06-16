package com.min.task.model.db.repository

import com.min.task.model.db.entity.Note
import org.springframework.data.jpa.repository.JpaRepository

interface NoteRepository : JpaRepository<Note, Int>