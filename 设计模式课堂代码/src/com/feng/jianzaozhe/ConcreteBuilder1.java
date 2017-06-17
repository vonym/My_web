package com.feng.jianzaozhe;

public class ConcreteBuilder1 extends Builder {
	private Product product;

	@Override
	public void BuildPartA() {
		product.Add("����A");
	}

	@Override
	public void BuildPartB() {
		product.Add("����B");
	}

	@Override
	public Product GetResult() {
		return product;
	}

}
