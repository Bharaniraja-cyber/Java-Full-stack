import java.util.Scanner;

public class Example2 {
	public static void main (String args[]){
	int arr[] = new int[5];
	int sum = 0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter 5 integer");
	for(int i=0; i<arr.length; i++){
	arr[i] = sc.nextInt();
	}

	System.out.println("Array elments are");
	for(int i=0; i<arr.length;i++){
	System.out.println(arr[i]);
	sum = sum + arr[i];	
	}
	System.out.println("Sum of Array elements are :"+ sum);
    }
}