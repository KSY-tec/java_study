package ex01;
import java.util.Scanner;
public class Exam3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("점 (x, y)의 좌표를 입력하시오.>>");
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		if(100<=x && x<=200 && 100<=y&& y<=200) {
				System.out.print("("+x+", "+y+")"+"는 사각형 안에 있습니다.");
		}
		scanner.close();

	}

}
