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
@TableName("user_info")
public class UserInfoEntity implements Serializable {
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
	 * 员工姓名
	 */
	private String staffName;
	/**
	 * 性别
	 */
	private Integer staffSex;
	/**
	 * 年龄
	 */
	private String staffAge;
	/**
	 * 员工号
	 */
	private String staffId;
	/**
	 * 员工类别
	 */
	private String staffType;
	/**
	 * 入职时间
	 */
	private Date entryTime;
	/**
	 * 操作人
	 */
	private String operateName;
	/**
	 * 职务
	 */
	private String duty;
	/**
	 * 职称
	 */
	private String positionalTitle;
	/**
	 * 简介
	 */
	private String brief;
	/**
	 * 手机号码
	 */
	private String phoneNumber;

}
