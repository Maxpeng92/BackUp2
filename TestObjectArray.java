package javaProject1;

class Person
{
	String name;
	int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String talk()
	{
		return "I'm "+this.name+" and my age is "+this.age+".";
	}
}
	class Stu extends Person
	{
		String school;
		
		public Stu(String name, int age, String school)
		{
			super("Max",24);
			super.name = name;
			super.age = age;
			this.school = school;
		}
		
		public String talk()
		{
			return super.talk()+" I went to school at "+this.school+".";
		}
	}


public class TestObjectArray {

	public static void main(String[] args) {
		Person p = new Stu("Max",24,"Gatech");
		System.out.println(p.talk());
	}

}
