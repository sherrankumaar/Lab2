import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int amountOfBricks;
        do {
            System.out.print("Enter the number of Lego bricks (odd number between 50 and 100): ");
            amountOfBricks = scanner.nextInt();
        } while (amountOfBricks < 50 || amountOfBricks > 100 || amountOfBricks % 2 == 0);
        int containerCapacity;
        do {
            System.out.print("Enter the number of bricks per container (even number between 5 and 10): ");
            containerCapacity = scanner.nextInt();
        } while (containerCapacity < 5 || containerCapacity > 10 || containerCapacity % 2 != 0);

        int fullContainers = amountOfBricks / containerCapacity;

        int totalContainers = (amountOfBricks % containerCapacity == 0) ? fullContainers : fullContainers + 1;

        int remainingBricks = amountOfBricks % containerCapacity;
        System.out.println("\nResults:");
        System.out.println("Total number of Lego bricks: " + amountOfBricks);
        System.out.println("Each container holds: " + containerCapacity + " bricks.");
        System.out.println("Number of full containers: " + fullContainers);
        System.out.println("Total containers needed (including partial ones): " + totalContainers);
        System.out.println("Bricks in the last, not full container: " + remainingBricks);

        scanner.close();
    }
}
