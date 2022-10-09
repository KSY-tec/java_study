package ex01;
import java.util.Scanner;
public class Exam3_5 {
	//원의 중심을 나타내는 한 점과 반지르을 실수 값으로 입력받고
	//실수 값으로 다른 (x, y)를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하시오.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("원의 중심과 반지름을 입력하시오.>>");
		double centX=scan.nextDouble();
		double centY=scan.nextDouble();
		double half=scan.nextDouble();
		System.out.print("점을 입력하시오.>>");
		double x=scan.nextDouble();
		double y=scan.nextDouble();
		if (((centX-x)*(centX-x))+((centY-y)*(centY-y))<=half*half)
			System.out.println("점("+x+", "+y+")는 원 안에 있습니다.");
		scan.close();
	}

}
