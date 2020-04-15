package com.ruoyi.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.LinkedHashMap;
import java.util.List;
/**
 * @description:
 * @author: yingzhongguang
 * @date: 2019/7/12
 */
@Mapper
public interface UtlSQLMapper {
    
    List<LinkedHashMap<String,Object>> superSelect( String sqlStr);
}