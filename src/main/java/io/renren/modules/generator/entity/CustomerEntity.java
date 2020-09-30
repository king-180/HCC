package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("customer")
public class CustomerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 客户ID
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
	 * 客户姓名
	 */
	private String customerName;
	/**
	 * 年龄
	 */
	private Integer customerAge;
	/**
	 * 性别
	 */
	private Integer customerSex;
	/**
	 * 身份证号
	 */
	private String idcard;
	/**
	 * 房间号
	 */
	private String roomNumber;
	/**
	 * 所属楼房
	 */
	private Integer buildingId;
	/**
	 * 档案号
	 */
	private Integer recordId;
	/**
	 * 老人类型
	 */
	private String elderType;
	/**
	 * 入住时间
	 */
	private Date checkinDate;
	/**
	 * 合同到期时间
	 */
	private Date expirationDate;
	/**
	 * 联系电话
	 */
	private String contactTel;
	/**
	 * 床号
	 */
	private Integer bedId;
	/**
	 * 身心状况
	 */
	private String psychosomaticState;
	/**
	 * 注意事项
	 */
	private String attention;
	/**
	 * 出生日期
	 */
	private Date birthday;
	/**
	 * 身高
	 */
	private String height;
	/**
	 * 婚姻状况
	 */
	private String maritalStatus;
	/**
	 * 体重
	 */
	private String weight;
	/**
	 * 血型
	 */
	private String bloodType;
	/**
	 * 头像路径
	 */
	private String filepath;

}
