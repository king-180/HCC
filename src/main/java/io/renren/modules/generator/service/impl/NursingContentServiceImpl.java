package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.NursingContentDao;
import io.renren.modules.generator.entity.NursingContentEntity;
import io.renren.modules.generator.service.NursingContentService;


@Service("nursingContentService")
public class NursingContentServiceImpl extends ServiceImpl<NursingContentDao, NursingContentEntity> implements NursingContentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<NursingContentEntity> page = this.page(
                new Query<NursingContentEntity>().getPage(params),
                new QueryWrapper<NursingContentEntity>().like("nursing_name", params.get("key"))
        );

        return new PageUtils(page);
    }

}