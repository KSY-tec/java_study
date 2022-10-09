package ex01;

public class Sort1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tb={41,31,48,97,9,65,27,29,13,15};  
		
		/*
		for (int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
				if(tb[i]<tb[j]);{
					int t=tb[i];
					tb[i]=tb[j];
					tb[j]=t;
				}
			}
		}
		*/
		
		for(int j=0;j<9;j++)
			for(int i=0;i<9;i++){
				int max=tb[0];
				int temp;
				if(max>tb[i]) {
					temp=max;
					max=tb[i];
					tb[i]=temp;
				}
				temp=tb[9];
				tb[9]=max;
				tb[0]=temp;
			}
			


		
		for (int i=0;i<10;i++) {
			System.out.print(tb[i]+"\t");
		}
	}

}
