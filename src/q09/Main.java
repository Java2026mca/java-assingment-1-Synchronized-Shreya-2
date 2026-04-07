package q09;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s.equalsIgnoreCase(rev) ? "Yes" : "No");
    }
}
