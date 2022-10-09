package test;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("10<=N<=100 범위의 숫자 N을 입력하시오>>");
		int n=scanner.nextInt();

		
		int z=1;
		int[] tb=new int [n];

		
		for (int i=0;i<n;i++) {
			if (i==0||i==1) {
				tb[i]=z;
				continue;
			}

			z=tb[i-2]+tb[i-1];
			if(z>=2147483647) {
				break;
			}
			
			tb[i]=z;
		}

		scanner.close();

		for(int i=0;i<n;i++) {

			if(i%10==0) {
				System.out.println(" ");
			}
			if(tb[i]>=2147483647||tb[i]<0) {
				break;
			}
			System.out.print(tb[i]+"\t");
			

		}

	}

}
