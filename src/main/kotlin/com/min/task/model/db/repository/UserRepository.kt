package com.min.task.model.db.repository

import com.min.task.model.db.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int>