package com.mk.demo.service.controller;

import com.mk.demo.service.model.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shisong
 * @since 2019-02-18
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * 注册
     */
    @RequestMapping(value = "/checkToken.api")
    public BaseResponse checkToken(String token) {
        return BaseResponse.getSuccessResponse();
    }

}
