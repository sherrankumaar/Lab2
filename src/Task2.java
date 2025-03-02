import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight on Earth (kg): ");
        float earthWeight = scanner.nextFloat();

        float marsWeight = earthWeight * 0.38f;
        double marsWeightDouble = (double) marsWeight;
        int marsWeightInt = (int) marsWeightDouble;
        char marsWeightChar = (char) marsWeightInt;
        int mathOperationResult = marsWeightChar + 5;

        System.out.printf("Your weight on Mars (float): %.4f kg\n", marsWeight);
        System.out.printf("Your weight on Mars (double): %.4f kg\n", marsWeightDouble);
        System.out.println("Your weight on Mars (int): " + marsWeightInt);
        System.out.println("Your weight on Mars (char): " + marsWeightChar);
        System.out.println("Math operation on char (char + 5): " + mathOperationResult);

        scanner.close();
    }
}
