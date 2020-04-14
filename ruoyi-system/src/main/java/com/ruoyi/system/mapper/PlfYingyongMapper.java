package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.PlfYingyong;

/**
 * 应用列Mapper接口
 * 
 * @author ruoyi
 * @date 2020-04-14
 */
public interface PlfYingyongMapper 
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
     * 删除应用列
     * 
     * @param yingyongid 应用列ID
     * @return 结果
     */
    public int deletePlfYingyongById(String yingyongid);

    /**
     * 批量删除应用列
     * 
     * @param yingyongids 需要删除的数据ID
     * @return 结果
     */
    public int deletePlfYingyongByIds(String[] yingyongids);
}
