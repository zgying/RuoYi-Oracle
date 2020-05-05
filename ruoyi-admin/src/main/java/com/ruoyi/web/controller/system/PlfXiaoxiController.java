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
import com.ruoyi.system.domain.PlfXiaoxi;
import com.ruoyi.system.service.IPlfXiaoxiService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 服务消息Controller
 * 
 * @author openhit
 * @date 2020-05-03
 */
@Controller
@RequestMapping("/system/xiaoxi")
public class PlfXiaoxiController extends BaseController
{
    private String prefix = "system/xiaoxi";

    @Autowired
    private IPlfXiaoxiService plfXiaoxiService;

    @RequiresPermissions("system:xiaoxi:view")
    @GetMapping()
    public String xiaoxi()
    {
        return prefix + "/xiaoxi";
    }

    /**
     * 查询服务消息列表
     */
    @RequiresPermissions("system:xiaoxi:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PlfXiaoxi plfXiaoxi)
    {
        startPage();
        List<PlfXiaoxi> list = plfXiaoxiService.selectPlfXiaoxiList(plfXiaoxi);
        return getDataTable(list);
    }

    /**
     * 导出服务消息列表
     */
    @RequiresPermissions("system:xiaoxi:export")
    @Log(title = "服务消息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PlfXiaoxi plfXiaoxi)
    {
        List<PlfXiaoxi> list = plfXiaoxiService.selectPlfXiaoxiList(plfXiaoxi);
        ExcelUtil<PlfXiaoxi> util = new ExcelUtil<PlfXiaoxi>(PlfXiaoxi.class);
        return util.exportExcel(list, "xiaoxi");
    }

    /**
     * 新增服务消息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存服务消息
     */
    @RequiresPermissions("system:xiaoxi:add")
    @Log(title = "服务消息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PlfXiaoxi plfXiaoxi)
    {
        return toAjax(plfXiaoxiService.insertPlfXiaoxi(plfXiaoxi));
    }

    /**
     * 修改服务消息
     */
    @GetMapping("/edit/{xiaoxiid}")
    public String edit(@PathVariable("xiaoxiid") String xiaoxiid, ModelMap mmap)
    {
        PlfXiaoxi plfXiaoxi = plfXiaoxiService.selectPlfXiaoxiById(xiaoxiid);
        mmap.put("plfXiaoxi", plfXiaoxi);
        return prefix + "/edit";
    }

    /**
     * 修改保存服务消息
     */
    @RequiresPermissions("system:xiaoxi:edit")
    @Log(title = "服务消息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PlfXiaoxi plfXiaoxi)
    {
        return toAjax(plfXiaoxiService.updatePlfXiaoxi(plfXiaoxi));
    }

    /**
     * 删除服务消息
     */
    @RequiresPermissions("system:xiaoxi:remove")
    @Log(title = "服务消息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(plfXiaoxiService.deletePlfXiaoxiByIds(ids));
    }
}
