package com.min.task.model.db.entity

import java.util.Objects
import javax.persistence.*

@Entity
class Note {
    @Id
    @Column(name = "note_id")
    var noteId: Int? = null
    @Basic
    @Column(name = "note_name")
    var noteName: String? = null
    @Basic
    @Column(name = "description")
    var description: String? = null
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "markdown_code")
    var markdownCode: String? = null
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ext1")
    var ext1: String? = null
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ext2")
    var ext2: String? = null
    @ManyToOne
    @JoinColumn(name = "sub_task_id")
    var subTask: SubTask? = null
}
