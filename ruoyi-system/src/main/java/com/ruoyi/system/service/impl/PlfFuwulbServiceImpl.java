package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PlfFuwulbMapper;
import com.ruoyi.system.domain.PlfFuwulb;
import com.ruoyi.system.service.IPlfFuwulbService;
import com.ruoyi.common.core.text.Convert;

/**
 * 服务列Service业务层处理
 * 
 * @author openhit
 * @date 2020-05-03
 */
@Service
public class PlfFuwulbServiceImpl implements IPlfFuwulbService 
{
    @Autowired
    private PlfFuwulbMapper plfFuwulbMapper;

    /**
     * 查询服务列
     * 
     * @param fuwuid 服务列ID
     * @return 服务列
     */
    @Override
    public PlfFuwulb selectPlfFuwulbById(String fuwuid)
    {
        return plfFuwulbMapper.selectPlfFuwulbById(fuwuid);
    }

    /**
     * 查询服务列列表
     * 
     * @param plfFuwulb 服务列
     * @return 服务列
     */
    @Override
    public List<PlfFuwulb> selectPlfFuwulbList(PlfFuwulb plfFuwulb)
    {
        return plfFuwulbMapper.selectPlfFuwulbList(plfFuwulb);
    }

    /**
     * 新增服务列
     * 
     * @param plfFuwulb 服务列
     * @return 结果
     */
    @Override
    public int insertPlfFuwulb(PlfFuwulb plfFuwulb)
    {
        return plfFuwulbMapper.insertPlfFuwulb(plfFuwulb);
    }

    /**
     * 修改服务列
     * 
     * @param plfFuwulb 服务列
     * @return 结果
     */
    @Override
    public int updatePlfFuwulb(PlfFuwulb plfFuwulb)
    {
        return plfFuwulbMapper.updatePlfFuwulb(plfFuwulb);
    }

    /**
     * 删除服务列对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePlfFuwulbByIds(String ids)
    {
        return plfFuwulbMapper.deletePlfFuwulbByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除服务列信息
     * 
     * @param fuwuid 服务列ID
     * @return 结果
     */
    @Override
    public int deletePlfFuwulbById(String fuwuid)
    {
        return plfFuwulbMapper.deletePlfFuwulbById(fuwuid);
    }
}
