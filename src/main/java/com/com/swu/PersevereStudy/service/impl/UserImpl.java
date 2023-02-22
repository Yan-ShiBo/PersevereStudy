
/*
 * Copyright (c) Yan ShiBo . 2023-2023. All rights reserved.
 */

package com.com.swu.PersevereStudy.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.com.swu.PersevereStudy.dao.UserDao;
import com.com.swu.PersevereStudy.domain.User;
import com.com.swu.PersevereStudy.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ 作者： 闫士博
 * @ 日期： 2023/2/22 星期三 10:59
 * @ package name： com.com.swu.PersevereStudy.service.impl
 * @ Project name： PersevereStudy
 * @ Description：
 */
@Service
public class UserImpl extends ServiceImpl<UserDao, User> implements UserService {

}