package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 应用系统对象 plf_yingyong
 * 
 * @author open hit
 * @date 2020-05-03
 */
public class PlfYingyong extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 应用ID */
    private String yingyongid;

    /** 名称 */
    @Excel(name = "名称")
    private String mingcheng;

    /** 内容 */
    @Excel(name = "内容")
    private String neirong;

    /** 厂家 */
    @Excel(name = "厂家")
    private String changjia;

    /** 服务状态 0 停止 1 启动 */
    @Excel(name = "服务状态 0 停止 1 启动")
    private Long zhuangtai;

    /** 上线时间 */
    @Excel(name = "上线时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date shangxiansj;

    /** 上线服务数 */
    @Excel(name = "上线服务数")
    private Long shangxianfw;

    /** 停用标志 */
    @Excel(name = "停用标志")
    private Long tingyongbz;

    /** 备注说明 */
    @Excel(name = "备注说明")
    private String beizhusm;

    public void setYingyongid(String yingyongid) 
    {
        this.yingyongid = yingyongid;
    }

    public String getYingyongid() 
    {
        return yingyongid;
    }
    public void setMingcheng(String mingcheng) 
    {
        this.mingcheng = mingcheng;
    }

    public String getMingcheng() 
    {
        return mingcheng;
    }
    public void setNeirong(String neirong) 
    {
        this.neirong = neirong;
    }

    public String getNeirong() 
    {
        return neirong;
    }
    public void setChangjia(String changjia) 
    {
        this.changjia = changjia;
    }

    public String getChangjia() 
    {
        return changjia;
    }
    public void setZhuangtai(Long zhuangtai) 
    {
        this.zhuangtai = zhuangtai;
    }

    public Long getZhuangtai() 
    {
        return zhuangtai;
    }
    public void setShangxiansj(Date shangxiansj) 
    {
        this.shangxiansj = shangxiansj;
    }

    public Date getShangxiansj() 
    {
        return shangxiansj;
    }
    public void setShangxianfw(Long shangxianfw) 
    {
        this.shangxianfw = shangxianfw;
    }

    public Long getShangxianfw() 
    {
        return shangxianfw;
    }
    public void setTingyongbz(Long tingyongbz) 
    {
        this.tingyongbz = tingyongbz;
    }

    public Long getTingyongbz() 
    {
        return tingyongbz;
    }
    public void setBeizhusm(String beizhusm) 
    {
        this.beizhusm = beizhusm;
    }

    public String getBeizhusm() 
    {
        return beizhusm;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("yingyongid", getYingyongid())
            .append("mingcheng", getMingcheng())
            .append("neirong", getNeirong())
            .append("changjia", getChangjia())
            .append("zhuangtai", getZhuangtai())
            .append("shangxiansj", getShangxiansj())
            .append("shangxianfw", getShangxianfw())
            .append("tingyongbz", getTingyongbz())
            .append("beizhusm", getBeizhusm())
            .toString();
    }
}
