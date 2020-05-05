package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PlfYingyongMapper;
import com.ruoyi.system.domain.PlfYingyong;
import com.ruoyi.system.service.IPlfYingyongService;
import com.ruoyi.common.core.text.Convert;

/**
 * 应用系统Service业务层处理
 * 
 * @author open hit
 * @date 2020-05-03
 */
@Service
public class PlfYingyongServiceImpl implements IPlfYingyongService 
{
    @Autowired
    private PlfYingyongMapper plfYingyongMapper;

    /**
     * 查询应用系统
     * 
     * @param yingyongid 应用系统ID
     * @return 应用系统
     */
    @Override
    public PlfYingyong selectPlfYingyongById(String yingyongid)
    {
        return plfYingyongMapper.selectPlfYingyongById(yingyongid);
    }

    /**
     * 查询应用系统列表
     * 
     * @param plfYingyong 应用系统
     * @return 应用系统
     */
    @Override
    public List<PlfYingyong> selectPlfYingyongList(PlfYingyong plfYingyong)
    {
        return plfYingyongMapper.selectPlfYingyongList(plfYingyong);
    }

    /**
     * 新增应用系统
     * 
     * @param plfYingyong 应用系统
     * @return 结果
     */
    @Override
    public int insertPlfYingyong(PlfYingyong plfYingyong)
    {
        return plfYingyongMapper.insertPlfYingyong(plfYingyong);
    }

    /**
     * 修改应用系统
     * 
     * @param plfYingyong 应用系统
     * @return 结果
     */
    @Override
    public int updatePlfYingyong(PlfYingyong plfYingyong)
    {
        return plfYingyongMapper.updatePlfYingyong(plfYingyong);
    }

    /**
     * 删除应用系统对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePlfYingyongByIds(String ids)
    {
        return plfYingyongMapper.deletePlfYingyongByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除应用系统信息
     * 
     * @param yingyongid 应用系统ID
     * @return 结果
     */
    @Override
    public int deletePlfYingyongById(String yingyongid)
    {
        return plfYingyongMapper.deletePlfYingyongById(yingyongid);
    }
}
