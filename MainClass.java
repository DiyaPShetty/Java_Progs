package codes1;

public class MainClass1 {
	public static void main(String[] args)
	{
		  Employee e1=new Employee("mohan",1,10000.0d);
		  Employee e2=new Employee("michal",2,20000.0d);
		  //intial details
		  System.out.println("intial employee details are");
		e1.details();
		e2.details();
		//increase salary
		
		 e1.increasesalary(10.0d);
		e2.increasesalary(20.0d);
		//display updated detais
		e1.details();
		e2.details();
		//declaring an array
		Employee[] array=new Employee[10];
		
		array[0]=new Employee("arun",3,1000.00d);
		//display all Employee
		for(int i=0;i<array.length;i++)
		{
			array[i].details();
			if(array[i].name.compareTo("arun")==0)
			{
				System.out.println("employee found");
			}
		}
	}
}

