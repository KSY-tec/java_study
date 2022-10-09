package ex01;

public class Prac220407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2 + 3 / 2);
		System.out.println(10 % 3 + 5 / 3);
		System.out.println((4 + 5 / 2) % 4);
		System.out.println();

		/*
		 * int a=5; int b=a++;
		 * 
		 * System.out.println(a); System.out.println(b); System.out.println(++a);
		 * System.out.println(++b); System.out.println(a++ + --b);
		 * System.out.println(a+b);
		 */

		System.out.println();

		System.out.println(3 < 3);
		System.out.println(5 >= 3);
		System.out.println(5 <= 5);
		System.out.println(5 == 5);
		System.out.println(5 != 5);
		System.out.println();

		System.out.println(false && true);
		System.out.println((4 >= 4) || (6 < 3));
		System.out.println(false ^ (3 >= 4));
		System.out.println(!(3 <= 3));
		System.out.println();

		System.out.println(7 << 2);
		System.out.println(7 >> 2);
		System.out.println(-7 << 2);
		System.out.println(-7 >> 2);
		System.out.println(-1 >>> 30);
		System.out.println();

		// 11111110
		// 1111 1111 1111 1111 1111 1111 1111 11

		// 1111 11 11111110

		int a = 4, b = 5, c = 6;
		System.out.println(a-- > 6 && false);
		System.out.println(true || b++ > 6);
		System.out.println(true ^ c++ > 6);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		/*
		 * int a=3; a<<=1; System.out.println(a); a&=5; System.out.println(a); a-=1;
		 * System.out.println(a*=2);
		 */
		
		 System.out.println(); 
		 System.out.println(5&3);
		 System.out.println(Integer.toBinaryString(5&3));
		 System.out.println();
		 System.out.println(5|3); 
		 System.out.println(Integer.toBinaryString(5|3));
		 System.out.println();
		 System.out.println(5^3);
		 System.out.println(Integer.toBinaryString(5^3)); 
		 System.out.println();
		 System.out.println(~5); 
		 System.out.println((Integer.toBinaryString(~5)));
		 System.out.println();
		 System.out.println(Integer.toBinaryString(~5).getBytes());
		 System.out.println();
		 System.out.println(~05);
		 
		 System.out.println();
		 System.out.println();
		 
		 int score=75;
		 
		 if(score>=90) {
			 System.out.println("A학점");
		 }
		 else if(score>=80) {
			 System.out.println("B학점");
		 }
		 else if(score>=70) {
			 System.out.println("C학점");
		 }
		 else {
			 System.out.println("F학점");
		 }
		 
		 System.out.println();
		 switch((score>=90)?1:(score>=80)?2:(score>=70)?3:4) {
		 case 1:{
			 System.out.println("A학점");
			 break;
		 }
		 case 2:{
			 System.out.println("B학점");
			 break;
		 }
		 case 3:{
			 System.out.println("C학점");
			 break;
		 }
		 case 4:{
			 System.out.println("F학점");
			 break;
		 }
			 
		 }
		 System.out.println();
		 for(int i=0;;i++) {
			 if(i%2==1) {
				 continue;
			 }
			 if (i>10) {
				 break;
			 }
			 System.out.println(i);
		 }
		 
		 System.out.println();
		 for(int i=10;i>0;i-=2) {
			 System.out.println(i);
		 }
		 System.out.println();
		 
//		 int i=10;
//		 while(i>0) {
//			 
//			 System.out.println(i);
//			 i-=2;
//		 }
		 
		 for(int i=0; i<5; i++) {
			 for(int j=0;j<3;j++) {
				 if(i==2) {
					 continue;
				 }
				 if(j==1) {
					 break;
				 }
				 System.out.println("A");
			 }
		 }
		 String s = "예";
		 switch(s) {
		 case "예" : System.out.println(); break;
		 case "아니요" : System.out.println(); break;
		 }
	}

}
