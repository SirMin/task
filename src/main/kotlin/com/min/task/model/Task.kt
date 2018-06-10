package com.min.task.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Task(
        /**
         * 任务id，与数据库主键一一对应
         */
        @JsonProperty("taskId")
        val taskId: Int,
        /**
         * 任务名称
         */
        @JsonProperty("taskName")
        val taskName: String,
        /**
         * 任务完成度
         */
        @JsonProperty("degreeOfCompletionException")
        val degreeOfCompletion: Double
)
