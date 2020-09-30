package io.renren.modules.generator.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.generator.entity.BedEntity;
import io.renren.modules.generator.service.BedService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;

import javax.annotation.Resource;

@RestController
@RequestMapping("generator/bed")
public class BedController {
    @Resource
    private BedService bedService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bedService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		BedEntity bed = bedService.getById(id);

        return R.ok().put("bed", bed);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BedEntity bed){
		bedService.save(bed);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BedEntity bed){
		bedService.updateById(bed);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		bedService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
