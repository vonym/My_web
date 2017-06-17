package com.briup.day9;

interface A {
	public void testa();
}

abstract class GenderC {
	private String name;
	public final static GenderC FEMALE = new GenderC("FEMALE") {
		public void desc() {
		}
	};
	public final static GenderC MALE = new GenderC("MALE") {
		public void desc() {
		}
	};

	private GenderC(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void desc();
}

enum Gender implements A {
	FEMALE(0) {
		public void testa() {
		}
	},
	MALE(1) {
		public void testa() {
		}
	};
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private Gender(int id) {
		this.id = id;
	}
}

public class EnumTest {
	public static void main(String[] args) {
		Gender g1 = Gender.FEMALE;
		// Gender g2=Gender.MALE;
		System.out.println(g1.name());
		System.out.println(g1.ordinal());
		Gender[] gs = Gender.values();
		for (Gender gender : gs) {
			System.out.println(gender);
		}
		switch (g1) {
		case FEMALE:
			break;
		case MALE:
			break;
		}
	}
}