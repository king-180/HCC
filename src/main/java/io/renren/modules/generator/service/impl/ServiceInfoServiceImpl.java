package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.ServiceInfoDao;
import io.renren.modules.generator.entity.ServiceInfoEntity;
import io.renren.modules.generator.service.ServiceInfoService;


@Service("serviceInfoService")
public class ServiceInfoServiceImpl extends ServiceImpl<ServiceInfoDao, ServiceInfoEntity> implements ServiceInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ServiceInfoEntity> page = this.page(
                new Query<ServiceInfoEntity>().getPage(params),
                new QueryWrapper<ServiceInfoEntity>().like("service_id", params.get("key"))
        );

        return new PageUtils(page);
    }

}