package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
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
@TableName("bed")
public class BedEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 床位ID
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
	 * 房间号码
	 */
	private String roomNumber;
	/**
	 * 床位状态
	 */
	private String bedStatus;
	/**
	 * 类型
	 */
	private String positionType;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 排序
	 */
	private Integer sort;

	public BedEntity(Date createTime, Integer createBy, Date updateTime, Integer updateBy, Integer isDeleted, String roomNumber, String bedStatus, String positionType, String name, Integer sort) {
		this.createTime = createTime;
		this.createBy = createBy;
		this.updateTime = updateTime;
		this.updateBy = updateBy;
		this.isDeleted = isDeleted;
		this.roomNumber = roomNumber;
		this.bedStatus = bedStatus;
		this.positionType = positionType;
		this.name = name;
		this.sort = sort;
	}
}
