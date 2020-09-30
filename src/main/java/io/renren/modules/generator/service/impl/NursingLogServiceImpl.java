package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.NursingLogDao;
import io.renren.modules.generator.entity.NursingLogEntity;
import io.renren.modules.generator.service.NursingLogService;


@Service("nursingLogService")
public class NursingLogServiceImpl extends ServiceImpl<NursingLogDao, NursingLogEntity> implements NursingLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<NursingLogEntity> page = this.page(
                new Query<NursingLogEntity>().getPage(params),
                new QueryWrapper<NursingLogEntity>().like("customer_id", params.get("key"))
        );

        return new PageUtils(page);
    }

}