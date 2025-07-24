package jul22;

public class Solution {
    public static void main(String[] args) {
        // modify this code to take user input and remove all hard coded values

        int[][] arr1 = { {10, 20, 30}, {40,50,60}, {70,80,90} };
        int[][] arr2 = { {10, 20, 30}, {40,50,60}, {70,80,90} };

        int[][] sum = new int[3][3];

        System.out.println("adding two arrays");
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Result ");
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
