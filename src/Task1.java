import java.util.Scanner; // Add this line
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("Welcome to the Java Primitive Types Quiz!");
        System.out.println("1. What is the default value of an `int` in Java?");
        System.out.println("a) 0  b) null  c) undefined  d) 1");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("a")) {
            score++;
        }
        System.out.println("2. Which data type is used to store a single character?");
        System.out.println("a) String  b) char  c) boolean  d) int");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("b")) {
            score++;
        }
        System.out.println("3. Which of the following is a floating-point data type?");
        System.out.println("a) int  b) float  c) char  d) boolean");
        String answer3 = scanner.nextLine();
        if (answer3.equalsIgnoreCase("b")) {
            score++;
        }
        System.out.println("4. What is the size of a `double` in Java?");
        System.out.println("a) 4 bytes  b) 8 bytes  c) 16 bytes  d) 2 bytes");
        String answer4 = scanner.nextLine();
        if (answer4.equalsIgnoreCase("b")) {
            score++;
        }
        System.out.println("5. What is the range of values a `byte` can store?");
        System.out.println("a) -128 to 127  b) -32768 to 32767  c) 0 to 255  d) -2147483648 to 2147483647");
        String answer5 = scanner.nextLine();
        if (answer5.equalsIgnoreCase("a")) {
            score++;
        }
        System.out.println("\nQuiz Completed! Your Score: " + score + "/5");
        scanner.close();
    }
}
