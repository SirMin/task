package com.min.task.model.db.entity

import java.sql.Timestamp
import javax.persistence.*

@Entity
class Task {
    @Id
    @Column(name = "task_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var taskId: Int = 0
    @Basic
    @Column(name = "task_name")
    var taskName: String? = null
    @Basic
    @Column(name = "description")
    var description: String? = null
    @Basic
    @Column(name = "status")
    var status: Byte = 0
    @Basic
    @Column(name = "plan_start_time")
    var planStartTime: Timestamp? = null
    @Basic
    @Column(name = "plan_end_time")
    var planEndTime: Timestamp? = null
    @Basic
    @Column(name = "start_time")
    var startTime: Timestamp? = null
    @Basic
    @Column(name = "end_time")
    var endTime: Timestamp? = null
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ext1")
    var ext1: String? = null
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ext2")
    var ext2: String? = null

    @ManyToOne
    @JoinColumn(name = "user_id")
    var user: User? = null
    @OneToMany(mappedBy = "task", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var subTaskList: List<SubTask>? = null
    @ManyToMany(mappedBy = "taskList", fetch = FetchType.LAZY)
    var tagList: List<Tag>? = null

}
