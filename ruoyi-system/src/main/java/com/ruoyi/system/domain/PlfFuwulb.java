package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 服务列对象 plf_fuwulb
 * 
 * @author openhit
 * @date 2020-05-03
 */
public class PlfFuwulb extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 应用ID */
    @Excel(name = "应用ID")
    private String yingyongid;

    /** 服务ID */
    @Excel(name = "服务ID")
    private String fuwuid;

    /** 服务名称 */
    @Excel(name = "服务名称")
    private String fuwumc;

    /** 接口类型 SOAP Resuful */
    @Excel(name = "接口类型 SOAP Resuful")
    private String jiekoulx;

    /** 请求地址　 */
    @Excel(name = "请求地址　")
    private String qingqiudz;

    /** 请求端口 */
    @Excel(name = "请求端口")
    private Long qingqiudk;

    /** 请求路径 */
    @Excel(name = "请求路径")
    private String qingqiujl;

    /** 请求方式 GET　 */
    @Excel(name = "请求方式 GET　")
    private String qinqiuff;

    /** 请求参数 */
    @Excel(name = "请求参数")
    private String qinqiucs;

    /** 请求参数说明 */
    @Excel(name = "请求参数说明")
    private String qingqiucssm;

    /** 返回值 */
    @Excel(name = "返回值")
    private String fanhuizhi;

    /** 返回值说明 */
    @Excel(name = "返回值说明")
    private String fanhuizhism;

    /** 服务状态 0 正常 */
    @Excel(name = "服务状态 0 正常")
    private Long fuwuzt;

    /** 停用标志 */
    @Excel(name = "停用标志")
    private Long tingyongbz;

    /** 上线时间 */
    @Excel(name = "上线时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date shangxiansj;

    /** 备注说明 */
    @Excel(name = "备注说明")
    private String beizhu;

    public void setYingyongid(String yingyongid) 
    {
        this.yingyongid = yingyongid;
    }

    public String getYingyongid() 
    {
        return yingyongid;
    }
    public void setFuwuid(String fuwuid) 
    {
        this.fuwuid = fuwuid;
    }

    public String getFuwuid() 
    {
        return fuwuid;
    }
    public void setFuwumc(String fuwumc) 
    {
        this.fuwumc = fuwumc;
    }

    public String getFuwumc() 
    {
        return fuwumc;
    }
    public void setJiekoulx(String jiekoulx) 
    {
        this.jiekoulx = jiekoulx;
    }

    public String getJiekoulx() 
    {
        return jiekoulx;
    }
    public void setQingqiudz(String qingqiudz) 
    {
        this.qingqiudz = qingqiudz;
    }

    public String getQingqiudz() 
    {
        return qingqiudz;
    }
    public void setQingqiudk(Long qingqiudk) 
    {
        this.qingqiudk = qingqiudk;
    }

    public Long getQingqiudk() 
    {
        return qingqiudk;
    }
    public void setQingqiujl(String qingqiujl) 
    {
        this.qingqiujl = qingqiujl;
    }

    public String getQingqiujl() 
    {
        return qingqiujl;
    }
    public void setQinqiuff(String qinqiuff) 
    {
        this.qinqiuff = qinqiuff;
    }

    public String getQinqiuff() 
    {
        return qinqiuff;
    }
    public void setQinqiucs(String qinqiucs) 
    {
        this.qinqiucs = qinqiucs;
    }

    public String getQinqiucs() 
    {
        return qinqiucs;
    }
    public void setQingqiucssm(String qingqiucssm) 
    {
        this.qingqiucssm = qingqiucssm;
    }

    public String getQingqiucssm() 
    {
        return qingqiucssm;
    }
    public void setFanhuizhi(String fanhuizhi) 
    {
        this.fanhuizhi = fanhuizhi;
    }

    public String getFanhuizhi() 
    {
        return fanhuizhi;
    }
    public void setFanhuizhism(String fanhuizhism) 
    {
        this.fanhuizhism = fanhuizhism;
    }

    public String getFanhuizhism() 
    {
        return fanhuizhism;
    }
    public void setFuwuzt(Long fuwuzt) 
    {
        this.fuwuzt = fuwuzt;
    }

    public Long getFuwuzt() 
    {
        return fuwuzt;
    }
    public void setTingyongbz(Long tingyongbz) 
    {
        this.tingyongbz = tingyongbz;
    }

    public Long getTingyongbz() 
    {
        return tingyongbz;
    }
    public void setShangxiansj(Date shangxiansj) 
    {
        this.shangxiansj = shangxiansj;
    }

    public Date getShangxiansj() 
    {
        return shangxiansj;
    }
    public void setBeizhu(String beizhu) 
    {
        this.beizhu = beizhu;
    }

    public String getBeizhu() 
    {
        return beizhu;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("yingyongid", getYingyongid())
            .append("fuwuid", getFuwuid())
            .append("fuwumc", getFuwumc())
            .append("jiekoulx", getJiekoulx())
            .append("qingqiudz", getQingqiudz())
            .append("qingqiudk", getQingqiudk())
            .append("qingqiujl", getQingqiujl())
            .append("qinqiuff", getQinqiuff())
            .append("qinqiucs", getQinqiucs())
            .append("qingqiucssm", getQingqiucssm())
            .append("fanhuizhi", getFanhuizhi())
            .append("fanhuizhism", getFanhuizhism())
            .append("fuwuzt", getFuwuzt())
            .append("tingyongbz", getTingyongbz())
            .append("shangxiansj", getShangxiansj())
            .append("beizhu", getBeizhu())
            .toString();
    }
}
