package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.PlfXiaoxi;

/**
 * 服务消息Service接口
 * 
 * @author openhit
 * @date 2020-05-05
 */
public interface IPlfXiaoxiService 
{
    /**
     * 查询服务消息
     * 
     * @param xiaoxiid 服务消息ID
     * @return 服务消息
     */
    public PlfXiaoxi selectPlfXiaoxiById(String xiaoxiid);

    /**
     * 查询服务消息列表
     * 
     * @param plfXiaoxi 服务消息
     * @return 服务消息集合
     */
    public List<PlfXiaoxi> selectPlfXiaoxiList(PlfXiaoxi plfXiaoxi);

    /**
     * 新增服务消息
     * 
     * @param plfXiaoxi 服务消息
     * @return 结果
     */
    public int insertPlfXiaoxi(PlfXiaoxi plfXiaoxi);

    /**
     * 修改服务消息
     * 
     * @param plfXiaoxi 服务消息
     * @return 结果
     */
    public int updatePlfXiaoxi(PlfXiaoxi plfXiaoxi);

    /**
     * 批量删除服务消息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePlfXiaoxiByIds(String ids);

    /**
     * 删除服务消息信息
     * 
     * @param xiaoxiid 服务消息ID
     * @return 结果
     */
    public int deletePlfXiaoxiById(String xiaoxiid);
}
