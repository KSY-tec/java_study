package ex01;

import java.util.Scanner;

public class Exam1_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자로 부터 분자와 분모 값을 입력 받아 몫과 나머지를 출력하는 프로그램을 작성하시오.
		//분자를 입력하시오 : 7
		//분모를 입력하시오 : 4
		//나눗셈의 몫 = 1
		//나눗셈의 나머지 = 3
		Scanner scanner= new Scanner(System.in);
		System.out.print("분자를 입력하시오 : ");
		int son=scanner.nextInt();
		System.out.print("분모를 입력하시오 : ");
		int mom=scanner.nextInt();
		System.out.println("나눗셈의 몫 = "+son/mom);
		System.out.println("나눗셈의 나머지 = "+son%mom);
		scanner.close();
	}
}
