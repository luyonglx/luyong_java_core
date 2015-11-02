package cn.com.luyong.core.adapter;

import org.junit.Test;

import cn.com.luyong.core.adapter.target.Targetable;

public class ClassAdapterTest {
	@Test
	public void adapterTest(){
		Targetable target=new AdapterClass();
		target.method1();
		target.method2();
	}

}
