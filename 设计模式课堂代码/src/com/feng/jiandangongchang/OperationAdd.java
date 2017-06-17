package com.feng.jiandangongchang;

public class OperationAdd extends Operation {
	public double getResult() {
		return getNum_A() + getNum_B();
	}
}

class OperationSub extends Operation {
	public double getResult() {
		return getNum_A() - getNum_B();
	}
}

class OperationMul extends Operation {
	public double getResult() {
		return getNum_A() * getNum_B();
	}
}

class OperationDiv extends Operation {
	public double getResult() {
		return getNum_A() / getNum_B();
	}
}