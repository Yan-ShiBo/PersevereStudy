package com.com.swu.mic.micfamily.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.com.swu.mic.micfamily.domain.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoomDao extends BaseMapper<Room> {
    @Select("select * from Room where Room_name like #{RoomName}")
    List<Room> getByName(@Param("RoomName") String RoomName);

    @Select("select * from Room limit #{pageNum},#{pageSize}")
    List<Room> selectPages(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

    @Select("select count(*) from Room")
    int selectCount();

}
