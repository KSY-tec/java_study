package ex01;
import java.util.Scanner;
public class Prac220317 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int[][] n= {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		for (int j=0;j<n.length;j++) {
			for (int i=0;i<n[j].length;i++) {
				System.out.print(n[j][i]+" ");
			}
			System.out.println();
		}
		
		System.out.println("------2번문제 ------");
		
		System.out.print("소문자 알파벳 하나를 입력하시오.>>");
		String alp2=scan.next();
		char alp=alp2.charAt(0);

		String tb="abcdefghijklmnopqrstuvwxyz";
		

		String sum="";
		for(int i=0;i<=tb.length();i++) {
			if(alp!=tb.charAt(i)) {
				sum+=tb.charAt(i);
			}
			else {
				sum+=tb.charAt(i);
				break;
			}
		}

		for(int j=sum.length();j>0;j--) {
			for(int g=0;g<j;g++)
				System.out.print(sum.charAt(g));
			System.out.println();
		}


		System.out.println("------3번문제 ------");
		
		int[] unit= {50000,10000,1000,500,100,50,10,1};
		System.out.print("금액을 입력하시오>>");
		int money = scan.nextInt();
		System.out.println("오만원권 "+money/unit[0]+"매");
		System.out.println("만원권 "+money%unit[0]/unit[1]+"매");
		System.out.println("천원권 "+money%unit[0]%unit[1]/unit[2]+"매");
		System.out.println("백원 "+money%unit[0]%unit[1]%unit[2]/unit[3]+"개");
		System.out.println("오십원 "+money%unit[0]%unit[1]%unit[2]%unit[3]/unit[4]+"개");
		System.out.println("십원 "+money%unit[0]%unit[1]%unit[2]%unit[3]%unit[4]/unit[5]+"개");
		System.out.println("일원 "+money%unit[0]%unit[1]%unit[2]%unit[3]%unit[4]%unit[5]/unit[6]+"개");
		
		scan.close();
	}

	}
	
