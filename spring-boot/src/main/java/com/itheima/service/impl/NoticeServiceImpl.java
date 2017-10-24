package com.itheima.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.mapper.NoticeMapper;
import com.itheima.pojo.Notice;
import com.itheima.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}

	@Override
	public List<Notice> findByPage(Integer page, Integer rows) {
		return noticeMapper.findByPage((page - 1) * rows, rows);
	}

	@Override
	public Long count() {
		return noticeMapper.count();
	}
	
}
