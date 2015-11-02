package cn.com.luyong.core.adapter;

import cn.com.luyong.core.adapter.source.Source;
import cn.com.luyong.core.adapter.target.Targetable;

public class AdapterObj implements Targetable{
	private Source source;

	
	public AdapterObj(Source source){
		super();
		this.source=source;
	}
	
	public void method1() {
		source.method1();
	}

	public void method2() {
		System.out.println("我是对象适配器模式的方法2");
	}

}
