package cn.com.luyong.core.adapter;

import cn.com.luyong.core.adapter.source.Source;
import cn.com.luyong.core.adapter.target.Targetable;

public class AdapterClass extends Source implements Targetable{
	public void method2() {
		System.out.println("我是方法2");
	}

}
