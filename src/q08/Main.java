package q08;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[r][c];
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++) mat[i][j] = sc.nextInt();
        for(int j=0; j<c; j++) {
            for(int i=0; i<r; i++) System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
}
