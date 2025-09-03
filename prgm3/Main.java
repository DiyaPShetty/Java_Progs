
package transport;

import transport.*;

public class Main {

	public static void main(String[] args)
	{
		   Ebike e = new Ebike("EB-101", 50 );
	        e.deliver("Sandwich", "Library" );

	       
	        //Vehicle v = new Vehicle("V-1"); // should not compile

	       
	        Drone d = new Drone("DR-1");
	        d.deliver("Notes", "ExamCell" );   // blocked
	        d.deliver("USB", "CSE Block");    // allowed

	        // 4) Payable demo
	        double bill = d.cost(5);
	        System.out.println("Drone delivery cost: Rs." + bill);

	}

}
