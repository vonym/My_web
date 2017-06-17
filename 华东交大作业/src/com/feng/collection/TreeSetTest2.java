package com.feng.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2 {
	private int num;

	public TreeSetTest2(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TreeSetComparator1 comparator = new TreeSetComparator1();
		Set<TreeSetTest2> set = new TreeSet<>(comparator);
		for (int i = 1; i <= 10; i++) {
			TreeSetTest2 treeSetTest2 = new TreeSetTest2(i);
			set.add(treeSetTest2);
		}
		System.out.println(set.size());
		for (TreeSetTest2 treeSetTest2 : set) {
			System.out.println(treeSetTest2.getNum());
		}
	}

}

@SuppressWarnings("rawtypes")
class TreeSetComparator1 implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		TreeSetTest2 treeSetTest1 = (TreeSetTest2) obj1;
		TreeSetTest2 treeSetTest2 = (TreeSetTest2) obj2;
		int returnNum = 0;
		if ((treeSetTest1.getNum() % 2) == (treeSetTest2.getNum() % 2)) {
			if (treeSetTest1.getNum() % 2 == 1 && treeSetTest2.getNum() % 2 == 1)
				returnNum = 1;
			else if (treeSetTest1.getNum() % 2 == 0 && treeSetTest2.getNum() % 2 == 0)
				returnNum = -1;
		} else {
			if (treeSetTest1.getNum() % 2 == 1 && treeSetTest2.getNum() % 2 == 0)
				returnNum = -1;
			else if (treeSetTest1.getNum() % 2 == 0 && treeSetTest2.getNum() % 2 == 1)
				returnNum = 1;
		}
		return returnNum;
	}
}