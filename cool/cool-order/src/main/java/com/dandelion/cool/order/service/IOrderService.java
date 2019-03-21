package com.dandelion.cool.order.service;

import com.dandelion.cool.feign.domain.Config;

import java.util.List;

/**
 * @author: Mr.QinJiang
 * @create: 2019-03-08 16:13
 * @description: 订单 service接口
 **/
public interface IOrderService {

    List<Config> getConfig();
}
