import java.util.*;

public class KalkulatorMethod {
    static ArrayList<Double> riwayat = new ArrayList<>();

    static double tambah(double a, double b) { return a + b; }
    static double tambah(double a, double b, double c) { return a + b + c; }
    static double kurang(double a, double b) { return a - b; }
    static double kali(double a, double b) { return a * b; }
    static double bagi(double a, double b) { return a / b; }
    static double pangkat(double a, double b) { return Math.pow(a, b); }
    static double akar(double a) { return Math.sqrt(a); }

    static double cariMaksimum(double[] data) {
        double max = data[0];
        for (double n : data)
            if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n1.Tambah 2 angka\n2.Tambah 3 angka");
            System.out.println("3.Kurang\n4.Kali\n5.Bagi");
            System.out.println("6.Pangkat\n7.Akar\n8.Keluar");
            System.out.print("Pilih: ");
            pilih = in.nextInt();

            double a, b, h = 0;
            boolean valid = true;

            if (pilih >= 1 && pilih <= 6) {
                System.out.print("Angka pertama: ");
                a = in.nextDouble();
                System.out.print("Angka kedua: ");
                b = in.nextDouble();

                switch (pilih) {
                    case 1: h = tambah(a, b); break;
                    case 2:
                        System.out.print("Angka ketiga: ");
                        h = tambah(a, b, in.nextDouble());
                        break;
                    case 3: h = kurang(a, b); break;
                    case 4: h = kali(a, b); break;
                    case 5:
                        if (b == 0) valid = false;
                        else h = bagi(a, b);
                        break;
                    case 6: h = pangkat(a, b); break;
                }
            } else if (pilih == 7) {
                System.out.print("Masukkan angka: ");
                a = in.nextDouble();
                if (a < 0) valid = false;
                else h = akar(a);
            } else if (pilih == 8) {
                if (!riwayat.isEmpty()) {
                    double[] data = riwayat.stream()
                            .mapToDouble(Double::doubleValue).toArray();
                    System.out.println("Maksimum: " + cariMaksimum(data));
                } else System.out.println("Belum ada riwayat.");
                break;
            } else valid = false;

            if (valid && pilih >= 1 && pilih <= 7) {
                System.out.println("Hasil: " + h);
                riwayat.add(h);
            } else if (pilih != 8) {
                System.out.println("Input atau operasi tidak valid!");
            }

        } while (true);

        in.close();
    }
}