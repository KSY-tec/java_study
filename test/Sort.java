package test;
//import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scanner=new Scanner(System.in);
		System.out.print("점수입력>>");
		int[] pt= {scanner.nextInt()};
		
		for(int i=0;i<pt.length;i++) {
			System.out.print(pt[i]);
		}
		
		scanner.close();
		*/
		
		int pt[]= {41,31,48,97,9,65,27,29,13,15};

		
		for(int j=0;j<pt.length;j++) {
			int big=0;
			int ind=0;
			
			for(int i=0;i<pt.length-j;i++) {
				if(pt[i]>big) {
					big=pt[i];
					ind=i;
				}
			}
			int temp=pt[pt.length-1-j];
			pt[pt.length-1-j]=big;
			pt[ind]=temp;
			//System.out.print(big);
			}
		
		
		for (int i=0;i<pt.length;i++) {
			System.out.print(pt[i]+"\t");
		}


	}

}
