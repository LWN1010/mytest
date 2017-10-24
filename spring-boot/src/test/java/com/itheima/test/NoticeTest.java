package com.itheima.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.Application;
import com.itheima.mapper.NoticeMapper;
import com.itheima.pojo.Notice;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class NoticeTest {
	@Autowired
	private NoticeMapper noticeMapper;
	
	@Test
	public void findAllTest() {
		System.out.println(noticeMapper.count());
		
		List<Notice> notices = noticeMapper.findByPage(0, 5);
		for (Notice notice : notices) {
			System.out.println(notice.getContent());
		}
	}
}
