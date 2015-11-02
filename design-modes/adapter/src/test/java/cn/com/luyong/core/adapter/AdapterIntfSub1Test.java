package cn.com.luyong.core.adapter;

import org.junit.Test;

import cn.com.luyong.core.adapter.source.Sourceable;

public class AdapterIntfSub1Test {
	@Test
	public void adapterTest(){
		Sourceable source=new AdapterIntfSub1();
		source.method1();
	}
}
