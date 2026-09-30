
package stack;
import java.util.Stack;

public class PrintChar {

    public static String decode(String s) {
        Stack<String> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(String.valueOf(ch));
            }  
            else if (ch == '(') {
             
            }
     
            else if (ch == ')') {

                String temp = "";
                while (!stack.empty() &&
                       !Character.isDigit(stack.peek().charAt(0))) {

                    temp = stack.pop() + temp;
                }

                int count = Integer.parseInt(stack.pop());

                String result = "";

                for (int i = 0; i < count; i++) {
                    result = result + temp;
                }
                stack.push(result);
            }

            else {
                stack.push(String.valueOf(ch));
            }
        }
        String answer = "";

        while (!stack.empty()) {
            answer = stack.pop() + answer;
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(decode("3(a)3(b)"));

        System.out.println(decode("3(ab)3(b)"));

        System.out.println(decode("3(a3(b))"));
    }
}

