package cn.com.luyong.core.decorator;

import junit.framework.Test;
import cn.com.luyong.core.decorator.impl.Monkey;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@org.junit.Test
	public void decoratorTest(){
		Monkey monkey=new Monkey();
		SuperMonkey superMonkey=new SuperMonkey(monkey);
		superMonkey.fight();
	}
  
}
