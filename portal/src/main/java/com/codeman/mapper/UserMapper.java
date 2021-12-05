package com.codeman.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.codeman.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
