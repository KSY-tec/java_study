package ex01;
import java.util.Scanner;
public class Exam3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오.>>");
		int tri1=scanner.nextInt();
		int tri2=scanner.nextInt();
		int tri3=scanner.nextInt();
		if(tri1<=tri2+tri3 && tri3<=tri1+tri2 && tri2<=tri3+tri1) {
			System.out.println("삼각형이 됩니다.");
		}
		scanner.close();
	}

}
