package com.crazyshopping.shop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.crazyshopping.pojo.TbBrand;
import com.crazyshopping.sellergoods.service.BrandService;
@RestController
@RequestMapping("/brand")
public class BrandController {
	@Reference
	private BrandService brandService;
	@RequestMapping("/findBrand.do")
	public List<TbBrand> findBrand(){
		return brandService.getBrand();
		
	}

}
