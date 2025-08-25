 package car;


public class Showroom {
	public static void main(String[] args)
	{
	  Cars c1 = new Cars("Toyota", "Corolla", 15000, 18.5);
      Cars c2 = new Cars("Honda", "Civic", 20000, 16.0, "John");
      Cars c3 = new Cars("Hyundai", "i20", 12000, 20.0);

      c1.displaydetails();
      c2.displaydetails();
      c3.displaydetails();

      c1.setownername("Alice");  
      c1.updateprice(16000);

      System.out.println("After Updates:");
      c1.displaydetails();

      Cars.showshowroomname();
      Cars.showtotalcars();
  }
}

