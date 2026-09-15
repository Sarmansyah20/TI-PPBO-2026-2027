import java.util.Scanner;

public class KalkulatorBangunDatar {

    public static void main(String[] args) {

        // Membuat Scanner untuk menerima input dari user
        Scanner scanner = new Scanner(System.in);

        // Meminta panjang dan lebar persegi panjang
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();

        // Menghitung luas dan keliling persegi panjang
        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        System.out.println("\n=== Persegi Panjang ===");
        System.out.println("Luas     : " + luasPersegiPanjang);
        System.out.println("Keliling : " + kelilingPersegiPanjang);

        // Meminta jari-jari lingkaran
        System.out.println("\nMasukkan jari-jari lingaran: ");
        double jariJari = scanner.nextDouble();

        // Menghitung luas dan keliling lingkaran menggunakan Math.PI
        double luasLingkaran = Math.PI * jariJari * jariJari;
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        System.out.println("\n=== Lingkaran ===");
        System.out.println("Luas     : " + luasLingkaran);
        System.out.println("Keliling : " + kelilingLingkaran);

        // Mengecek apakah luas persegi panjang lebih besar dari 100
        boolean luasBesar = luasPersegiPanjang > 100;

        System.out.println("\n=== Pemeriksaan Luas ===");
        System.out.println("Luas persegi panjang : " + luasPersegiPanjang);
        System.out.println("Luas Besar           : " + luasBesar);

        // Menutup Scanner
        scanner.close();

    }
}
