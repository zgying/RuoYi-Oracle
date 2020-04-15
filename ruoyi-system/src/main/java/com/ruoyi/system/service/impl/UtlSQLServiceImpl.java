package com.ruoyi.system.service.impl;


import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UtlSQLMapper;
import com.ruoyi.system.service.IUtlSQLService;


@Service
public class UtlSQLServiceImpl implements IUtlSQLService {

	 @Autowired
	 private UtlSQLMapper utlSQLMapper;
	 
	 @Override
	 public List<LinkedHashMap<String,Object>> superSelect( String sqlStr) {
		return utlSQLMapper.superSelect(sqlStr);
	}

}
