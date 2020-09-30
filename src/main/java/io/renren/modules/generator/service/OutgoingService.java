package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.OutgoingEntity;

import java.util.Map;

/**
 * 
 *
 * @author ${author}
 * @email wang@gmail.com
 * @date 2020-09-04 17:47:23
 */
public interface OutgoingService extends IService<OutgoingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

