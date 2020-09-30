package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.OutgoingDao;
import io.renren.modules.generator.entity.OutgoingEntity;
import io.renren.modules.generator.service.OutgoingService;


@Service("outgoingService")
public class OutgoingServiceImpl extends ServiceImpl<OutgoingDao, OutgoingEntity> implements OutgoingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OutgoingEntity> page = this.page(
                new Query<OutgoingEntity>().getPage(params),
                new QueryWrapper<OutgoingEntity>()
        );

        return new PageUtils(page);
    }

}