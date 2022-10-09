package ex02;


//class A{
//	
//}
//class B extends A{
//	
//}
//
//class C extends A{
//
//}
//
//class D extends B{
//	
//}

//class A{}
//class B extends A{}
//class C extends B{}
//class D extends C{}
//class E extends B{}

//class A{}
//class B extends A{}
//class C extends A{}
//class D extends B{}

//class kk extends Object{
//	String toStirng(int...values) {
//		
//		String zz= "";
//		return zz;
//	}
//}



class A{
	void hello() {
		System.out.println("안녕하세요");
	}
}
class B extends A{
	void hello() {
		System.out.println("반갑습니다");
	}
}

public class Prac220413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		A a1=new A();
//		A a2=new B();
//		A a3=new C();
//		A a4= new D();
//		
//		B b1=new A();
//		B b2=new B();
//		B b3=new C();
//		B b4=new D();
//		
//		C c1=new A();
//		C c2=new B();
//		C c3=new C();
//		C c4=new D();
//		
//		D d1=new A();
//		D d2=new B();
//		D d3=new C();
//		D d4=new D();
		
//		A a1=new A();
//		B b1=(B)a1;
//		C c1=(C)a1;
//		D d1=(D)a1;
//		E e1=(E)a1;
//		
//		A a2=new B();
//		B b2=(B)a2;
//		C c2=(C)a2;
//		D d2=(D)a2;
//		E e2=(E)a2;
//		
//		A a3=new C();
//		B b3=(B)a3;
//		C c3=(C)a3;
//		D d3=(D)a3;
//		E e3=(E)a3;
		
//		A aa=new A();
//		System.out.println(aa instanceof A);
//		System.out.println(aa instanceof B);
//		System.out.println(aa instanceof C);
//		System.out.println(aa instanceof D);
//		
//		A ad=new D();
//		System.out.println(ad instanceof A);
//		System.out.println(ad instanceof B);
//		System.out.println(ad instanceof C);
//		System.out.println(ad instanceof D);
		
		A aa=new A();
		aa.hello();
		
		B bb=new B();
		bb.hello();
		
		A ab=new B();
		ab.hello();
		
		new A().toString();
		

	}

}
