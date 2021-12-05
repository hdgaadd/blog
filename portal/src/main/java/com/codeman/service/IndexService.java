package com.codeman.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.domain.User;
import com.codeman.entity.IndexResult;

public interface IndexService extends IService<User> {
    IndexResult index(User user);
}
