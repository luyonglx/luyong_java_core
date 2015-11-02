package cn.com.luyong.core.java_test;

import java.util.Random;

import org.junit.Test;

public class JDKTest {
	
	@Test
	public void testRandom(){
		Random random=new Random();
		for(int i=0;i<1000;i++){
			System.out.println(random.nextInt(3));
		}
	}
	
	

}
