package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author ${author}
 * @email wang@gmail.com
 * @date 2020-09-04 17:47:23
 */
@Data
@TableName("service_info")
public class ServiceInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID主键
	 */
	@TableId
	private String id;
	/**
	 * 创建者
	 */
	private String craeteBy;
	/**
	 * 创建时间
	 */
	private Date craeteTime;
	/**
	 * 更新者
	 */
	private String updateBy;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 逻辑删除标记（0：显示；1：隐藏）
	 */
	@TableLogic(value = "1",delval = "0")
	private Integer delFlag;
	/**
	 * 客户ID
	 */
	private String customerId;
	/**
	 * 服务项目ID
	 */
	private String serviceId;
	/**
	 * 服务到期日
	 */
	private Date maturityTime;
	/**
	 * 服务购买日
	 */
	private Date buyDate;
	/**
	 * 备注
	 */
	private String others;

}
