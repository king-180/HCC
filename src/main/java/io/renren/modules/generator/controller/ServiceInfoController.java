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

import io.renren.modules.generator.entity.ServiceInfoEntity;
import io.renren.modules.generator.service.ServiceInfoService;
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
@RequestMapping("generator/serviceinfo")
public class ServiceInfoController {
    @Autowired
    private ServiceInfoService serviceInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("generator:serviceinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = serviceInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("generator:serviceinfo:info")
    public R info(@PathVariable("id") String id){
		ServiceInfoEntity serviceInfo = serviceInfoService.getById(id);

        return R.ok().put("serviceInfo", serviceInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("generator:serviceinfo:save")
    public R save(@RequestBody ServiceInfoEntity serviceInfo){
		serviceInfoService.save(serviceInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("generator:serviceinfo:update")
    public R update(@RequestBody ServiceInfoEntity serviceInfo){
		serviceInfoService.updateById(serviceInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("generator:serviceinfo:delete")
    public R delete(@RequestBody String[] ids){
		serviceInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
