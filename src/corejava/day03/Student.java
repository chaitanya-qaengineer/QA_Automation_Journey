package corejava.day03;

public class Student {

		int id;
		String name;
		int grade;
		
		public void studentDetails()
		{
			System.out.println("Student id is : "+id); 
			System.out.println("Student name is : "+name); 
			System.out.println("Student grade is : "+grade); 
         }

		
		public static void main(String[] args) {

		Student student = new Student();

        student.id = 1;
        student.name = "John";
        student.grade = 2;

		student.studentDetails();
		
		
		

	
		}
}
