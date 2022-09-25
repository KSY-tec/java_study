package ex01;

import java.util.Scanner;

public class Exam1_1 {
	public static void main(String[] args) {
	//사용자의 이름을 물어보고 이어서 2개의 정수를 받아서 덧셈을 한 후에 결과를 출력하는 다음과 같은 프로그램을 작성하시오.
	//이름을 입력하시오 : 홍길동
	//홍길동씨, 안녕하세요?
	//JAVA에 오신 것을 환영합니다.
	//첫 번째 정수를 입력하시오 : 300
	//두 번째 정수를 입력하시오 : 400
	//300과 400의 합은 700입니다.
		Scanner scanner=new Scanner(System.in);
		System.out.print("이름을 입력하시오 : ");
		String name = scanner.next();	
		System.out.println(name+"씨, 안녕하세요?");
		System.out.println("JAVA에 오신 것을 환영합니다.");
		System.out.print("첫 번째 정수를 입력하시오 : ");
		int num1 = scanner.nextInt();
		System.out.print("두 번째 정수를 입력하시오 : ");
		int num2 = scanner.nextInt();
		System.out.println(num1+"과"+num2+"의 합은 "+(num1+num2)+"입니다.");
		scanner.close();

	}
}
