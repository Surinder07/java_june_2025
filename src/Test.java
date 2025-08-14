import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for x : ");
        int x = scanner.nextInt();

        System.out.println("Enter the value for Y : ");
        int y = scanner.nextInt();

        int sum = x + y;
        System.out.println("Sum is : "+sum);


    }
}
