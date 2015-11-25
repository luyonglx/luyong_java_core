package cn.com.luyong.core.java_test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) {
		System.out.println("用时：");
		test3();
	}
	
	public static long  test1(){
		long start=System.currentTimeMillis();
		System.out.println("计时开始");
		Timer timer=new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("等待4秒了");
				return;
			}
		}, 4000);
		timer.cancel();
		System.out.println("计时结束");
		return System.currentTimeMillis()-start;
	}
	
	public static long  test2(){
		long start=System.currentTimeMillis();
		System.out.println("计时开始");
		ScheduledExecutorService scheduledService = Executors.newScheduledThreadPool(1);
		scheduledService.schedule(new Runnable() {
			public void run() {
				System.out.println("执行等待6秒的操作");
			}
		}, 6, TimeUnit.SECONDS);
		System.out.println("计时结束");
		return System.currentTimeMillis()-start;
	}
	
	public static void test3(){
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DAY_OF_YEAR, -1);
		String date = sdfDate.format(cal.getTime());
		System.out.println(date);
	}
	
	
}
