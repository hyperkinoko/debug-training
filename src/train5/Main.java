package train5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int []a = new int[n];
        int score = 0;
        for (int i =0; i < n; i++) {
            a[i] = scanner.nextInt();　　　
        }
        for (int i =0 ; i < n; i++) {
            while (a[i] % k == 0) {　　
                a[i] = a[i] / k;
                score++;
            }　　
        }　　　
        System.out.println(score);
    }
}

