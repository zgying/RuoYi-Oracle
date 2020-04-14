package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.PlfFuwulb;

/**
 * 服务列Mapper接口
 * 
 * @author ruoyi
 * @date 2020-04-14
 */
public interface PlfFuwulbMapper 
{
    /**
     * 查询服务列
     * 
     * @param fuwuid 服务列ID
     * @return 服务列
     */
    public PlfFuwulb selectPlfFuwulbById(String fuwuid);

    /**
     * 查询服务列列表
     * 
     * @param plfFuwulb 服务列
     * @return 服务列集合
     */
    public List<PlfFuwulb> selectPlfFuwulbList(PlfFuwulb plfFuwulb);

    /**
     * 新增服务列
     * 
     * @param plfFuwulb 服务列
     * @return 结果
     */
    public int insertPlfFuwulb(PlfFuwulb plfFuwulb);

    /**
     * 修改服务列
     * 
     * @param plfFuwulb 服务列
     * @return 结果
     */
    public int updatePlfFuwulb(PlfFuwulb plfFuwulb);

    /**
     * 删除服务列
     * 
     * @param fuwuid 服务列ID
     * @return 结果
     */
    public int deletePlfFuwulbById(String fuwuid);

    /**
     * 批量删除服务列
     * 
     * @param fuwuids 需要删除的数据ID
     * @return 结果
     */
    public int deletePlfFuwulbByIds(String[] fuwuids);
}
