package com.dandelion.cool.order.service.impl;

import com.dandelion.cool.feign.client.GoodsRemote;
import com.dandelion.cool.feign.domain.Config;
import com.dandelion.cool.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: Mr.QinJiang
 * @create: 2019-03-08 16:14
 * @description: 订单  service接口实现类
 **/
@Service("orderService")
@Transactional(rollbackFor = Exception.class)
public class IOrderServiceImpl implements IOrderService {

    @Autowired
    private GoodsRemote goodsRemote;

    @Override
    public List<Config> getConfig() {
        return goodsRemote.getConfig();
    }
}
