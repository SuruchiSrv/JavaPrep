package demo;

public class ReverseNum {

	public static void main(String[] args) {
		
		
		int num=3456;
		int rev=0;
		int Rem;
		while(num!=0) 
		{
			Rem=num%10;
		    num=num/10;
			
		 rev=(rev*10)+Rem;
		 
		}
		System.out.println(rev);
	}

}
