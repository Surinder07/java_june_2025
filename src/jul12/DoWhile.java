package jul12;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        boolean isLatin = true;
        int age = 20;
        String name =  "Divine";
        //                  conditioin                     if        else
        String greeting =  (isLatin  & age >21) && (true) ? "Hola "+ name : "Hello "+ name;
        System.out.println(greeting);

        int x = 1;
        x  =  (2+3)-(1*4)+(4/2);
        int num = 0;
        int sum = 0;
        do {
           if( num%2 == 0) {
               sum += num;
           }
           num++;
        }while (num<=100);
        System.out.println("sum = " + sum);
        learnWhileNexting();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number cigars");
//        int cigars = scanner.nextInt();
//        System.out.println("Please let me know if this weekend as true or false");
//        boolean isWeekend = scanner.nextBoolean();
//        if (cigarParty(cigars,isWeekend)) {
//            System.out.println("SUCCESSFUL");
//        }else {
//            System.out.println("FAIL");
//        }
         learningForLoop();


    }
    public static void learnWhileNexting() {
        int x = 0;
        int y = 0;

        while (x < 10) {
            while (y < 5) {
                System.out.println("x = "+x +" y = " + y);
                y++;
            }
            x++;
            y = 0;
        }
    }


    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if( cigars >= 40 && cigars <= 60 && !isWeekend) {
            return true;
        }else if( cigars>=40 && isWeekend) {
            return true;
        }
        return false;
    }

    public static void learningForLoop(){
        for (int num = 0; num < 10; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num ; i++) {
                if( num%i  == 0){
                    isPrime = false;
                    break;
                }
            }
            System.out.println("Number "+ num + " is prime " + isPrime );
        }


        for (int i = 0; i < 5 ; i++) {
            System.out.println("Hello from For Loop");
        }
    }

}


