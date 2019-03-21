package com.dandelion.cool.order.controller;

import com.dandelion.cool.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Mr.QinJiang
 * @create: 2019-03-08 16:15
 * @description: 订单  控制器
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;


    @RequestMapping("/index")
    public List index(){
        return orderService.getConfig();
    }

    @RequestMapping("/index1")
    public String index1(){
        return "index1";
    }

}
