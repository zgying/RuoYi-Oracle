package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PlfXiaoxiMapper;
import com.ruoyi.system.domain.PlfXiaoxi;
import com.ruoyi.system.service.IPlfXiaoxiService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-04-14
 */
@Service
public class PlfXiaoxiServiceImpl implements IPlfXiaoxiService 
{
    @Autowired
    private PlfXiaoxiMapper plfXiaoxiMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param xiaoxiid 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public PlfXiaoxi selectPlfXiaoxiById(String xiaoxiid)
    {
        return plfXiaoxiMapper.selectPlfXiaoxiById(xiaoxiid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param plfXiaoxi 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<PlfXiaoxi> selectPlfXiaoxiList(PlfXiaoxi plfXiaoxi)
    {
        return plfXiaoxiMapper.selectPlfXiaoxiList(plfXiaoxi);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param plfXiaoxi 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertPlfXiaoxi(PlfXiaoxi plfXiaoxi)
    {
        return plfXiaoxiMapper.insertPlfXiaoxi(plfXiaoxi);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param plfXiaoxi 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updatePlfXiaoxi(PlfXiaoxi plfXiaoxi)
    {
        return plfXiaoxiMapper.updatePlfXiaoxi(plfXiaoxi);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePlfXiaoxiByIds(String ids)
    {
        return plfXiaoxiMapper.deletePlfXiaoxiByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param xiaoxiid 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deletePlfXiaoxiById(String xiaoxiid)
    {
        return plfXiaoxiMapper.deletePlfXiaoxiById(xiaoxiid);
    }
}
