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

import io.renren.modules.generator.entity.NursingContentEntity;
import io.renren.modules.generator.service.NursingContentService;
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
@RequestMapping("generator/nursingcontent")
public class NursingContentController {
    @Autowired
    private NursingContentService nursingContentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("generator:nursingcontent:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = nursingContentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("generator:nursingcontent:info")
    public R info(@PathVariable("id") String id){
		NursingContentEntity nursingContent = nursingContentService.getById(id);

        return R.ok().put("nursingContent", nursingContent);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("generator:nursingcontent:save")
    public R save(@RequestBody NursingContentEntity nursingContent){
		nursingContentService.save(nursingContent);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("generator:nursingcontent:update")
    public R update(@RequestBody NursingContentEntity nursingContent){
		nursingContentService.updateById(nursingContent);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("generator:nursingcontent:delete")
    public R delete(@RequestBody String[] ids){
		nursingContentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
