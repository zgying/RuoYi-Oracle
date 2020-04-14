package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.PlfYingyong;

/**
 * 应用列Service接口
 * 
 * @author yingzhongguang
 * @date 2020-04-13
 */
public interface IPlfYingyongService 
{
    /**
     * 查询应用列
     * 
     * @param yingyongid 应用列ID
     * @return 应用列
     */
    public PlfYingyong selectPlfYingyongById(String yingyongid);

    /**
     * 查询应用列列表
     * 
     * @param plfYingyong 应用列
     * @return 应用列集合
     */
    public List<PlfYingyong> selectPlfYingyongList(PlfYingyong plfYingyong);

    /**
     * 新增应用列
     * 
     * @param plfYingyong 应用列
     * @return 结果
     */
    public int insertPlfYingyong(PlfYingyong plfYingyong);

    /**
     * 修改应用列
     * 
     * @param plfYingyong 应用列
     * @return 结果
     */
    public int updatePlfYingyong(PlfYingyong plfYingyong);

    /**
     * 批量删除应用列
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePlfYingyongByIds(String ids);

    /**
     * 删除应用列信息
     * 
     * @param yingyongid 应用列ID
     * @return 结果
     */
    public int deletePlfYingyongById(String yingyongid);
}
