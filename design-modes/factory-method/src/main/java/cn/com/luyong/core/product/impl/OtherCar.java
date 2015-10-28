package cn.com.luyong.core.product.impl;

import cn.com.luyong.core.product.Car;


public class OtherCar extends Car {
	@Override
	public void run(String price) {
		System.out.println("我是杂牌车,价格="+price);
	}

}
