package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * 
 * @author ${author}
 * @email wang@gmail.com
 * @date 2020-09-04 17:47:23
 */
@Data
@NoArgsConstructor
@TableName("customer_bed")
public class CustomerBedEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID主键
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
	 * 客户ID
	 */
	private String customerId;
	/**
	 * 护理项目ID
	 */
	private String contentId;
	/**
	 * 护理时间
	 */
	private Date nursingTime;
	/**
	 * 护理内容
	 */
	private String nursingContent;
	/**
	 * 护理次数
	 */
	private String nursingCount;
	/**
	 * 护理人员ID
	 */
	private String stuffinfoId;
	/**
	 * 护理安排ID
	 */
	private String nursingId;

	public CustomerBedEntity(Date createTime, Integer createBy, Date updateTime, Integer updateBy, Integer isDeleted, String customerId, String contentId, Date nursingTime, String nursingContent, String nursingCount, String stuffinfoId, String nursingId) {
		this.createTime = createTime;
		this.createBy = createBy;
		this.updateTime = updateTime;
		this.updateBy = updateBy;
		this.isDeleted = isDeleted;
		this.customerId = customerId;
		this.contentId = contentId;
		this.nursingTime = nursingTime;
		this.nursingContent = nursingContent;
		this.nursingCount = nursingCount;
		this.stuffinfoId = stuffinfoId;
		this.nursingId = nursingId;
	}
}
