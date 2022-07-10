package week1.day2;

public class Calculator {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void sub(int a, float b) {
		System.out.println(a-b);
	}
	public void multiply(double a, int b, double c) {
		System.out.println(a*b);
		System.out.println(b*c);
		System.out.println(a*c);
	}
	public void div(long a, double b, float c) {
		System.out.println(a/b);
		System.out.println(b/c);
		System.out.println(a/c);
	}
	public static void main(String[] args) {
		Calculator cal= new Calculator();
		cal.add(10,20);
		cal.sub(3, 1.2f);
		cal.multiply(3.50, 1, 1.2450);
		cal.div(110, 1.234, 1.2f);
	}
}
