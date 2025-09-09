import java.util.Scanner;

public class SwapMem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = scanner.nextInt();
        System.out.println("Enter the Second number");
        int y = scanner.nextInt();
            
        
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        scanner.close();
    }

}
