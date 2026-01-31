import java.util.Scanner;

public class dowhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int i = sc.nextInt();

        do {
            System.out.println(i);
            i++;
        }while(i < 5);

    }
}

// DO-WHile Loop - The loops will execute the code before getting the condition True.
// Then it will repeat the loop as long as the condition is True.
// SYntax - do {
//     // code //
// }while ( condition ) 