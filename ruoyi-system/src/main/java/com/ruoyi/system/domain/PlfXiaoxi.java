package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 【请填写功能名称】对象 plf_xiaoxi
 * 
 * @author ruoyi
 * @date 2020-04-14
 */
public class PlfXiaoxi extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 消息ID */
    private String xiaoxiid;

    /** 发送服务 */
    @Excel(name = "发送服务")
    private String fasongfw;

    /** 发送时间 */
    @Excel(name = "发送时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fasongsj;

    /** 消息内容 */
    @Excel(name = "消息内容")
    private String xiaoxinr;

    /** 接收服务 */
    @Excel(name = "接收服务")
    private String jieshoufw;

    /** 接收时间 */
    @Excel(name = "接收时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jieshousj;

    /** 记录时间 */
    @Excel(name = "记录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jilusj;

    /** 记录来源 */
    @Excel(name = "记录来源")
    private String jiluly;

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
            .toString();
    }
}
