import java.util.Scanner;
public class TwoObject {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String name1 = sc.nextLine();
        System.out.println("Enter String 2");
        String name2 = sc.nextLine();
        
        System.out.println(name1.equals(name2));
    }
}
