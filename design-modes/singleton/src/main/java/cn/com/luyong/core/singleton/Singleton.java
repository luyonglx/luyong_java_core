package cn.com.luyong.core.singleton;

public class Singleton {
	private static Singleton  instance;
	
	private  int count;
	
	public synchronized int getCount(){
		return count++;
	}
	
	public static Singleton  getInstance(){
		if (instance == null) {
			synchronized (Singleton_04.class) {
				if (instance == null) {
					instance = new Singleton();
					instance.count=0;
				}
			}
		}
		return instance;
	}
	

}
