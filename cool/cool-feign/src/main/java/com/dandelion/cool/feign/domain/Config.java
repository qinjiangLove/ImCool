package com.dandelion.cool.feign.domain;


import java.io.Serializable;
import java.util.Date;

/**
 *  配置信息  对应sys_config
 * @author Mr.QinJiang
 * @create 2019/3/8
 * @modify 2019/3/8 by Mr.QinJiang
 */
public class Config implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/** 参数主键 */
	private Integer configId;
	/** 参数名称 */
	private String configName;
	/** 参数键名 */
	private String configKey;
	/** 参数键值 */
	private String configValue;
	/** 系统内置（Y是 N否） */
	private String configType;
	/** 创建者 */
	private String createBy;
	/** 创建时间 */
	private Date createTime;
	/** 更新者 */
	private String updateBy;
	/** 更新时间 */
	private Date updateTime;
	/** 备注 */
	private String remark;

	public void setConfigId(Integer configId){
		this.configId = configId;
	}

	public Integer getConfigId(){
		return configId;
	}
	public void setConfigName(String configName){
		this.configName = configName;
	}

	public String getConfigName(){
		return configName;
	}
	public void setConfigKey(String configKey){
		this.configKey = configKey;
	}

	public String getConfigKey(){
		return configKey;
	}
	public void setConfigValue(String configValue){
		this.configValue = configValue;
	}

	public String getConfigValue(){
		return configValue;
	}
	public void setConfigType(String configType){
		this.configType = configType;
	}

	public String getConfigType(){
		return configType;
	}
	public void setCreateBy(String createBy){
		this.createBy = createBy;
	}

	public String getCreateBy(){
		return createBy;
	}
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return createTime;
	}
	public void setUpdateBy(String updateBy){
		this.updateBy = updateBy;
	}

	public String getUpdateBy(){
		return updateBy;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}

	public Date getUpdateTime(){
		return updateTime;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}

	public String getRemark(){
		return remark;
	}


}
