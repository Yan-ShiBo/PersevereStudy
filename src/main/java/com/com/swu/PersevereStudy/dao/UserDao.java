
/*
 * Copyright (c) Yan ShiBo . 2023-2023. All rights reserved.
 */

package com.com.swu.PersevereStudy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.com.swu.PersevereStudy.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @ 作者： 闫士博
 * @ 日期： 2023/2/22 星期三 10:57
 * @ package name： com.com.swu.PersevereStudy.dao
 * @ Project name： PersevereStudy
 * @ Description：
 */
@Component
@Mapper
public interface UserDao extends BaseMapper<User> {


}