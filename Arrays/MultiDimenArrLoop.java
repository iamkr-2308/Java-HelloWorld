public class MultiDimenArrLoop {
    public static void main(String[] args) {

        // ranks = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10} }
        // Outer loop: i = 0 (first row), i = 1 (second row)
        // For i = 0: ranks[0] = {1, 2, 3, 4, 5}
        //   j = 0: ranks[0][0] = 1
        //   j = 1: ranks[0][1] = 2
        //   j = 2: ranks[0][2] = 3
        //   j = 3: ranks[0][3] = 4
        //   j = 4: ranks[0][4] = 5
        // For i = 1: ranks[1] = {6, 7, 8, 9, 10}
        //   j = 0: ranks[1][0] = 6
        //   j = 1: ranks[1][1] = 7
        //   j = 2: ranks[1][2] = 8
        //   j = 3: ranks[1][3] = 9
        //   j = 4: ranks[1][4] = 10

        int[][] ranks = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

        int length = ranks.length;

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < ranks[i].length; j++) {
                System.out.println(ranks[i][j]);
            }
        }
    }
}
