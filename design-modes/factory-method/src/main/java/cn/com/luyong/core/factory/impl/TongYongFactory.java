package cn.com.luyong.core.factory.impl;

import cn.com.luyong.core.factory.BaseFactory;
import cn.com.luyong.core.product.Car;
import cn.com.luyong.core.product.impl.BenCi;
import cn.com.luyong.core.product.impl.OtherCar;

public class TongYongFactory extends BaseFactory{
	@Override
	public Car createCar(String flag) {
		if("bc".equals(flag))
			return new BenCi();
		else
			return new OtherCar();
	}

}
