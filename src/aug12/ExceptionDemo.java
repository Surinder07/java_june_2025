package aug12;

import java.io.FileReader;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

      /*  Scanner scanner = new Scanner(System.in);
        try {
            //System.exit(0);

            String s = "Pragra";
            s = null;
            s.toUpperCase();
            System.out.println("after exceptioin on line 10");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            scanner.close();
            // this block will always execute
            System.out.println("Inside finally block....");
        }*/


        // try with resources.
        try(FileReader fr = new FileReader("file.txt")){
            fr.close();

        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
