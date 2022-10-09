package test;

public class Rand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] rand=new int [4][4];
		//System.out.print(Math.random());
		
		for (int i=0;i<rand.length;i++) {
			for(int j=0;j<rand[1].length;j++) {
				//System.out.print((int)(Math.random()*10+1)+" ");
				rand[i][j]=0;
			}
			//System.out.println();
		}

		int count=0;
		int x;
		int y;
		while(count<10) {
			
			
			x=(int)(Math.random()*10);
			y=(int)(Math.random()*10);
			
			if(x<4&&y<4){
				if(rand[x][y]==0) {
					rand[x][y]=(int)(Math.random()*10+1);
					count=count+1;
				}
			}
		}

			
		/*
		for (int i=0;i<xs.length;i++) {

			System.out.print(xs[i]+"\t");
			System.out.println(ys[i]);
		}
		*/


		
		for (int i=0;i<rand.length;i++) {
			for (int j=0;j<rand[1].length;j++) {
				System.out.print(rand[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
	
}
