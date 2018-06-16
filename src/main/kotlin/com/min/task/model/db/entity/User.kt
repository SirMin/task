package com.min.task.model.db.entity

import javax.persistence.*

@Entity
class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var userId: Int? = null
    @Basic
    @Column(name = "user_name")
    var userName: String? = null
    @Basic
    @Column(name = "password")
    var password: String? = null
    @Basic
    @Column(name = "nick_name")
    var nickName: String? = null
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ext1")
    var ext1: String? = null
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ext2")
    var ext2: String? = null
    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var taskList : List<Task>?= null

}