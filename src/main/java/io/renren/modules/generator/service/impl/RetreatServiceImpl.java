package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.RetreatDao;
import io.renren.modules.generator.entity.RetreatEntity;
import io.renren.modules.generator.service.RetreatService;


@Service("retreatService")
public class RetreatServiceImpl extends ServiceImpl<RetreatDao, RetreatEntity> implements RetreatService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RetreatEntity> page = this.page(
                new Query<RetreatEntity>().getPage(params),
                new QueryWrapper<RetreatEntity>()
        );

        return new PageUtils(page);
    }

}