package com.briup.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "tom");
		map.put(2, "jack");
		map.put(3, "rose");
		map.put(1, "mark");
		map.put(4, "mark");
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		for (Object object : set) {
			System.out.println(object);
		}

		/*
		 * List<String> list = new ArrayList<>(); list.add("hello world");
		 * list.add("hello world"); list.add("hello"); list.add("world");
		 * System.out.println(list.isEmpty());
		 * System.out.println(list.contains("world")); // list.clear();
		 * list.remove("world"); System.out.println(list.get(2));
		 * Iterator<String> iterator = list.iterator(); while
		 * (iterator.hasNext()) { System.out.println(iterator.next()); }
		 */
		/*
		 * set是有序不可重复 Set<Object> set = new HashSet<Object>(); set.add(10);
		 * set.add(20); set.add(true); set.add(Math.random());
		 * set.add("hello world"); System.out.println(set.size()); for (Object
		 * object : set) { System.out.println(object); }
		 */
	}
}
