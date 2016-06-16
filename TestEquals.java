package javaProject1;

class TestEquals {

	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("java");
		String str3 = str2;
		if (str1 == str2)
			System.out.println("equal");
		else System.out.println("do not equal");
		if (str1.equals(str2))
			System.out.println("equal");
		else System.out.println("do not equal");
		if (str2 == str3)
			System.out.println("equal");
		else System.out.println("do not equal");

	}

}
