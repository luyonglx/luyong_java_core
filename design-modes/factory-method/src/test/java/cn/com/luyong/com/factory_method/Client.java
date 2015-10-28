package cn.com.luyong.com.factory_method;

import cn.com.luyong.core.factory.BaseFactory;
import cn.com.luyong.core.factory.impl.TongYongFactory;
import cn.com.luyong.core.product.Car;

public class Client {
	public static void main(String[] args) {
		BaseFactory carFactory=new TongYongFactory();
		Car car=carFactory.createCar("bc");
		car.run("100万");
	}

}
