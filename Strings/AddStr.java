import java.util.Scanner;

public class AddStr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String: ");
        String x = sc.nextLine();
        System.out.println("Enter your String: ");
        String y = sc.nextLine();

        String z = x + y;
        System.out.println("Addition of String: " + z);

    }
}
