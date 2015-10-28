package cn.com.luyong.core.singleton;
/**
 * 双重检查，线程安全
 * @author LUYONG
 *
 */
public class Singleton_04 {

	private static Singleton_04 instance;

	public static Singleton_04 getInstance() {
		if (instance == null) {
			synchronized (Singleton_04.class) {
				if (instance == null) {
					instance = new Singleton_04();
				}
			}
		}
		return instance;
	}

}
