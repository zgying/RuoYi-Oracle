package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.PlfYingyong;
import com.ruoyi.system.service.IPlfYingyongService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 应用系统Controller
 * 
 * @author open hit
 * @date 2020-05-03
 */
@Controller
@RequestMapping("/system/yingyong")
public class PlfYingyongController extends BaseController
{
    private String prefix = "system/yingyong";

    @Autowired
    private IPlfYingyongService plfYingyongService;

    @RequiresPermissions("system:yingyong:view")
    @GetMapping()
    public String yingyong()
    {
        return prefix + "/yingyong";
    }

    /**
     * 查询应用系统列表
     */
    @RequiresPermissions("system:yingyong:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PlfYingyong plfYingyong)
    {
        startPage();
        List<PlfYingyong> list = plfYingyongService.selectPlfYingyongList(plfYingyong);
        return getDataTable(list);
    }

    /**
     * 导出应用系统列表
     */
    @RequiresPermissions("system:yingyong:export")
    @Log(title = "应用系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PlfYingyong plfYingyong)
    {
        List<PlfYingyong> list = plfYingyongService.selectPlfYingyongList(plfYingyong);
        ExcelUtil<PlfYingyong> util = new ExcelUtil<PlfYingyong>(PlfYingyong.class);
        return util.exportExcel(list, "yingyong");
    }

    /**
     * 新增应用系统
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存应用系统
     */
    @RequiresPermissions("system:yingyong:add")
    @Log(title = "应用系统", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PlfYingyong plfYingyong)
    {
        return toAjax(plfYingyongService.insertPlfYingyong(plfYingyong));
    }

    /**
     * 修改应用系统
     */
    @GetMapping("/edit/{yingyongid}")
    public String edit(@PathVariable("yingyongid") String yingyongid, ModelMap mmap)
    {
        PlfYingyong plfYingyong = plfYingyongService.selectPlfYingyongById(yingyongid);
        mmap.put("plfYingyong", plfYingyong);
        return prefix + "/edit";
    }

    /**
     * 修改保存应用系统
     */
    @RequiresPermissions("system:yingyong:edit")
    @Log(title = "应用系统", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PlfYingyong plfYingyong)
    {
        return toAjax(plfYingyongService.updatePlfYingyong(plfYingyong));
    }

    /**
     * 删除应用系统
     */
    @RequiresPermissions("system:yingyong:remove")
    @Log(title = "应用系统", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(plfYingyongService.deletePlfYingyongByIds(ids));
    }
}
