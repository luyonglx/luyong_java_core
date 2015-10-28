package cn.com.luyong.core.singleton;
/**
 * 懒汉式，线程安全
 * @author LUYONG
 *
 */
public class Singleton_02 {
	private static Singleton_02 instance;

	private Singleton_02() {
	}

	public synchronized static Singleton_02 getInstance() {
		return instance == null ? new Singleton_02() : instance;
	}

}
