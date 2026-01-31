import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        System.out.println("Enter your third number: ");
        int c = sc.nextInt();
        System.out.println("Enter your fourth number: ");
        int d = sc.nextInt();


        a += 5;
        b -= 5;
        c *= 5;
        d /= 5;
        
        System.out.println("\n");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    
}
// Assignment Operators: +=, -=, *=, /=, %=