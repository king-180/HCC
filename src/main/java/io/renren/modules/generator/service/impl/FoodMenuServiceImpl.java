package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.FoodMenuDao;
import io.renren.modules.generator.entity.FoodMenuEntity;
import io.renren.modules.generator.service.FoodMenuService;


@Service("foodMenuService")
public class FoodMenuServiceImpl extends ServiceImpl<FoodMenuDao, FoodMenuEntity> implements FoodMenuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FoodMenuEntity> page = this.page(
                new Query<FoodMenuEntity>().getPage(params),
                new QueryWrapper<FoodMenuEntity>().like("food_name", params.get("key"))
        );

        return new PageUtils(page);
    }

}