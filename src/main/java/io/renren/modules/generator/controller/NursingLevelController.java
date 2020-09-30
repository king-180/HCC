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

import io.renren.modules.generator.entity.NursingLevelEntity;
import io.renren.modules.generator.service.NursingLevelService;
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
@RequestMapping("generator/nursinglevel")
public class NursingLevelController {
    @Autowired
    private NursingLevelService nursingLevelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("generator:nursinglevel:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = nursingLevelService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("generator:nursinglevel:info")
    public R info(@PathVariable("id") String id){
		NursingLevelEntity nursingLevel = nursingLevelService.getById(id);

        return R.ok().put("nursingLevel", nursingLevel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("generator:nursinglevel:save")
    public R save(@RequestBody NursingLevelEntity nursingLevel){
		nursingLevelService.save(nursingLevel);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("generator:nursinglevel:update")
    public R update(@RequestBody NursingLevelEntity nursingLevel){
		nursingLevelService.updateById(nursingLevel);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("generator:nursinglevel:delete")
    public R delete(@RequestBody String[] ids){
		nursingLevelService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
