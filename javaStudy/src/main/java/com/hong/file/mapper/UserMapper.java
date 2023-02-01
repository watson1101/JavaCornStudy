package com.hong.file.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hong.file.entity.UserEntity;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

    @Select("select * from test_user")
    List<UserEntity> selectAll();

}
