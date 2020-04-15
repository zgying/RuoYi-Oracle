package com.ruoyi.system.service;

import org.apache.ibatis.annotations.Param;
import java.util.LinkedHashMap;
import java.util.List;
/**
 * @description:
 * @author: yingzhongguang
 * @date: 2019/7/12
 */
public interface IUtlSQLService {
   
    public List<LinkedHashMap<String,Object>> superSelect(String sqlStr);
}