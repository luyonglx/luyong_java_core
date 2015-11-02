package cn.com.luyong.core.adapter;

import org.junit.Test;

import cn.com.luyong.core.adapter.source.Source;
import cn.com.luyong.core.adapter.target.Targetable;

public class ObjAdapter {
	@Test
	public void adapterTest(){
		Source soure=new Source();
		Targetable target=new AdapterObj(soure);
		target.method1();
		target.method2();
	}
}
