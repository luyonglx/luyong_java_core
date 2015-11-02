package cn.com.luyong.core.decorator.impl;

import cn.com.luyong.core.decorator.Animal;

public class Monkey implements Animal{

	public void run() {
		System.out.println("我会跑");
	}

	public void eat() {
		System.out.println("我会吃");
		
	}

}
