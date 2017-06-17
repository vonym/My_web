package com.feng.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//public class TreeSetTest implements Comparable {
//	private String str;
//
//	public TreeSetTest(String str) {
//		this.str = str;
//	}
//
//	public static void main(String[] args) {
//		// "HashSet"、"ArrayList"、"TreeMap"、"HashMap"、"TreeSet"、"LinkedList"
//		Set<String> set = new TreeSet<String>();
//		TreeSetTest t1 = new TreeSetTest("HashSet");
//		TreeSetTest t2 = new TreeSetTest("ArrayList");
//		TreeSetTest t3 = new TreeSetTest("TreeMap");
//		TreeSetTest t4 = new TreeSetTest("HashMap");
//		TreeSetTest t5 = new TreeSetTest("TreeSet");
//		TreeSetTest t6 = new TreeSetTest("LinkedList");
//		set.add(t1.str);
//		set.add(t2.str);
//		set.add(t3.str);
//		set.add(t4.str);
//		set.add(t5.str);
//		set.add(t6.str);
//		for (String str1 : set) {
//			System.out.println(str1);
//		}
//	}
//
//	@Override
//	public int compareTo(Object obj) {
//		TreeSetTest treeSetTest = (TreeSetTest) obj;
//		if (str.compareTo(treeSetTest.str) > 0)
//			return 1;
//		else if (str.compareTo(treeSetTest.str) < 0)
//			return -1;
//		else
//			return 0;
//	}
//}
public class TreeSetTest {
	private String str;

	public TreeSetTest(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TreeSetComparator comparator = new TreeSetComparator();
		Set<TreeSetTest> set = new TreeSet<>(comparator);
		TreeSetTest t1 = new TreeSetTest("HashSet");
		TreeSetTest t2 = new TreeSetTest("ArrayList");
		TreeSetTest t3 = new TreeSetTest("TreeMap");
		TreeSetTest t4 = new TreeSetTest("HashMap");
		TreeSetTest t5 = new TreeSetTest("TreeSet");
		TreeSetTest t6 = new TreeSetTest("LinkedList");
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		for (TreeSetTest treeSetTest : set) {
			System.out.println(treeSetTest.getStr());
		}
	}
}

@SuppressWarnings("rawtypes")
class TreeSetComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		TreeSetTest treeSetTest1 = (TreeSetTest) obj1;
		TreeSetTest treeSetTest2 = (TreeSetTest) obj2;
		if (treeSetTest1.getStr().compareTo(treeSetTest2.getStr()) > 0)
			return 1;
		else if (treeSetTest1.getStr().compareTo(treeSetTest2.getStr()) < 0)
			return -1;
		else
			return 0;
	}
}
