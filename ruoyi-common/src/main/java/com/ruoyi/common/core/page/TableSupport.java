package com.ruoyi.common.core.page;

import java.io.Console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.utils.ServletUtils;

/**
 * 表格数据处理
 * 
 * @author ruoyi
 */
public class TableSupport
{
	protected final Logger logger = LoggerFactory.getLogger(TableSupport.class);
    /**
     * 封装分页对象
     */
    public static PageDomain getPageDomain()
    {
        PageDomain pageDomain = new PageDomain();        
        //System.console().writer().println(ServletUtils.getRequest().toString());
        //logger. ServletUtils.getRequest().toString();
        pageDomain.setPageNum(ServletUtils.getParameterToInt(Constants.PAGE_NUM));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(Constants.PAGE_SIZE));
        pageDomain.setOrderByColumn(ServletUtils.getParameter(Constants.ORDER_BY_COLUMN));
        pageDomain.setIsAsc(ServletUtils.getParameter(Constants.IS_ASC));
        return pageDomain;
    }

    public static PageDomain buildPageRequest()
    {
        return getPageDomain();
    }
}
