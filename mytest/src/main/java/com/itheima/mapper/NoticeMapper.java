package com.itheima.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.itheima.pojo.Notice;

@Mapper
public interface NoticeMapper {
	@Select("SELECT * FROM notice")
	public List<Notice> findAll();
	
	// 分页查询数据
	public List<Notice> findByPage(@Param("start")Integer page,@Param("size")Integer size); 
	
	// 统计
	public Long count();
}
