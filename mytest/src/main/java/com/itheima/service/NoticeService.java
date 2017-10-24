package com.itheima.service;

import java.util.List;

import com.itheima.pojo.Notice;

public interface NoticeService {
	public List<Notice> findAll();

	public List<Notice> findByPage(Integer page, Integer rows);

	public Long count();
}
