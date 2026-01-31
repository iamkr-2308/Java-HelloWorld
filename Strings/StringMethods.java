import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String country = sc.nextLine();

        System.out.println("The Uppercase Methode: " + country.toUpperCase());
        System.out.println("The Lowercase Methods: " + country.toLowerCase());

    }
}
