import java.util.Scanner;

public class Pallindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int r,temp,sum=0;
        temp=num;
        while(num>0){
            r = num%10;
            sum = (sum*10)+r;
            num = num/10;
        }
        if(temp == sum){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not A Pallindrome");
        }
    }    
}
