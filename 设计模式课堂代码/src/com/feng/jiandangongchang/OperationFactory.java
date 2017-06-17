package com.feng.jiandangongchang;

public class OperationFactory {
	public static OperationFactory createOperate(String operate) {
		Operation operation = null;
		switch (operate) {
		case "+":
			operation = new OperationAdd();
			break;
		case "-":
			operation = new OperationSub();
			break;
		case "*":
			operation = new OperationMul();
			break;
		case "/":
			operation = new OperationDiv();
			break;
		}
		return operation;
	}
}