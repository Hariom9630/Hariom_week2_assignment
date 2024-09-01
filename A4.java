class person
{
	static String name;
 static	int age;
	person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	static void displayInfo()
	 {
		 System.out.println("name="+name);
		 System.out.println("age="+age);
	 }
	public static void main (String ar[]) 
	{
		person p=new person("ram",20);
		p.displayInfo();
	}
}