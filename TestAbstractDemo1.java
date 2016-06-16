package javaProject1;

abstract class Peren
{
	String name;
	int age;
	String occupation;
	public Peren(String name, int age, String occupation)
	{
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	public abstract String talk();
}

class Sperson extends Peren
{
	public Sperson(String name, int age, String occupation)
	{
		super(name, age, occupation);
	}
	public String talk()
	{
		return "Name: "+this.name+" Age: "+this.age+" Occupation: "+this.occupation;
	}
}

class Worker extends Peren
{
	public Worker(String name, int age, String occupation)
	{
		super(name, age, occupation);
	}
	public String talk()
	{
		return "Worker Name: "+this.name+" Age: "+this.age+" Occupation: "+this.occupation;
	}
}

public class TestAbstractDemo1 
{

	public static void main(String[] args) 
	{
		Sperson s = new Sperson("Max",24,"Student");
		Worker w = new Worker("Bob",33,"Worker");
		System.out.println(s.talk());
		System.out.println(w.talk());
	}

}
