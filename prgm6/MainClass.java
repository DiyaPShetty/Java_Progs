package lab6;

public class MainClass {
	public static void main(String[] args) throws Insufficientbalanceexception
	{
		Account account=new Account(452,"priya",50000.0);
		try{
				account.showBalance();
		        account.deposit(10000.0);
		        account.withdraw(10000.0);
		        account.showBalance();
		}
		catch(Insufficientbalanceexception e) {
			System.out.println("insufficient amount");
		}
		catch(ArithmeticException e) {
			System.out.println("amount canot be neagtive");
		}
		catch(Exception e) {
			System.out.println("other problem");
		}
	}
}
		
