import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        System.out.println("Enter number: ");
        int b = sc.nextInt();
        
        if(a > b) {
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("a is not greater than b");
        }
    }    
}

// 1. If - Specified condition is True.
// 2. Else - If condition is False.
