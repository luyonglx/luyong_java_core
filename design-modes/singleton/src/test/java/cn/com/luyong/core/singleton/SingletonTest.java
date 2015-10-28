package cn.com.luyong.core.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonTest{
	static Singleton instance;
	
	public static void main(String[] args) throws InterruptedException {
		testSingleton();
	}
	
	public static void testSingleton() throws InterruptedException{
		ExecutorService executor=Executors.newFixedThreadPool(10);
		List<Callable<String>> threads=generatorTasks(10);
		executor.invokeAll(threads);
	}

	private static List<Callable<String>> generatorTasks(int size) {
		List<Callable<String>> tasks=new ArrayList<Callable<String>>();
		for(int i=0;i<size;i++){
			tasks.add(new Callable<String>() {
				public String call() throws Exception {
					for(int k=0;k<1000;k++){
//						try {
//							Thread.sleep(50);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
						instance=Singleton.getInstance();
						System.out.println("计数："+instance.getCount());
					}
					
					return null;
				}
			});
		}
		return tasks;
	}
	

}
