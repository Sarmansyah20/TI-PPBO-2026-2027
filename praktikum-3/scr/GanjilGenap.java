import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan bilangan: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan GENAP");
        } else {
            System.out.println(("Bilangan GANJIL"));
        }
    }
}
