import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;

        System.out.println("Generated number: " + number);

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
