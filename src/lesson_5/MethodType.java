package lesson_5;

public class MethodType {
	String student_name;
	int TotalMarks;
	public static void set() 
	{
		String school_name= "Convent";
		
		System.out.println(school_name);
	}
 public void assign(String Name,int Marks) 
 {
	 student_name=Name;
	 TotalMarks=Marks;
 }
 
 public void display()
  {
	 System.out.println("My name is "+student_name);
	 System.out.println("My marks ="+TotalMarks);
	 
  }
	public static void main(String[] args) {
		   MethodType.set();
			MethodType mt=new MethodType();
			mt.assign("suruchi",90);
			mt.display( );
			
			mt.assign("surabhi", 98);
			mt.display();
	}

}
