package lab1;

public class Employee {
	String name;
	int id;
	double salary;
	//detail
	public Employee(String name,int id,double salary)
	{
	this.name=name;
	this.id=id;
	this.salary=salary;
	}
	void details()
	{
		System.out.println("name is:"+name);
		System.out.println("id is:"+id);
		System.out.println("salary is:"+salary);
		
	}
	void increasesalary(double percentage)
	{
		salary+=(salary*percentage)/100;
	}
	

}
