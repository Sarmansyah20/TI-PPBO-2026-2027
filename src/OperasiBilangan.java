import java.util.Scanner;

public class OperasiBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Masukkan 2 Bilangan
        System.out.print("Masukkan bilangan pertaman: ");
        int a = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int b = input.nextInt();

        // Operator Aritmatikanya
        System.out.println("\nHasi operasi aritmatika: ");
        System.out.println("Penjumlahan: " + (a + b));
        System.out.println("Pengurangan: " + (a - b));
        System.out.println("Perkalian: " + (a * b));
        System.out.println("Pembagian: " + (a / b));
        System.out.println("Sisa Bagi: " + (a % b));

        // Operator untuk perbandingan
        System.out.println("\nHasi perbandingan: ");
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a == b : " + (a == b));

        input.close();
    }
}
