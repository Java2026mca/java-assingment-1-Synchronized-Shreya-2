package q04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int temp = n, sum = 0, digits = String.valueOf(n).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        System.out.println(sum == n ? "Yes" : "No");
    }
}
