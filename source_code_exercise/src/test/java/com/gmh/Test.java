package com.gmh;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) throws Exception {
		HashMap<String, Object> hashMap = new HashMap<String, Object>(15);
		hashMap.put(null, null);
		System.out.println(hashMap.get(null));
		hashMap.put(null, "gmh");
		System.out.println(hashMap.get(null));
//		System.out.println(hashMap);

//		Class<? extends HashMap> hashMapClass = hashMap.getClass();
//		Field threshold = hashMapClass.getDeclaredField("threshold");
//		threshold.setAccessible(true);
//		System.out.println(threshold.get(hashMap));
//
//		Method capacity = hashMapClass.getDeclaredMethod("capacity");
//		capacity.setAccessible(true);
//		System.out.println(capacity.invoke(hashMap));
//
//		for (int i = 0; i < 20; i++) {
//			hashMap.put(i + "", i);
//			System.out.print("threshold:" + threshold.get(hashMap));
//			System.out.print("capacity:" + capacity.invoke(hashMap));
//			System.out.println("map中元素个数:" + hashMap.size());
//		}
	}
}
