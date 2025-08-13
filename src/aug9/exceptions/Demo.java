package aug9.exceptions;

public class Demo extends Object{
    public static void main(String[] args) {
        System.out.println("hello");  // 1

        String name = "Pragra";  // 2
        System.out.println(name);

        name = null;

        String upperCase = name.toUpperCase(); // 3 error[Divine]   - nothing[Jatin]
        System.out.println(upperCase);
        System.out.println("End of line...."); //will not print
    }
}
