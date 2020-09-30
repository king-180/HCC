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
@TableName("retreat")
public class RetreatEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 退住ID
	 */
	@TableId
	private Integer id;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 创建者
	 */
	private Integer createBy;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 更新者
	 */
	private Integer updateBy;
	/**
	 * 逻辑删除标记（0：显示；1：隐藏）
	 */
	@TableLogic(value = "1",delval = "0")
	private Integer isDeleted;
	/**
	 * 退住时间
	 */
	private Date retreatTime;
	/**
	 * 退住类型
	 */
	private String retreatType;
	/**
	 * 退住原因
	 */
	private String retreatReason;
	/**
	 * 状态
	 */
	private String status;
	/**
	 * 审核意见
	 */
	private String auditOpinion;
	/**
	 * 审核人
	 */
	private String auditPerson;
	/**
	 * 审核时间
	 */
	private Date auditTime;

}
