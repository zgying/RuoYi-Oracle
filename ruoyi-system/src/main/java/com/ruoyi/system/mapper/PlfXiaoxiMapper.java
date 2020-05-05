package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.PlfXiaoxi;

/**
 * 服务消息Mapper接口
 * 
 * @author openhit
 * @date 2020-05-05
 */
public interface PlfXiaoxiMapper 
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
     * 删除服务消息
     * 
     * @param xiaoxiid 服务消息ID
     * @return 结果
     */
    public int deletePlfXiaoxiById(String xiaoxiid);

    /**
     * 批量删除服务消息
     * 
     * @param xiaoxiids 需要删除的数据ID
     * @return 结果
     */
    public int deletePlfXiaoxiByIds(String[] xiaoxiids);
}
