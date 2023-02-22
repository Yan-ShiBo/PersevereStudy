
/*
 * Copyright (c) Yan ShiBo . 2023-2023. All rights reserved.
 */

package com.com.swu.PersevereStudy.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ 作者： 闫士博
 * @ 日期： 2023/2/22 星期三 10:43
 * @ package name： com.com.swu.PersevereStudy.domain
 * @ Project name： PersevereStudy
 * @ Description：
 */
@TableName("user")
@Data
public class User {
    @TableId("id")
    private Integer id;
    private String uname;

    private String upassword;

    private boolean utype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public boolean isUtype() {
        return utype;
    }

    public void setUtype(boolean utype) {
        this.utype = utype;
    }
}
