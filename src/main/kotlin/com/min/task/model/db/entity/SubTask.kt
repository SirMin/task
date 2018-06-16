package com.min.task.model.db.entity

import lombok.extern.java.Log
import javax.persistence.*
import java.sql.Timestamp
import java.util.Objects

@Entity
@Table(name = "sub_task", schema = "selfdb", catalog = "")
class SubTask {
    @Id
    @Column(name = "sub_task_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var subTaskId: Int? = null
    @Basic
    @Column(name = "sub_task_name")
    var subTaskName: String? = null
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
    @Column(name = "ext2")
    @Basic(fetch = FetchType.LAZY)
    var ext2: String? = null
    @ManyToOne
    @JoinColumn(name = "task_id")
    var task: Task? = null
    @OneToMany(mappedBy = "subTask")
    var noteList: List<Note>? = null
}
