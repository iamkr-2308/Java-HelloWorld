import java.util.Scanner;

public class MMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Math max method: " + Math.max(a, b));
        System.out.println("Math min method: " + Math.min(a, b));
        System.out.println("Math sqrt method: " + Math.sqrt(a));
        System.out.println("Math absolute method: " + Math.abs(b));
        System.out.println("Math random method: " + Math.random());
    }    
}

// 1. Max = Gives the maximum number
// 2. Min - Gives the minimum number
// 3. Sqrt - Gives the square root number
// 4. Absolute - It returs the absolute positive value, eg. -3.3. Output: 3.3 
// 5. Random - Returns a random number between 0.0[Inclusive] and 1.1[Exclusive]