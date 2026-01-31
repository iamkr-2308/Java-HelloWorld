import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your fname: ");
        String fname = sc.nextLine();   

        System.out.println("ENter your sname: ");
        String lname = sc.nextLine();

        String name = fname + lname;
        System.out.println("Full name is : " + name);

    }
}
