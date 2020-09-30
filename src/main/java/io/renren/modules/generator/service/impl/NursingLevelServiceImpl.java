package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.NursingLevelDao;
import io.renren.modules.generator.entity.NursingLevelEntity;
import io.renren.modules.generator.service.NursingLevelService;


@Service("nursingLevelService")
public class NursingLevelServiceImpl extends ServiceImpl<NursingLevelDao, NursingLevelEntity> implements NursingLevelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<NursingLevelEntity> page = this.page(
                new Query<NursingLevelEntity>().getPage(params),
                new QueryWrapper<NursingLevelEntity>().eq("level_name", params.get("key"))
        );

        return new PageUtils(page);
    }

}