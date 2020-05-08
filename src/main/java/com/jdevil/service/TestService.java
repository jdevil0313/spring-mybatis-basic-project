package com.jdevil.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service(value = "testService")
public class TestService {
	@Resource(name = "testMapper")
	private TestMapper testMapper;
	
	public String selectNow() throws Exception {
		return testMapper.selectNow();
	}
}
