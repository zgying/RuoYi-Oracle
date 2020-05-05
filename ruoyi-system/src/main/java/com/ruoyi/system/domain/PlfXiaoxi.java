package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 服务消息对象 plf_xiaoxi
 * 
 * @author openhit
 * @date 2020-05-05
 */
public class PlfXiaoxi extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 消息ID */
    @Excel(name = "消息ID")
    private String xiaoxiid;

    /** 发送应用 */
    @Excel(name = "发送应用")
    private String fasongfw;

    /** 发送时间 */
    @Excel(name = "发送时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fasongsj;

    /** 消息内容 */
    @Excel(name = "消息内容")
    private String xiaoxinr;

    /** 接收应用 */
    @Excel(name = "接收应用")
    private String jieshoufw;

    /** 接收时间 */
    @Excel(name = "接收时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jieshousj;

    /** 记录时间 */
    private Date jilusj;

    /** 记录来源 */
    private String jiluly;

    /** 触发事件 */
    @Excel(name = "触发事件")
    private String chufasj;

    /** 节点new ack listen */
    @Excel(name = "节点")
    private String jiedian;

    /** 消息结果 */
    @Excel(name = "消息结果")
    private String jieguo;

    /** 消息流ID */
    @Excel(name = "消息流ID")
    private String xiaoxiliu;

    public void setXiaoxiid(String xiaoxiid) 
    {
        this.xiaoxiid = xiaoxiid;
    }

    public String getXiaoxiid() 
    {
        return xiaoxiid;
    }
    public void setFasongfw(String fasongfw) 
    {
        this.fasongfw = fasongfw;
    }

    public String getFasongfw() 
    {
        return fasongfw;
    }
    public void setFasongsj(Date fasongsj) 
    {
        this.fasongsj = fasongsj;
    }

    public Date getFasongsj() 
    {
        return fasongsj;
    }
    public void setXiaoxinr(String xiaoxinr) 
    {
        this.xiaoxinr = xiaoxinr;
    }

    public String getXiaoxinr() 
    {
        return xiaoxinr;
    }
    public void setJieshoufw(String jieshoufw) 
    {
        this.jieshoufw = jieshoufw;
    }

    public String getJieshoufw() 
    {
        return jieshoufw;
    }
    public void setJieshousj(Date jieshousj) 
    {
        this.jieshousj = jieshousj;
    }

    public Date getJieshousj() 
    {
        return jieshousj;
    }
    public void setJilusj(Date jilusj) 
    {
        this.jilusj = jilusj;
    }

    public Date getJilusj() 
    {
        return jilusj;
    }
    public void setJiluly(String jiluly) 
    {
        this.jiluly = jiluly;
    }

    public String getJiluly() 
    {
        return jiluly;
    }
    public void setChufasj(String chufasj) 
    {
        this.chufasj = chufasj;
    }

    public String getChufasj() 
    {
        return chufasj;
    }
    public void setJiedian(String jiedian) 
    {
        this.jiedian = jiedian;
    }

    public String getJiedian() 
    {
        return jiedian;
    }
    public void setJieguo(String jieguo) 
    {
        this.jieguo = jieguo;
    }

    public String getJieguo() 
    {
        return jieguo;
    }
    public void setXiaoxiliu(String xiaoxiliu) 
    {
        this.xiaoxiliu = xiaoxiliu;
    }

    public String getXiaoxiliu() 
    {
        return xiaoxiliu;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("xiaoxiid", getXiaoxiid())
            .append("fasongfw", getFasongfw())
            .append("fasongsj", getFasongsj())
            .append("xiaoxinr", getXiaoxinr())
            .append("jieshoufw", getJieshoufw())
            .append("jieshousj", getJieshousj())
            .append("jilusj", getJilusj())
            .append("jiluly", getJiluly())
            .append("chufasj", getChufasj())
            .append("jiedian", getJiedian())
            .append("jieguo", getJieguo())
            .append("xiaoxiliu", getXiaoxiliu())
            .toString();
    }
}
