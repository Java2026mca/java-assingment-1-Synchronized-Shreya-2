package.q10
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] tokens = line.split(" ");

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            // Check if token is a number
            if (Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                if (token.equals("+")) {
                    result = a + b;
                } else if (token.equals("-")) {
                    result = a - b;
                } else if (token.equals("*")) {
                    result = a * b;
                } else if (token.equals("/")) {
                    result = a / b; // integer division
                }

                stack.push(result);
            }
        }

        System.out.println(stack.pop());
    }
}
