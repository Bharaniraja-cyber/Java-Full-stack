import java.util.Random;
public class RandomNumber {
    public static void main(String args[]){
        Random rand = new Random();
        int num1 = rand.nextInt(1000);
        int num2 = rand.nextInt(2000);

        float num3 = rand.nextFloat(500);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
