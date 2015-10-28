package cn.com.luyong.core.factory;

import cn.com.luyong.core.product.Car;

public abstract class BaseFactory {
	
	public abstract Car createCar(String flag);

}
