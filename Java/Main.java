import java.util.Scanner;
public class Main {
    public static void main (String args[]) {
	int employeeId;
	String employeeName;
	float employeeSalary;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter employee Id :");
	employeeId = sc.nextInt();
	System.out.println("Enter employee Name :");
	employeeName = sc.next();
	System.out.println("Enter employee Salary :");
	employeeSalary = sc.nextFloat();

	System.out.println("Employee Id :"+employeeId);
	System.out.println("Employee Name :"+employeeName);
	System.out.println("Employee Salary :"+employeeSalary);
	}
}