import java.util.Scanner;
public class Example1 {
	public static void main(String args[]){
	int a;
	int b;

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter A :");
	a = sc.nextInt();
	System.out.println("Enter B :");
	b = sc.nextInt();
	
	if (a > b) {
		System.out.println("A is greater");
	}
	else{
		System.out.println("B is greater");	
	}

	}
}