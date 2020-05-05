package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PlfXiaoxiMapper;
import com.ruoyi.system.domain.PlfXiaoxi;
import com.ruoyi.system.service.IPlfXiaoxiService;
import com.ruoyi.common.core.text.Convert;

/**
 * 服务消息Service业务层处理
 * 
 * @author openhit
 * @date 2020-05-05
 */
@Service
public class PlfXiaoxiServiceImpl implements IPlfXiaoxiService 
{
    @Autowired
    private PlfXiaoxiMapper plfXiaoxiMapper;

    /**
     * 查询服务消息
     * 
     * @param xiaoxiid 服务消息ID
     * @return 服务消息
     */
    @Override
    public PlfXiaoxi selectPlfXiaoxiById(String xiaoxiid)
    {
        return plfXiaoxiMapper.selectPlfXiaoxiById(xiaoxiid);
    }

    /**
     * 查询服务消息列表
     * 
     * @param plfXiaoxi 服务消息
     * @return 服务消息
     */
    @Override
    public List<PlfXiaoxi> selectPlfXiaoxiList(PlfXiaoxi plfXiaoxi)
    {
        return plfXiaoxiMapper.selectPlfXiaoxiList(plfXiaoxi);
    }

    /**
     * 新增服务消息
     * 
     * @param plfXiaoxi 服务消息
     * @return 结果
     */
    @Override
    public int insertPlfXiaoxi(PlfXiaoxi plfXiaoxi)
    {
        return plfXiaoxiMapper.insertPlfXiaoxi(plfXiaoxi);
    }

    /**
     * 修改服务消息
     * 
     * @param plfXiaoxi 服务消息
     * @return 结果
     */
    @Override
    public int updatePlfXiaoxi(PlfXiaoxi plfXiaoxi)
    {
        return plfXiaoxiMapper.updatePlfXiaoxi(plfXiaoxi);
    }

    /**
     * 删除服务消息对象
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
     * 删除服务消息信息
     * 
     * @param xiaoxiid 服务消息ID
     * @return 结果
     */
    @Override
    public int deletePlfXiaoxiById(String xiaoxiid)
    {
        return plfXiaoxiMapper.deletePlfXiaoxiById(xiaoxiid);
    }
}
