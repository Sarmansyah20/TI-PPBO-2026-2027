import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Umur: ");
        int umur = sc.nextInt();

        System.out.print("Mahasiswa? (true/false): ");
        boolean mahasiswa = sc.nextBoolean();

        if (mahasiswa && umur < 25) {
            System.out.println("Mendapat harga khusus");
        } else {
            System.out.println("Harga normal");
        }
    }
}
