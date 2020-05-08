package com.jdevil.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository(value = "testMapper")
public interface TestMapper {
	public String selectNow() throws Exception; 
}
