package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.BedDao;
import io.renren.modules.generator.entity.BedEntity;
import io.renren.modules.generator.service.BedService;


@Service("bedService")
public class BedServiceImpl extends ServiceImpl<BedDao, BedEntity> implements BedService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BedEntity> page = this.page(
                new Query<BedEntity>().getPage(params),
                new QueryWrapper<BedEntity>().like("room_number", params.get("roomNumber"))
        );

        return new PageUtils(page);
    }

}