package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.CustomerEntity;

import java.util.List;
import java.util.Map;

public interface CustomerService extends IService<CustomerEntity> {


     PageUtils queryPage(Map<String, Object> params);

}

