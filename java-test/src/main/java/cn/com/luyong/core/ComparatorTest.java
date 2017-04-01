package cn.com.luyong.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
	public static void main(String[] args) {
		List<Integer> numList =Arrays.asList(1,2,13,4);
		Collections.sort(numList, new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2) {
				int n1=(Integer)o1;
				int n2=(Integer)o2;
				return n1-n2;
			}
			
		});
		
		System.out.println(numList.get(0));
		}

}
