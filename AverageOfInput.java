import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Enter numbers to calculate the average (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'done' to finish.");
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("The average is: %.2f%n", average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}
