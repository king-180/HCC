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

import io.renren.modules.generator.entity.FoodMenuEntity;
import io.renren.modules.generator.service.FoodMenuService;
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
@RequestMapping("generator/foodmenu")
public class FoodMenuController {
    @Autowired
    private FoodMenuService foodMenuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("generator:foodmenu:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = foodMenuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("generator:foodmenu:info")
    public R info(@PathVariable("id") Integer id){
		FoodMenuEntity foodMenu = foodMenuService.getById(id);

        return R.ok().put("foodMenu", foodMenu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("generator:foodmenu:save")
    public R save(@RequestBody FoodMenuEntity foodMenu){
		foodMenuService.save(foodMenu);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("generator:foodmenu:update")
    public R update(@RequestBody FoodMenuEntity foodMenu){
		foodMenuService.updateById(foodMenu);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("generator:foodmenu:delete")
    public R delete(@RequestBody Integer[] ids){
		foodMenuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
