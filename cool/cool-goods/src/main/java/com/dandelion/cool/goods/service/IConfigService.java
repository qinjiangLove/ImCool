package com.dandelion.cool.goods.service;


import com.dandelion.cool.goods.domain.Config;

import java.util.List;

/**
 * 配置参数 接口类
 * @author Mr.QinJiang
 * @create 2019/3/8
 * @modify 2019/3/8 by Mr.QinJiang
 */
public interface IConfigService {
	/**
     * 查询参数配置信息
     * 
     * @param configId 参数配置ID
     * @return 参数配置信息
     */
	Config selectConfigById(Integer configId);
	
	/**
     * 查询参数配置列表
     * 
     * @param config 参数配置信息
     * @return 参数配置集合
     */
	List<Config> selectConfigList(Config config);
	
	/**
     * 新增参数配置
     * 
     * @param config 参数配置信息
     * @return 结果
     */
	int insertConfig(Config config);
	
	/**
     * 修改参数配置
     * 
     * @param config 参数配置信息
     * @return 结果
     */
	int updateConfig(Config config);
		
	/**
     * 删除参数配置信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	int deleteConfigByIds(String ids);
	
}
