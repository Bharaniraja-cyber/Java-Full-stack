import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        int n1=0,n2=1,n3;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }
}