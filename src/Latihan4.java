import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriks = new int[3][3];
        int total = 0;

        System.out.println("Masukkan elemen matriks 3x3:");

        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                System.out.println("Baris " + (baris + 1) + ", Kolom " + (kolom + 1) + ": ");
                matriks[baris][kolom] = sc.nextInt();
            }
        }

        System.out.println("\nJumlah setiap baris:");

        for (int baris = 0; baris < 3; baris++) {
            int jumlahBaris = 0;

            for (int kolom = 0; kolom < 3; kolom++) {
                jumlahBaris += matriks[baris][kolom];
                total += matriks[baris][kolom];
            }

            System.out.println("Baris " + (baris + 1) + ": " + jumlahBaris);
        }

        System.out.println("Jumlah seluruh elemen: " + total);
    }
}
