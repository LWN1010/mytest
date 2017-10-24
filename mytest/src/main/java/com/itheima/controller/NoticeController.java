package com.itheima.controller;

import static org.mockito.Matchers.notNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.pojo.Notice;
import com.itheima.service.NoticeService;

@Controller
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	
	// http://127.0.0.2:8888/boot/notice.do
	@GetMapping("/notice")
	public String skipNoticeHtml() {
		return "/html/notice.html";
	}
	
	@PostMapping("/findByPage")
	@ResponseBody
	public Map<String, Object> findByPage(@RequestParam("page")Integer page, @RequestParam("rows")Integer rows) {
		List<Notice> notices = noticeService.findByPage(page,rows);
		Long total = noticeService.count();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		// 响应数据格式需要为：{"total" : 10, "rows" : [{"id":1,"title":"","content" : ""},{}]}
		
		map.put("total", total);
		map.put("rows", notices);
		return map;
	}
}























