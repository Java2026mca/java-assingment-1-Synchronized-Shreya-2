package q10;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        Stack<Integer> st = new Stack<>();
        for(String s : exp.split(" ")) {
            if(s.matches("\\d+")) st.push(Integer.parseInt(s));
            else {
                int val1 = st.pop(), val2 = st.pop();
                switch(s) {
                    case "+": st.push(val2 + val1); break;
                    case "-": st.push(val2 - val1); break;
                    case "*": st.push(val2 * val1); break;
                    case "/": st.push(val2 / val1); break;
                }
            }
        }
        System.out.println(st.pop());
    }
}
