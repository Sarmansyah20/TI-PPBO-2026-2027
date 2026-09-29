import java.util.Scanner;

public class PengolahanNilaiKelas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int KKM = 70;

        // input jumlah dan nilai mahasiswa
        System.out.print("Jmlah mahasiswa: ");
        int N = sc.nextInt();
        int[] nilai = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i * 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        // nilai awal
        int total = 0, tinggi = nilai[0], rendah = nilai[0];
        int lulus = 0, tidakLulus = 0;

        // hitung data nilai
        for (int n : nilai) {
            total += n;
            if (n > tinggi) tinggi = n;
            if (n < rendah) rendah = n;
            if (n >= KKM) lulus++;
            else tidakLulus++;
        }

        // Bubble Sort ascending
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        // laporan
        System.out.println("\n=== LAPORAN NILAI ===");
        System.out.println("Rata-rata       : " + (double) total / N);
        System.out.println("Nilai tertinggi : " + tinggi);
        System.out.println("Nilai terendah  : " + rendah);
        System.out.println("Lulus           : " + lulus);
        System.out.println("Tidak lulus     : " + tidakLulus);

        System.out.print("Nilai terurut  : ");
        for (int n : nilai) System.out.print(n + " ");
    }
}
