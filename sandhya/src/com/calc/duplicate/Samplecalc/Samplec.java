package com.calc.duplicate.Samplecalc;

public class Samplec 
{
	int num1, num2, add, sub;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getAdd() {
		return add;
	}

	public void setAdd(int add) {
		this.add = add;
	}

	public int getSub() {
		return sub;
	}

	public void setSub(int sub) {
		this.sub = sub;
	}
	public int sum()
	{
		this.add=getNum1()+getNum2();
		return add;
	}
	public int subs()
	{
		this.sub=getNum1()+getNum2();
		return sub;
	}
}
