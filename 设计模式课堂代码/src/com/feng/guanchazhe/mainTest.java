package com.feng.guanchazhe;

public class mainTest {
	public static void main(String[] args) {
		Person person1 = new Person("С��", "����Ʊ����");
		Person person2 = new Person("����", "��С��Ӱ");
		Boss boss = new Boss();
		boss.setSubjectAction("���ǵĻʵۻ�����");
		boss.addObserver(person1);
		boss.addObserver(person2);
		boss.notifyObserver();

		Secretary secretary = new Secretary();
		secretary.addObserver(person1);
		secretary.addObserver(person2);
		secretary.setSubjectAction("���ǵĻʵۻ�����");
		secretary.notifyObserver();
	}
}