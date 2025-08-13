package aug12;

public class Test {
    public static void main(String[] args) {

        int x = 10;
        int y = 10;

        System.out.println("Before try block"); //1    //1
        try {
            int div = x / y;

            try{
                System.out.println("Inside the try block*****");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Inside the try block");//2
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Line 10 ");//3 //2

    }
}
