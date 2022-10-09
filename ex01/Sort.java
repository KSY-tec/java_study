package ex01;
import java.util.Scanner;

//선택정렬 자작
public class Sort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		//41 31 48 97 9 65 27 29 13 15
		//int[] tb={41,31,48,97,9,65,27,29,13,15};
		
		
		//값 입력
		int[] tb=new int[10];
		System.out.print("10개 점수 입력>>");
		for (int i=0;i<10;i++) {
			tb[i]=scanner.nextInt();
		}
		
		int[] orig=new int[10];
		
		for(int i=0;i<10;i++) {
			orig[i]=tb[i];
		}
		
		//오름차순
		for(int z=0;z<tb.length;z++) {
			int t=0;
			int num=0;
			for(int i=0;i<tb.length-z;i++) {
				if(t<tb[i]) {
					t=tb[i];
					num=i;
				}
			}
			tb[num]=tb[tb.length-1-z];
			tb[tb.length-1-z]=t;
		}
	
		
		//내림차순
		for (int i=0;i<tb.length;i++)
			for(int j=i+1;j<tb.length;j++) {

				if(tb[i]<tb[j]);{
					int t=tb[i];
					tb[i]=tb[j];
					tb[j]=t;
				}
			}
		
		//등급부여
		String[] point={"A+","A+","A","B+","B","C+","C","D+","D","F"};
		String[] origtxt=new String[10];
		
		for (int i=0;i<tb.length;i++)
			for(int j=0;j<tb.length;j++) {
				if(tb[i]==orig[j]) {
					origtxt[j]=point[i];
					break;
				}
			}
		
		/*
		//오름차순 출력
		for (int i=0;i<tb.length;i++) {
			System.out.print(tb[i]+"\t");
		}
		System.out.println();
		*/
		
		//점수출력
		for (int i=0;i<tb.length;i++) {
			System.out.print(origtxt[i]+"\t");
		}
		
		
		//System.out.println(num+"\t");
		//System.out.println(t+"\t");
		scanner.close();
	}

}

