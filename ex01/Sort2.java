package ex01;

import java.util.Scanner;

//삽입정렬

public class Sort2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("정수 1개 입력>>");
		int num=scanner.nextInt();
		
		int[] tb= {35, 9, 8, 18, 98, 31, 58, 17, 76, 45};
		
		for(int i=1;i<tb.length;i++) {
			for(int j=0;j<i;j++) {
				if(tb[i]<tb[j]) {
					int temp;
					temp=tb[i];
					tb[i]=tb[j];
					tb[j]=temp;
				}
				
			}

		}
		for(int i=0;i<tb.length;i++) {
			System.out.print(tb[i]+"\t");
		}
		
		System.out.println();
		
		//입력값 몇번째 출력
		
		for(int i=0;i<tb.length;i++) {
			if(num<tb[i]) {
				System.out.print(i);
				break;
			}
		}
		
		scanner.close();
	}
}

