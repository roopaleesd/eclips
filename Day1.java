package build;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");
int x=10;
int y=5;
System.out.println(x+y);
System.out.println(x-y);
System.out.println(x*y);
System.out.println(x/y);
System.out.println(x%y);
int a=8;
int b=5;
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
System.out.println(a%b);
//calling the function
Calculator(12,4);
AdditionA();
AdditionB(12,3);
int q1=AdditionC(12,4);
System.out.println(q1);
System.out.println(q1+q1);
System.out.println(q1-4);


}
	public static void Calculator(int z,int s) {
		System.out.println(z+s);
		System.out.println(z-s);
		System.out.println(z*s);
		System.out.println(z/s);
		System.out.println();
	}
	//function without parameter and without return type
	public static void AdditionA() {
		System.out.println(9+9);
		System.out.println(9-9);
		System.out.println(9*9);
		System.out.println(9%9);
		System.out.println(9/9);
	}
	//function with parameter and without return type
	public static void AdditionB(int s,int d) {
		System.out.println(s+d);
	}
	//function with parameter and with return type
	
	//function with parameter and with return type
	public static int AdditionC(int h, int j) {
		return h+j;
		
	}
}


