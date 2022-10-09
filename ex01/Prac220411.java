package ex01;

import java.util.Arrays;

class A0411{
	
//	void print() {
//		System.out.println("입력값이 없습니다.");
//	}
//	void print(int n) {
//		System.out.println(n);
//	}
//	void print(double n) {
//		System.out.println(n);
//	}
//	void print(String n) {
//		System.out.println(n);
//	}
	
//	static void averageScore(int...values) {
//		int count=0;
//		for(int i : values) {
//			count+=i;
//		}
//		
//		System.out.println((double)count/values.length);
//		}
	
//	A0411(int k){
//	}
//	A0411(double a, double b){
//		
//	}
	
//	boolean a;
//	int b;
//	double c;
//	String d;
//	void abc() {
//		System.out.println(b+c);
//		System.out.println(c+d);
//		System.out.println(d+a);
//	}
	
//	void abc(int m) {
//		m=8;
//	}
//	void bcd(int[] n) {
//		n[0]=4;n[1]=5;n[2]=6;
	
	int m=3;
	int n=5;
	void abc(int m, int n) {
		m=this.m;
		n=m;
	}
}

public class Prac220411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A0411 a=new A0411();
//		a.print();
//		a.print(3);
//		a.print(5.8);
//		a.print("안녕");
		
//		a.averageScore(1);
//		a.averageScore(1,2);
//		a.averageScore(1,2,3);
//		a.averageScore(1,2,3,4);
		
//		A0411 a1=new A0411(1);
//		A0411 a2=new A0411(1.0,1.0);
		
//		System.out.println(a.a);
//		System.out.println(a.b);
//		System.out.println(a.c);
//		System.out.println(a.d);
//		System.out.println();
//		a.abc();
		
//		int m=5;
//		int[] n= {1,2,3};
//		
//		a.abc(m);
//		a.bcd(n);
//		
//		System.out.println(m);
//		System.out.println(Arrays.toString(n));

		a.abc(7, 8);
		System.out.println(a.m);
		System.out.println(a.n);
	}

}
