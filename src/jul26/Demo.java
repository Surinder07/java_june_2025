package jul26;

public class Demo {
    public static void main(String[] args) {

        // Thread safe
        StringBuffer sb = new StringBuffer("Pragra");
       // System.out.println(sb);

        StringBuffer append = sb.append(" Inc.");
        System.out.println(sb);

        System.out.println(2/0);



        // not thread safe
        StringBuilder stb = new StringBuilder("Microsoft");
        stb.append(" corp");
        System.out.println(stb);

    }
}


// String vs StringBuilder vs StringBuffer
