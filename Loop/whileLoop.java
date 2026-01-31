import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int i = sc.nextInt();
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }    
}

// Syntax = while(condition) {
//     code block
// }
// The while loop, loops through a block of code as long as a specified condiiton is true.
