package ex01;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 :");
		int num1=scan.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 :");
		int num2=scan.nextInt();
		
		int n=num1;
		int m=num2;
		
		if (n>m) {
			num1=m;
			num2=n;
		}
		
		num1--;
		//num1--;
		
		int[] tb=new int[num2];
		
		for(int i=1;i<=num2;i++) {
			tb[i-1]=i+1;
		}
		/*
		for(int i=0;i<num2-1;i++) {

			if (tb[i]%2==0) {
				//tb[i]=0;
				System.out.print("0"+" ");
			}
			else {
				System.out.print(tb[i]+" ");
			}
		*/
		
		/*
		for(int test=0;test<num2-1;test++) {
			System.out.print(tb[test]+" ");
		}
		*/
		
		for (int j=2;j<num2-2;j++){
			for(int i=0;i<num2-1;i++) {
				if (tb[i]%j==0&&tb[i]!=j) {
					tb[i]=0;
					//System.out.print("0"+" ");
				}
				else {
					//System.out.print(tb[i]+" ");
				}	
			}
			//System.out.println();
		}
		
		/*
		for (int z=0;z<num2-1;z++) {
			if (tb[z]!=0) {
				System.out.print(tb[z]+" ");
			}
		}
		*/

		

		for (int z=num1;z<num2-1;z++) {
			if (tb[z]!=0) {
				System.out.print(tb[z]+" ");


		scan.close();
		}
		
	
	}
	}
	}



/*
입력 : 2개의 양의 정수 N, M을 입력한다.​

출력 : 입력한 범위 내에 존재하는 모든 소수의 수를 출력한다.
(각 줄마다 10개가 나오면 다음 줄로 이동하여 출력한다.) 마지막에 한 줄을 띄어 주어진 범위 내에 있는 소수의 개수를 출력한다.
*/