package ex01;

import java.util.Scanner;

public class Exam2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("화씨 온도 : ");
		double tem=scanner.nextDouble();
		System.out.println((tem-32)*5/9);
		scanner.close();

	}
}
