package cn.com.luyong.core.singleton;
/**
 * 懒汉式（线程不安全）
 * @author LUYONG
 *
 */
public class Singleton_01 {
	private static Singleton_01 instance;
	
	public Singleton_01(){}
	
	public static Singleton_01 getInstance(){
		return instance==null?new Singleton_01():instance;
	}

}
