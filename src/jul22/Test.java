package jul22;

public class Test {
    public static void main(String[] args) {
                        //    0             1           2   3x3
        int[][] arr = { {10, 20, 30}, {40,50,60}, {70,80,90} };
            //           0    1   2    0   1  2    0   1  2
        // 0th index -----> reference of another array.


        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][1]);

//        int[][] arr2 = new int[3][3];
//
//        arr2[0][0] = 100;
//        arr2[0][1] = 100;
//        arr2[0][2] = 100;
//        arr2[0][3] = 100;
      //  int[][] sum = new int[3][3];

        for (int i = 0; i <arr.length ; i++) { // row
            for (int j = 0; j <arr.length ; j++) { // column

               // sum[i][j] = arr1[i][j] + arr2[i][j]
            }
        }

  /*
  int[][] sum;
  x = 10, y = 20
  sum = x + y
        10 20 30          30 20 10
        10 20 30   +      30 20 10
        10 20 30          30 20 10

///
           int[][] arr = { {10, 20, 30}, {40,50,60}, {70,80,90} };
*/


    }
}                                                           //3x2









