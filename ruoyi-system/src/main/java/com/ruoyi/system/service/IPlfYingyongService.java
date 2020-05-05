package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.PlfYingyong;

/**
 * 应用系统Service接口
 * 
 * @author open hit
 * @date 2020-05-03
 */
public interface IPlfYingyongService 
{
    /**
     * 查询应用系统
     * 
     * @param yingyongid 应用系统ID
     * @return 应用系统
     */
    public PlfYingyong selectPlfYingyongById(String yingyongid);

    /**
     * 查询应用系统列表
     * 
     * @param plfYingyong 应用系统
     * @return 应用系统集合
     */
    public List<PlfYingyong> selectPlfYingyongList(PlfYingyong plfYingyong);

    /**
     * 新增应用系统
     * 
     * @param plfYingyong 应用系统
     * @return 结果
     */
    public int insertPlfYingyong(PlfYingyong plfYingyong);

    /**
     * 修改应用系统
     * 
     * @param plfYingyong 应用系统
     * @return 结果
     */
    public int updatePlfYingyong(PlfYingyong plfYingyong);

    /**
     * 批量删除应用系统
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePlfYingyongByIds(String ids);

    /**
     * 删除应用系统信息
     * 
     * @param yingyongid 应用系统ID
     * @return 结果
     */
    public int deletePlfYingyongById(String yingyongid);
}
