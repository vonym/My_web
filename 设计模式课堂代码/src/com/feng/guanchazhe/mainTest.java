package com.feng.guanchazhe;

public class mainTest {
	public static void main(String[] args) {
		Person person1 = new Person("小明", "看股票行情");
		Person person2 = new Person("老王", "下小电影");
		Boss boss = new Boss();
		boss.setSubjectAction("你们的皇帝回来了");
		boss.addObserver(person1);
		boss.addObserver(person2);
		boss.notifyObserver();

		Secretary secretary = new Secretary();
		secretary.addObserver(person1);
		secretary.addObserver(person2);
		secretary.setSubjectAction("我们的皇帝回来了");
		secretary.notifyObserver();
	}
}