import java.util.*;
import java.util.Arrays;

public class SumOfElementsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = Arrays.stream(array).sum();
        System.out.println("Sum of array elements: " + sum);
        scanner.close();
    }
}
