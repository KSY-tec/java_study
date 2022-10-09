package ex01;
import java.util.Scanner;
public class Exam220316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 :");
		int num1=scan.nextInt();
		System.out.print("두번째 정수를 입력하세요 :");
		int num2=scan.nextInt();
		int big;
		int small;
		if (num1>num2) {
			big=num1;
			small=num2;
		}
		else {
			small=num1;
			big=num2;
		}
		
		long orib=big;
		long oris=small;
		
		int ans1;
		long ans2;
		
		if (big/small==0) {
			ans1=small;
			ans2=big*small/small;
			System.out.println("최대공약수 = "+ans1);
			
			System.out.println("최소공배수 = "+ans2);
		}
		else {

			int i=big%small;
			int big2=small;
			int small2=big%small;
			while (i!=0) {

				big2=small;
				small2=big%small;
				big=big2;
				small=small2;
				i=big2%small2;
			}
			ans1=small;
			
			ans2=orib*oris/small;
			System.out.println("최대공약수 = "+ans1);
			
			System.out.println("최소공배수 = "+ans2);

		}

		
		scan.close();

	}

}
