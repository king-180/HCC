package io.renren.modules.generator.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.generator.entity.NursingLogEntity;
import io.renren.modules.generator.service.NursingLogService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author ${author}
 * @email wang@gmail.com
 * @date 2020-09-04 17:47:23
 */
@RestController
@RequestMapping("generator/nursinglog")
public class NursingLogController {
    @Autowired
    private NursingLogService nursingLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("generator:nursinglog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = nursingLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("generator:nursinglog:info")
    public R info(@PathVariable("id") String id){
		NursingLogEntity nursingLog = nursingLogService.getById(id);

        return R.ok().put("nursingLog", nursingLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("generator:nursinglog:save")
    public R save(@RequestBody NursingLogEntity nursingLog){
		nursingLogService.save(nursingLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("generator:nursinglog:update")
    public R update(@RequestBody NursingLogEntity nursingLog){
		nursingLogService.updateById(nursingLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("generator:nursinglog:delete")
    public R delete(@RequestBody String[] ids){
		nursingLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
