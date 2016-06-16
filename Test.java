package javaProject1;

public class Test {
	static String a = "string_a";
	static String b;
	
	String c = "string_c";
	String d;
	
	public static void printStatic(String title){
		System.out.println("-------"+title+"-------");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	static
	{
		printStatic("before static");
		b = "string_b";
		printStatic("after static");
	}
	
	public void print(String title){
		System.out.println("-------"+title+"-------");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
	}
	public Test() {
		print("before constructor");
		d = "string_d";
		print("after constructor");
	}

	public static void main(String[] args) {
		new Test();
	}

}
