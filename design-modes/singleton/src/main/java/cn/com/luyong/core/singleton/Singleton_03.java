package cn.com.luyong.core.singleton;
/**
 * 饿汉，线程安全
 * @author LUYONG
 *
 */
public class Singleton_03 {

    private static Singleton_03 instance = new Singleton_03();

    private Singleton_03() {
    }

    public synchronized static Singleton_03 getInstance() {
        return instance;
    }
}
