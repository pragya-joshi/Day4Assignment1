package day4;

public class Calculator {
	public double findAvg(float num1,float num2,float num3) {
		float avg=(num1+num2+num3)/3;
		return Math.round(avg*100.0)/100.0;
	}
	public double findAvg(float num1,float num2,float num3,float num4) {
		float avg=(num1+num2+num3+num4)/4;
		return Math.round(avg*100.0)/100.0;
	}
	public double findAvg(float num1,float num2,float num3,float num4,float num5) {
		float avg=(num1+num2+num3+num4+num5)/5;
		return Math.round(avg*100.0)/100.0;
	}
}
