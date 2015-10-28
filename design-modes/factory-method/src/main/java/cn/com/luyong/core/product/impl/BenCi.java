package cn.com.luyong.core.product.impl;

import cn.com.luyong.core.product.Car;


public class BenCi extends Car {
	@Override
	public void run(String price) {
		System.out.println("我是奔驰车,我价格="+price);
	}

}
