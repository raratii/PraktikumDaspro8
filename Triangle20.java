
import java.util.Scanner;

/**
 * Triangle20
 */
public class Triangle20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nilai N =");
        int N = sc.nextInt();
        int i = 1;

        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;     
            }
            System.out.println();
            i++;
        }
    }
}