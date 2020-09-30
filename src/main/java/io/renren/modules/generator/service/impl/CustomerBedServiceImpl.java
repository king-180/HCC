package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.CustomerBedDao;
import io.renren.modules.generator.entity.CustomerBedEntity;
import io.renren.modules.generator.service.CustomerBedService;


@Service("customerBedService")
public class CustomerBedServiceImpl extends ServiceImpl<CustomerBedDao, CustomerBedEntity> implements CustomerBedService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CustomerBedEntity> page = this.page(
                new Query<CustomerBedEntity>().getPage(params),
                new QueryWrapper<CustomerBedEntity>()
        );

        return new PageUtils(page);
    }

}