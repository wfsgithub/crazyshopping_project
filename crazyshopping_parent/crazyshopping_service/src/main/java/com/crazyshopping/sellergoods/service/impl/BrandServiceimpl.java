package com.crazyshopping.sellergoods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.crazyshopping.mapper.TbBrandMapper;
import com.crazyshopping.pojo.TbBrand;
import com.crazyshopping.sellergoods.service.BrandService;
@Service
public class BrandServiceimpl implements BrandService {
		@Autowired
		private TbBrandMapper brandMapper;
	@Override
	public List<TbBrand> getBrand() {
		// TODO Auto-generated method stub
		return brandMapper.selectByExample(null);
	}

}
