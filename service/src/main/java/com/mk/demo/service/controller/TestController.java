package com.mk.demo.service.controller;

import com.mk.demo.service.model.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author song.shi
 * @since 2018-07-11
 */
@RestController
@RequestMapping(value = "/test/")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    /**
     * 测试首页
     */
    @RequestMapping(value = "index.htm")
    public BaseResponse home() {
        return BaseResponse.getSuccessResponse("返回中文不乱码");
    }

    /**
     * 测试首页
     */
    @PostMapping(value = "index.api")
    public BaseResponse api() {
        logger.info("这里是index.api");
        return BaseResponse.getSuccessResponse();
    }

}
