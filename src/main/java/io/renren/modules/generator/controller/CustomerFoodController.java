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

import io.renren.modules.generator.entity.CustomerFoodEntity;
import io.renren.modules.generator.service.CustomerFoodService;
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
@RequestMapping("generator/customerfood")
public class CustomerFoodController {
    @Autowired
    private CustomerFoodService customerFoodService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("generator:customerfood:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = customerFoodService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("generator:customerfood:info")
    public R info(@PathVariable("id") String id){
		CustomerFoodEntity customerFood = customerFoodService.getById(id);

        return R.ok().put("customerFood", customerFood);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("generator:customerfood:save")
    public R save(@RequestBody CustomerFoodEntity customerFood){
		customerFoodService.save(customerFood);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("generator:customerfood:update")
    public R update(@RequestBody CustomerFoodEntity customerFood){
		customerFoodService.updateById(customerFood);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("generator:customerfood:delete")
    public R delete(@RequestBody String[] ids){
		customerFoodService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
