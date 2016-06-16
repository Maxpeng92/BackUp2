package javaProject1;

interface Per
{
	String name = "Max";
	int age = 24;
	String occupation = "Student";

	public abstract String talk();
}

class Sdt implements Per
{

	public String talk()
	{
		return "Name: "+this.name+" Age: "+this.age+" Occupation: "+this.occupation;
	}
}

public class TestInterfaceDemo 
{

	public static void main(String[] args) 
	{
		Sdt s = new Sdt();
		System.out.println(s.talk());
	}

}
