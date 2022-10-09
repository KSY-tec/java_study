package ex01;

public class Prac220408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] a= new int[]{1,2,3,4,5};
//		
//		for(int k:a) {
//			System.out.println(k);
//		}
		
		int[][] a= {{1,3,5},{7,9}};
		
		for(int[] k:a) {
			for(int kk:k) {
				System.out.print(kk);
			}
			System.out.println();
		}
		
		String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다";
		String name;
		int age;
		
		name=str.substring((int)str.indexOf("[")+1,(int)str.indexOf("[")+4);
		
		age=Integer.parseInt(str.substring(21, 23));
		
		
		System.out.println(name);
		System.out.println(age);

	}

}
