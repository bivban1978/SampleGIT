package com.samplegit;

public class Compute {
	int a;
	int b;
	Compute(int a, int b){
		this.a = a;
		this.b = b;
	}
	int add() {
		return this.a + this.b;
	}
	int subtract() {
		return this.a - this.b;
	}
	int multiply() {
		return this.a * this.b;
	}
	int divide() {
		return this.a / this.b;
	}
}
