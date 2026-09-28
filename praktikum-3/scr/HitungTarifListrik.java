import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Konstanta tarif
        final double TARIF_450 = 415;
        final double TARIF_900 = 1352;
        final double TARIF_1300 = 1444.70;
        final double TARIF_2200 = 1444.70;
        final double TARIF_DI_ATAS_2200 = 1699.53;

        // Input daya dan pemakaian
        System.out.print("Masukkan daya listrik (VA): ");
        int daya = sc.nextInt();

        System.out.print("Masukkan pemakaian listrik (kWh): ");
        double kwh = sc.nextDouble();

        // Validasi kWh
        if (kwh <= 0) {
            System.out.println("Error: Pemakaian kWh harus lebih dari 0.");
            return;
        }

        String golongan;
        double tarif;

        // Menentukan golongan daya
        if (daya == 450) {
            golongan = "450 VA";
            tarif = TARIF_450;
        } else if (daya == 900) {
            golongan = "900 VA";
            tarif = TARIF_900;
        } else if (daya == 1300) {
            golongan = "1300 VA";
            tarif = TARIF_1300;
        } else if (daya == 2200) {
            golongan = "2200 VA";
            tarif = TARIF_2200;
        } else if (daya > 2200) {
            golongan = ">2200 VA";
            tarif = TARIF_DI_ATAS_2200;
        } else {
            System.out.println("Error: Daya tidak valid.");
            return;
        }

        // Menghitung total
        double total = kwh * tarif;

        // Menampilkan hasil
        System.out.println("\n=== RINCIAN TAGIHAN LISTRIK ===");
        System.out.println("Golongan Daya : " + golongan);
        System.out.println("Pemakaian     : " + kwh + " kWh");
        System.out.println("Tarif per kWh : Rp" + tarif);
        System.out.println("Total Tagihan : Rp" + total);
    }
}