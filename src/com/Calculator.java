package com;

public class Calculator {
	private double One;
	private double Two;
	private String Op;
	private double Result;
	public Calculator () {
		
	}
	
	public void setOne(double one) {
		One = one;
	}
	public void setTwo(double two) {
		Two = two;
	}
	public void setOp(String op) {
		Op = op;
	}
	public double getResult() {
		return this.Result;
	}
	
	
	public double performOp() {
		if(this.Op.equals("+")) {
			this.Result = this.One + this.Two;
		}
		else if(this.Op.equals("-")) {
			this.Result = this.One - this.Two;
		}
		else if(this.Op.equals("*")) {
			this.Result = this.One * this.Two;
		}
		return this.Result;
	}
	
	
	
}
