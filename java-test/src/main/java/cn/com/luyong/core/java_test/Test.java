package cn.com.luyong.core.java_test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) {
//		Test test=new Test();
//		//System.out.println(test.getPhones().size());
//		
//		String str1="卢勇，用例";
//		String str2="卢勇";
//		System.out.println(strAppend(str1, str2));
		//test6();
		testDate();
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
	
	public static void test4(String str){
		str="test4";
	}
	
	public static void test5(){
		String str="test5";
		test4(str);
		System.out.println(str);
	}
	
	public static void test6(){
		String str="79000";
		char num=str.charAt(0);
		int duration=Integer.parseInt(String.valueOf(num))-1;
		System.out.println(duration);
	}
	
	private List<String> getPhones() {
		List<String> phones = new ArrayList<String>();
		this.distinctPhone(phones,"电话1");
		this.distinctPhone(phones,"电话2");
		this.distinctPhone(phones, "电话3");
		return phones;
	}

	private void distinctPhone(List<String> phones, String phone) {
		if (phone != null && phone.length() > 0 && !phones.contains(phone)) {
			phones.add(phone);
		}
	}
	
	private static  String strAppend(String orgSource, String source) {
		if(orgSource==null || orgSource.length()==0){
			orgSource=source;
		}else if(!orgSource.contains(source) && !source.contains(orgSource)){
			orgSource+=","+source;
		}
		
		return orgSource;
	}
	
	private static void testDate(){
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DAY_OF_YEAR, -1);
		String date = sdfDate.format(cal.getTime());
		System.out.println(date);
	}
}
