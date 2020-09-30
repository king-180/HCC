package io.renren.modules.generator.controller;

import java.util.Arrays;
import java.util.Map;

import io.swagger.models.auth.In;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.generator.entity.CustomerEntity;
import io.renren.modules.generator.service.CustomerService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;

import javax.annotation.Resource;

@RestController
@RequestMapping("generator/customer")
public class CustomerController {
    @Resource
    private CustomerService customerService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = customerService.queryPage(params);
        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id) {
        CustomerEntity customer = customerService.getById(id);
        return R.ok().put("customer", customer);
    }

//    @RequestMapping("/query/{id}")
//    public R queryById(@PathVariable("id") Integer id) {
//        CustomerEntity customer = customerService.queryById(id);
//        return R.ok().put("customer", customer);
//    }
    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CustomerEntity customer) {
        customerService.save(customer);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CustomerEntity customer) {
        customerService.updateById(customer);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids) {
        customerService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
