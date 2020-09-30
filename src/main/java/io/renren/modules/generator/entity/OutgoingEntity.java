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
@TableName("outgoing")
public class OutgoingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 外出ID
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
	 * 外出事由
	 */
	private String outgoingReason;
	/**
	 * 外出时间
	 */
	private Date outgoingTime;
	/**
	 * 预计回院时间
	 */
	private Date expectedReturnTime;
	/**
	 * 实际回院时间
	 */
	private Date actualReturnTime;
	/**
	 * 陪同人
	 */
	private String escorted;
	/**
	 * 与老人关系
	 */
	private String relation;
	/**
	 * 陪同人电话
	 */
	private String escortedTel;
	/**
	 * 审批状态
	 */
	private String auditStatus;
	/**
	 * 审批人
	 */
	private String auditPerson;
	/**
	 * 审批时间
	 */
	private Date auditTime;

}
