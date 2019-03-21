package com.dandelion.cool.feign.client;

import com.dandelion.cool.feign.domain.Config;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author: Mr.QinJiang
 * @create: 2019-03-08 15:41
 * @description: 商品模块远程调用
 **/
@FeignClient("cool-goods")
public interface GoodsRemote {

    @RequestMapping(value = "/goods/index",method = RequestMethod.GET)
    /**
     *  获取配置列表
     * @return java.util.List
     * @author Mr.QinJiang
     * @date 2019/3/8 15:44
     */
    List<Config> getConfig();
}
