package com.codeman.controller;

import com.codeman.domain.User;
import com.codeman.entity.IndexResult;
import com.codeman.service.IndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags="swagger-ui测试")
@RestController
public class IndexController {

    @Resource
    private IndexService userService;

    @GetMapping("/index")
    @ApiOperation("测试url")
    public IndexResult index(User user) {
        IndexResult result = userService.index(user);
        return result;
    }
}
