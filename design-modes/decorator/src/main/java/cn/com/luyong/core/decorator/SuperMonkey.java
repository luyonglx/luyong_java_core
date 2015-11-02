package cn.com.luyong.core.decorator;

import cn.com.luyong.core.decorator.impl.Monkey;

public class SuperMonkey implements Animal{

	private Monkey monkey;
	
	public SuperMonkey(Monkey monkey){
		super();
		this.monkey=monkey;
	}
	
	public void run() {
		monkey.run();
	}

	public void eat() {
		monkey.eat();
	}
	
	public void fight(){
		System.out.println("我是孙悟空，我会打架！");
	}

}
