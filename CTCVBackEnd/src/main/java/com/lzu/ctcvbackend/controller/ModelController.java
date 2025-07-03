package com.lzu.ctcvbackend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lzu.ctcvbackend.Pojo.Result;

@RestController
@RequestMapping("/model")
public class ModelController {
    @RequestMapping("/ImageRepair")
    public Result<Object> imageRepair() {
        // 方法体为空
        return null;
    }

    @RequestMapping("/StyleTransfer")
    public Result<Object> styleTransfer() {
        // 方法体为空
        return null;
    }
} 