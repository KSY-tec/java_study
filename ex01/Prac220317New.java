package ex01;
import java.util.Scanner;
public class Prac220317New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("정수 몇 개? ");
		int n=scanner.nextInt();
		int tb[]=new int[n];
		for (int t=0;t<n;t++) {
			int i =(int)(Math.random()*100+1);
			if (i>=100) {
				continue;
			}
			for (int w=0;w<n;w++) {
				if(tb[w]!=i)
					tb[t]=i;
				else
					continue;
			}
			
		}
		for(int z=1;z<tb.length;z++) {
			System.out.print(tb[z]+" ");
		}
		System.out.println();
		System.out.print(tb.length);
		scanner.close();

	}

}
