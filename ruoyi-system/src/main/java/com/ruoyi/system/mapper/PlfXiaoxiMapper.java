package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.PlfXiaoxi;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-04-14
 */
public interface PlfXiaoxiMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param xiaoxiid 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public PlfXiaoxi selectPlfXiaoxiById(String xiaoxiid);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param plfXiaoxi 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<PlfXiaoxi> selectPlfXiaoxiList(PlfXiaoxi plfXiaoxi);

    /**
     * 新增【请填写功能名称】
     * 
     * @param plfXiaoxi 【请填写功能名称】
     * @return 结果
     */
    public int insertPlfXiaoxi(PlfXiaoxi plfXiaoxi);

    /**
     * 修改【请填写功能名称】
     * 
     * @param plfXiaoxi 【请填写功能名称】
     * @return 结果
     */
    public int updatePlfXiaoxi(PlfXiaoxi plfXiaoxi);

    /**
     * 删除【请填写功能名称】
     * 
     * @param xiaoxiid 【请填写功能名称】ID
     * @return 结果
     */
    public int deletePlfXiaoxiById(String xiaoxiid);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param xiaoxiids 需要删除的数据ID
     * @return 结果
     */
    public int deletePlfXiaoxiByIds(String[] xiaoxiids);
}
