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
@TableName("nursing_level")
public class NursingLevelEntity implements Serializable {
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
	 * 护理级别
	 */
	private String levelName;
	/**
	 * 级别状态 1：启用；2：停用
	 */
	private Integer levelStatus;

}
