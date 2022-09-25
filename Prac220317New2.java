package ex01;

public class Prac220317New2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] tb=new int[4][4];
		//int[][] tb= {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		//int[] lst=new int[16];
		/*
		for (int t=0;t>16;t++) {
			int i =(int)(Math.random() * 10 + 1);
			lst[t]=i;
		}
		*/
		
		
		for(int i=0;i<4;i++) {
			for (int j=0; j<4;j++) {
				//int n =(int)(Math.random() * 10+1);
				tb[i][j]=0;
				//System.out.print(tb[i][j]+" ");
			}
			//System.out.println();
		}
		
		/*
		for(int u=0;u<6;u++);{
			int g=(int)(Math.random() * 10 + 1);
			int h=(int)(Math.random() * 10 + 1);
			for(int k=0;k<6;k++);{
				if(0<=g&&g<=4&&0<=h&&h<=h) {
					tb[g][h]=0;
				}
				else {
					//continue;
				}
			}

		}
		*/
		int count=0;
		while(count<10) {
			int g=(int)(Math.random() * 10);
			int h=(int)(Math.random() * 10);
			if(g<4&&h<4) {
				//tb[g][h]=0;
				if (tb[g][h]==0) {
					tb[g][h]=(int)(Math.random() * 10+1);
					count++;
				}
			}
		}
			
		
		for(int i=0;i<4;i++) {
			for (int j=0; j<4;j++) {
			
				System.out.print(tb[i][j]+" ");
			}
			System.out.println();
			
		}
		

}
}
