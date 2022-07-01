package com.ccrt6.mapper;

import com.ccrt6.bean.Userinfo;

/**
 * @author zh
 * @Title: mapper
 * @Package com.ccrt6.mapper
 * @Description:接口
 * @date 2022/6/28/20:32
 */
public interface UserMapper {
    Userinfo findUserById(int id);
}
