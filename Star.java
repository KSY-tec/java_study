package ex01;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int z=0;z<10;z++) {
			if(z%2==0) {
			//짝
				for(int i=0;i<5;i++) {
					if(i!=4) {
						for(int j=0;j<5;j++) {
							if(i==j)
								System.out.print('*');
		
							else {
								System.out.print(' ');
							}
						}
						//System.out.println();
					}
					else {
						for(int m=0; m<5;m++) {
							System.out.print('*');
						}
					}
				}
			}
			else {
			//홀
				for(int i=5;i>=0;i--) {
					if(i!=0) {
						for(int j=0;j<5;j++) {
							if(i==j)
								System.out.print('*');
		
							else {
								System.out.print(' ');
							}
						}
						System.out.println();
					}
					else {
						for(int m=0; m<5;m++) {
							System.out.print('*');
						}
					}
				}
			}
		}
	*/
		for(int i=0;i<5;i++){
			for(int j=0;j<5*2-1;j++){
				if(i+j==4||i==4||i+4==j)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.print('\n');
		}
		/*
		 		for(int i=0;i<n;i++){
			for(int j=0;j<n*2-1;j++){
				if(i==n-1||j==n-1||i+j==n-1)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.print('\n');
		 */
	}

}
