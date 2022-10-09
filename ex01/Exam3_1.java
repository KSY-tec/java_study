package ex01;
//Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 다음 예시와 같이 출력하는 프로그램을 작성하시오.(1$=1,200원)
//원화를 입력하세요(단위 원)>>예(3300)
//3,300원은 $3.0입니다.

import java.util.Scanner;

public class Exam3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		int money=scanner.nextInt();
		System.out.print(money+"원은 $"+(double)money/1100+"입니다");
		scanner.close();

	}

}
