package jul19;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int[] arr = {101,102,103,104,105};
        int[] arr = new int[5];
        System.out.println("Enter the elements of array ");

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // for each loop

        for(int element : arr){
            System.out.println(element);
        }
    }
}

/*
Problem:
find the largest element in the given array
   10,  32,    43,   21,   43,    1,   44,   42

int highest;
assumption
10  compare 32

 highest = 44;

 print highest
 if(highest < number){
   highest = number;

 }

 */





/*
int x = 10;
int y = 20;

after swapping
x = 20
y = 10



 */










