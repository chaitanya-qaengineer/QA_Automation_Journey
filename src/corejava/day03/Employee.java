package corejava.day03;

public class Employee {
	int empId;
	String empName;
	
	public Employee(int eId,String eName) {
		this.empId=eId;
		this.empName=eName;
		
	}
	public void displayDetails() {

        System.out.println("Employee id is : " + empId);
        System.out.println("Employee name is : " + empName);
    }
	public static void main(String[] args)
	{
		Employee emp = new Employee(243,"John");
		emp.displayDetails();
		
	}
}
