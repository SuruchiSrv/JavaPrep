package lesson_5;

public class Quest {
	
public static void bignumber(int a,int b,int c) 
{
	
	if(a>b&&a>c) {
		
		System.out.println("Biggest number is 'a' "+a);}
		
		if(b>a&b>c) {
			System.out.println("Biggest number is 'b' " +b);
		}
		if(c>b&&c>a) {
			
			System.out.println("Biggest number is 'c' " +c);
		}
		if (a==b & a==c&b==c) {
			
			System.out.println("All are same " +a);
		}
		
	}
	
		
		

	public static void main(String[] args) {
		//Quest Q=new Quest(); 
		//Q.bignumber(23,34,45);
		 //Quest.bignumber(90,80,70);
		Quest.bignumber(70,70,70);
		int a=5;
		int b=6;
		a=b;
		System.out.println(a);
		System.out.println(b);
		
	}

}
