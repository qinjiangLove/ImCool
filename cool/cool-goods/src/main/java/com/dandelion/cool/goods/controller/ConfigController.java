package com.dandelion.cool.goods.controller;


import com.dandelion.cool.goods.domain.Config;
import com.dandelion.cool.goods.service.IConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 数据信息  控制类
 * @author Mr.QinJiang
 * @create 2019/3/8
 * @modify 2019/3/8 by Mr.QinJiang
 */
@RestController
@RequestMapping("/goods/index")
public class ConfigController {

	@Autowired
	private IConfigService configService;
	

	@RequestMapping(method = RequestMethod.GET)
	public List config(){
	    return configService.selectConfigList(new Config());
	}

	@GetMapping("/index")
	public String configIndex(){
		return "1111";
	}
	
}
