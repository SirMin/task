package com.min.task.controller;

import com.min.task.model.Task;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("task")
public class TaskController {
    @RequestMapping
    public Task list() {
        return new Task(1, "学些", 99);
    }

}
