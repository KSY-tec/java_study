package ex01;

import java.util.Scanner;

public class Exam2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num =scanner.nextInt();
		System.out.println((num%2==0)?"짝수입니다":"홀수입니다");
		scanner.close();
	}
}
