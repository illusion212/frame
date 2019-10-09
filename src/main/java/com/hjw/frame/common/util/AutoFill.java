package com.hjw.frame.common.util;

import com.google.common.collect.Lists;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public class AutoFill {
	public static void autoFill(Object src, Object dest) {
		List<Field> fdsAList = Lists.newLinkedList();
		List<Field> fdsBList = Lists.newLinkedList();
		getList(src.getClass(), fdsAList);
		getList(dest.getClass(), fdsBList);
		for (Field fieldA :fdsAList) {
			//AccessibleTest类中的成员变量为private,故必须进行此操作
			fieldA.setAccessible(true);
			//去除serialVersionUID导致的报错
			if (fieldA.getName().equals("serialVersionUID")) {
				continue;
			}
			for (Field fieldB : fdsBList) {
				if (fieldB.getName().equals(fieldA.getName())) {
					try {
						//将int和integer当做同一种类型，方便操作
						if ((fieldA.getType().equals(Integer.class) && fieldB.getType().equals(int.class) && fieldA.get(src) != null) ||
								(fieldB.getType().equals(Integer.class) && fieldA.getType().equals(int.class)) || fieldB.getType().equals(fieldA.getType())) {
							fieldB.setAccessible(true);
							fieldB.set(dest, fieldA.get(src));
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	private static void getList(Class<?> tmpClass, List<Field> list){
		while (!tmpClass.equals(Object.class)) {
			Field[] fds = tmpClass.getDeclaredFields();
			Collections.addAll(list, fds);
			tmpClass = tmpClass.getSuperclass();
		}
	}
}
