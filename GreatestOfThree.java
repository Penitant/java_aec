import java.util.*;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if(a > b && a > c){
            System.out.println(a);
        } else if(b > a && b > c) {
            System.out.println(b);
        } else if(c > a && c > b) {
            System.out.println(c);
        }
        scanner.close();
    }
}
