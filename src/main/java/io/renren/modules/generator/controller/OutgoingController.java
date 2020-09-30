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

import io.renren.modules.generator.entity.OutgoingEntity;
import io.renren.modules.generator.service.OutgoingService;
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
@RequestMapping("generator/outgoing")
public class OutgoingController {
    @Autowired
    private OutgoingService outgoingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("generator:outgoing:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = outgoingService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("generator:outgoing:info")
    public R info(@PathVariable("id") Integer id){
		OutgoingEntity outgoing = outgoingService.getById(id);

        return R.ok().put("outgoing", outgoing);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("generator:outgoing:save")
    public R save(@RequestBody OutgoingEntity outgoing){
		outgoingService.save(outgoing);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("generator:outgoing:update")
    public R update(@RequestBody OutgoingEntity outgoing){
		outgoingService.updateById(outgoing);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("generator:outgoing:delete")
    public R delete(@RequestBody Integer[] ids){
		outgoingService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
