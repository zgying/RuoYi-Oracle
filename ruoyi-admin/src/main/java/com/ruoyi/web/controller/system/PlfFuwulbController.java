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
import com.ruoyi.system.domain.PlfFuwulb;
import com.ruoyi.system.service.IPlfFuwulbService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 服务列Controller
 * 
 * @author openhit
 * @date 2020-05-03
 */
@Controller
@RequestMapping("/system/fuwulb")
public class PlfFuwulbController extends BaseController
{
    private String prefix = "system/fuwulb";

    @Autowired
    private IPlfFuwulbService plfFuwulbService;

    @RequiresPermissions("system:fuwulb:view")
    @GetMapping()
    public String fuwulb()
    {
        return prefix + "/fuwulb";
    }

    /**
     * 查询服务列列表
     */
    @RequiresPermissions("system:fuwulb:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PlfFuwulb plfFuwulb)
    {
        startPage();
        List<PlfFuwulb> list = plfFuwulbService.selectPlfFuwulbList(plfFuwulb);
        return getDataTable(list);
    }

    /**
     * 导出服务列列表
     */
    @RequiresPermissions("system:fuwulb:export")
    @Log(title = "服务列", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PlfFuwulb plfFuwulb)
    {
        List<PlfFuwulb> list = plfFuwulbService.selectPlfFuwulbList(plfFuwulb);
        ExcelUtil<PlfFuwulb> util = new ExcelUtil<PlfFuwulb>(PlfFuwulb.class);
        return util.exportExcel(list, "fuwulb");
    }

    /**
     * 新增服务列
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存服务列
     */
    @RequiresPermissions("system:fuwulb:add")
    @Log(title = "服务列", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PlfFuwulb plfFuwulb)
    {
        return toAjax(plfFuwulbService.insertPlfFuwulb(plfFuwulb));
    }

    /**
     * 修改服务列
     */
    @GetMapping("/edit/{fuwuid}")
    public String edit(@PathVariable("fuwuid") String fuwuid, ModelMap mmap)
    {
        PlfFuwulb plfFuwulb = plfFuwulbService.selectPlfFuwulbById(fuwuid);
        mmap.put("plfFuwulb", plfFuwulb);
        return prefix + "/edit";
    }

    /**
     * 修改保存服务列
     */
    @RequiresPermissions("system:fuwulb:edit")
    @Log(title = "服务列", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PlfFuwulb plfFuwulb)
    {
        return toAjax(plfFuwulbService.updatePlfFuwulb(plfFuwulb));
    }

    /**
     * 删除服务列
     */
    @RequiresPermissions("system:fuwulb:remove")
    @Log(title = "服务列", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(plfFuwulbService.deletePlfFuwulbByIds(ids));
    }
}
