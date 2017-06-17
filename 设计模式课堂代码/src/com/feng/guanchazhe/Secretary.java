package com.feng.guanchazhe;

import java.util.ArrayList;
import java.util.List;

public class Secretary implements ISubject {
	private String subjectAction;
	private List<IObserver> list = new ArrayList<>();

	@Override
	public void addObserver(IObserver observer) {
		list.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		list.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (IObserver observer : list) {
			observer.display();
		}
	}

	public String getSubjectAction() {
		return subjectAction;
	}

	public void setSubjectAction(String subjectAction) {
		this.subjectAction = subjectAction;
	}
}
