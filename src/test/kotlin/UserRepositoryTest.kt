package com.min.task.model.db.repository

import com.min.task.model.db.entity.User
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.transaction.Transactional

@SpringBootTest
@RunWith(SpringRunner::class)
open class UserRepositoryTest {
    @Autowired private lateinit  var userRepository : UserRepository
    @Test
    @Transactional
    open fun testInsert() {
        val user = User()
        user.userName = "小明"
        user.password = "123"
        user.nickName = "小霸王"
        userRepository.save(user)
    }
}