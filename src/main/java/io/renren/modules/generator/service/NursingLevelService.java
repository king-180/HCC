package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.NursingLevelEntity;

import java.util.Map;

/**
 * 
 *
 * @author ${author}
 * @email wang@gmail.com
 * @date 2020-09-04 17:47:23
 */
public interface NursingLevelService extends IService<NursingLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

