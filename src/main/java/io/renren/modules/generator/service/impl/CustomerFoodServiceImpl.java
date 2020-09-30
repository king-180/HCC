package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.CustomerFoodDao;
import io.renren.modules.generator.entity.CustomerFoodEntity;
import io.renren.modules.generator.service.CustomerFoodService;


@Service("customerFoodService")
public class CustomerFoodServiceImpl extends ServiceImpl<CustomerFoodDao, CustomerFoodEntity> implements CustomerFoodService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CustomerFoodEntity> page = this.page(
                new Query<CustomerFoodEntity>().getPage(params),
                new QueryWrapper<CustomerFoodEntity>()
        );

        return new PageUtils(page);
    }

}