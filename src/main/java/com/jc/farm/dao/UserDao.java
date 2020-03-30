package com.jc.farm.dao;

import com.jc.farm.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @Desc
 * @Author LinXing
 * @Date 2020/3/16 9:30
 * @Version 1.0
 */
@Mapper
public interface UserDao {
    User getUser(String username);
}
