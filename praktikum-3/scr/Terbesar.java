import java.util.Scanner;

public class Terbesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Angka pertama: ");
        int a = sc.nextInt();

        System.out.print("Angka kedua: ");
        int b = sc.nextInt();

        System.out.print("Angka ketiga: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Terbesar: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Terbesar: " + b);
        } else {
            System.out.println("Terbesar: " + c);
        }
    }
}
