package jul15;

import java.util.Scanner;

public class TernaryDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = scanner.nextInt();

       /* if(age >= 18){
            System.out.println("Eligible to drive");
        }else{
            System.out.println("Not eligible to Drive");
        }*/

        // condition ? firstStatement : secondStatement;
        int result = (age >= 18)? 1 : 0;
        System.out.println(result);

        if(result == 0){

        }

        int a = 10;
        int b = 20;

        int max = (a>b)? a: b;
        System.out.println(max);

        for(;  ; ){

        }


        // foreach -- Arrays
        //




        /*

        for(;  ; ){

        }


         */





    }
}
