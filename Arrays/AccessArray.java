public class AccessArray {
    public static void main(String[] args) {

        int[] cc = {1, 3 , 5 , 7 , 9};
        System.out.println("Original Elements......");
        System.out.println(cc[0]);
        System.out.println(cc[1]);
        System.out.println(cc[2]);
        System.out.println(cc[3]);
        System.out.println(cc[4]);

        System.out.println("\n");

        // Changing Array elements
        System.out.println("After changing elements.....");
        int[] dd = {1, 3 , 5 , 7 , 9};
        cc[0] = 2;
        System.out.println(cc[0]);
        cc[1] = 4;
        System.out.println(cc[1]);
        cc[2] = 6;
        System.out.println(cc[2]);
        cc[3] = 8;
        System.out.println(cc[3]);
        cc[4] = 10;
        System.out.println(cc[4]);

    }
}
