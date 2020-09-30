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

import io.renren.modules.generator.entity.CustomerBedEntity;
import io.renren.modules.generator.service.CustomerBedService;
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
@RequestMapping("generator/customerbed")
public class CustomerBedController {
    @Autowired
    private CustomerBedService customerBedService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("generator:customerbed:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = customerBedService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("generator:customerbed:info")
    public R info(@PathVariable("id") Integer id){
		CustomerBedEntity customerBed = customerBedService.getById(id);

        return R.ok().put("customerBed", customerBed);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("generator:customerbed:save")
    public R save(@RequestBody CustomerBedEntity customerBed){
		customerBedService.save(customerBed);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("generator:customerbed:update")
    public R update(@RequestBody CustomerBedEntity customerBed){
		customerBedService.updateById(customerBed);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("generator:customerbed:delete")
    public R delete(@RequestBody Integer[] ids){
		customerBedService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
