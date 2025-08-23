package aug23;


import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.peek());
        Integer result = stack.pop();
        System.out.println(result);

        System.out.println(stack.toString());
         //    {{[

    }
}
