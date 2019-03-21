package com.dandelion.cool.goods.service.impl;


import com.dandelion.cool.goods.dao.ConfigMapper;
import com.dandelion.cool.goods.domain.Config;
import com.dandelion.cool.goods.service.IConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 参数配置 服务层实现
 * @author Mr.QinJiang
 * @create 2019/3/8
 * @modify 2019/3/8 by Mr.QinJiang
 */
@Service("configService")
public class ConfigServiceImpl implements IConfigService {

    @Autowired
	private ConfigMapper configMapper;

	/**
     * 查询参数配置信息
     * 
     * @param configId 参数配置ID
     * @return 参数配置信息
     */
    @Override
	public Config selectConfigById(Integer configId)
	{
	    return configMapper.selectConfigById(configId);
	}
	
	/**
     * 查询参数配置列表
     * 
     * @param config 参数配置信息
     * @return 参数配置集合
     */
	@Override
	public List<Config> selectConfigList(Config config)
	{
	    return configMapper.selectConfigList(config);
	}
	
    /**
     * 新增参数配置
     * 
     * @param config 参数配置信息
     * @return 结果
     */
	@Override
	public int insertConfig(Config config)
	{
	    return configMapper.insertConfig(config);
	}
	
	/**
     * 修改参数配置
     * 
     * @param config 参数配置信息
     * @return 结果
     */
	@Override
	public int updateConfig(Config config)
	{
	    return configMapper.updateConfig(config);
	}

	/**
     * 删除参数配置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteConfigByIds(String ids) {
		return configMapper.deleteConfigByIds(ids.split(","));
	}
	
}
