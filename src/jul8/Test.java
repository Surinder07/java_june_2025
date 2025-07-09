package jul8;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // given 3 numbers, print the largest of all..
        // 10, 34, 12  --- 34

        // user input : Scanner :class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value for x : ");
        int x = scanner.nextInt();

        System.out.println("Enter the value for y :");
        int y = scanner.nextInt();

        int sum = x + y;
        System.out.println("Sum of x and y is " + sum);

    }
}
