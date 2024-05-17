package lesson_5;
import java.util.Scanner;

public class ATM {

	
	int currect_pin=435;
	public void checkPin(int Pin) {
		
		if(currect_pin ==Pin) {
			
		System.out.println("Welcome");
					
		enterAmount(i);
		MaxWithdrawlAmount();
			}
		else
			System.out.println("Wrong pin try again");
	}
	
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();	
	public void enterAmount(int WithdrawlAmount) {
		System.out.println("enter amount"+i);
		
	}
	
	public void MaxWithdrawlAmount() {
		
		if (i >300) {
			
			System.out.println("Max Withdrawlis 300 only");}
			
			else
			{ AmountInTens();}
		}
		public void AmountInTens() {
			
			if((i%10)==0) {
				
				checkBalance();}
				
				else {
					
					System.out.println("Amount in Tens only" );
				}
			}
		
		public void checkBalance(){
			
			float Balance=3456.78f;
			float Current_Balance;
			Current_Balance =Balance-i;
			if(i<=Balance) {
				
				System.out.println(Current_Balance =Balance-i);
			}
			else
			{
				System.out.println("Insufficient fund");
			}
	}
	
	public static void main(String[] args) {
		
		ATM atm=new ATM();
		
		atm.checkPin(435);
		
		// atm.enterAmount();
	}

}
