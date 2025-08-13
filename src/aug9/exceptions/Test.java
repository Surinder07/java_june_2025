package aug9.exceptions;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
            set();
    }

    public static void set(){
        show();
    }

    public static void show(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for x ");
        int x = scanner.nextInt();

        System.out.println("Enter value for y ");
        int y = scanner.nextInt();

        try {
            int div = x / y;

            System.out.println("Line 20 ");
            String s = "Pragra";
            s = null;
            s.toUpperCase();

            System.out.println("Line 24 ");

        }

        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Hello");

    }
}
