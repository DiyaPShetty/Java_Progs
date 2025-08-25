package car;

public class Cars {
	private String brand;
	private String  model;
	private double price;
	private double mileage;
	private String ownerName;
	
	private static  int totalcars;
	private static String showroomname="city motors";
	public Cars(String b,String m,double p,double mil)
	{
		brand=b;
		model=m;
		price=p;
		mileage=mil;
		ownerName="not assigned";
		totalcars++;
	}
	public Cars(String b,String m,double p,double mil,String owner)
	{
		brand=b;
		model=m;
		price=p;
		mileage=mil;
		ownerName=owner;
		totalcars++;
	}
	public String getownername()
	{
	return ownerName;	
	}
	public void setownername(String ownerName)
	{
		ownerName="owner";
	}
	public void displaydetails()
	{
		System.out.println("Brand: "+brand);
		System.out.println("model: "+model);
		System.out.println("Price: "+price);
		System.out.println("mileage:"+mileage);
		System.out.println("owner: "+ownerName);
	}
	public void updateprice(double newprice)
	{
		price=newprice;


}
public static void showtotalcars()
{
	System.out.println("Total cars: "+totalcars);
}
public static void showshowroomname()
{
	System.out.println("showroom: "+showroomname);
}


}
