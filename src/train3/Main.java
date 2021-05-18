package train3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int a = sc1.nextInt();
        int b = sc2.nextInt();

        int ans = a + b;

        System.out.println(a + "と" + b + "の合計は" ans + "です");
    }
}
