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

import io.renren.modules.generator.entity.RetreatEntity;
import io.renren.modules.generator.service.RetreatService;
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
@RequestMapping("generator/retreat")
public class RetreatController {
    @Autowired
    private RetreatService retreatService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("generator:retreat:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = retreatService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("generator:retreat:info")
    public R info(@PathVariable("id") Integer id){
		RetreatEntity retreat = retreatService.getById(id);

        return R.ok().put("retreat", retreat);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("generator:retreat:save")
    public R save(@RequestBody RetreatEntity retreat){
		retreatService.save(retreat);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("generator:retreat:update")
    public R update(@RequestBody RetreatEntity retreat){
		retreatService.updateById(retreat);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("generator:retreat:delete")
    public R delete(@RequestBody Integer[] ids){
		retreatService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
