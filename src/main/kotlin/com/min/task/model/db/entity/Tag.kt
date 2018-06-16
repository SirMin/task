package com.min.task.model.db.entity

import javax.persistence.*

@Entity
class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag_id")
    var tagId: Int = 0
    @Basic
    @Column(name = "tag_name")
    var tagName: String? = null
    @Basic
    @Column(name = "descritpion")
    var descritpion: String? = null
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ext1")
    var ext1: String? = null
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ext2")
    var ext2: String? = null
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="task_tag",
            joinColumns = [JoinColumn(name="tag_id")],
            inverseJoinColumns = [(JoinColumn(name = "task_id"))]
    )
    var taskList: List<Task> ?= null
}
