package aug12;

import java.util.Scanner;

public class AgeDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age to enter the club");
        int age = scanner.nextInt();
        ageValidation(age);
    }

    //1
    public static void ageValidation(int age) throws RuntimeException{
        if(age < 18){
            throw new InvalidAgeException("Age is less than the limit.");
        }
        System.out.println("Age is valid " + age);
    }

}
