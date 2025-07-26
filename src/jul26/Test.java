package jul26;

import java.util.Locale;

public class Test {
    public static void main(String[] args) {

        String s1 = "    Pragra    ";
        String s2 = "ABC";
        char[] chars = s1.toCharArray();

        char c = s1.charAt(0);
        System.out.println(c);

        String newString = s1.concat(" Inc."); // because Strings are immutanle
        // that is the reason it did not modify the existing string.
        System.out.println(newString);

        System.out.println(s1);

       //  System.out.println(s1.compareTo(s2));

        // Pragra
        System.out.println(s1.indexOf('a'));

        System.out.println(s1.trim());





    }
}
