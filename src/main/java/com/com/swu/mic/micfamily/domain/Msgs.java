package com.com.swu.mic.micfamily.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("msgs")
@Data
public class Msgs {
    private Integer msgsId;
    private String msgsCont;
    private Integer type;

    public Integer getMsgsId() {
        return msgsId;
    }

    public void setMsgsId(Integer msgsId) {
        this.msgsId = msgsId;
    }

    public String getMsgsCont() {
        return msgsCont;
    }

    public void setMsgsCont(String msgsCont) {
        this.msgsCont = msgsCont;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}