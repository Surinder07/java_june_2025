package jul22;

public class Demo1 {
    public static void main(String[] args) {

        String s1 = "Pragra"; // created inside the SCP
        String s2 = new String("Pragra"); // this is not SCP
        String s3 = "Pragra";
        s3 = "something else";

        System.out.println(s1);
        System.out.println(s2);

        // ==  - reference of the object
        System.out.println(s1 == s3);
        // true 1 1 1 1 1

        System.out.println(s1.equalsIgnoreCase(s2));


        /*
        s1 = "Microsoft"
        s1
        s2
        s3
         s4


         */
    }
}
