package com.todoApp.demo.controllers;

import com.todoApp.demo.TaskConfigurationProperties;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    private DataSourceProperties dataSource;
    private TaskConfigurationProperties myProp;

    public InfoController(DataSourceProperties dataSource, TaskConfigurationProperties myProp) {
        this.dataSource = dataSource;
        this.myProp = myProp;
    }

    @GetMapping("info/url")
    public String getUrl() {
        return dataSource.getUrl();
    }
    @GetMapping("/info/prop")
    public boolean getMyProp() {
        return myProp.getTemplate().isAllowMultipleTasks();
    }
}
