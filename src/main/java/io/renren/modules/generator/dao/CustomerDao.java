package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.CustomerEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface CustomerDao extends BaseMapper<CustomerEntity> {

//    CustomerEntity queryById(Integer id);

}
