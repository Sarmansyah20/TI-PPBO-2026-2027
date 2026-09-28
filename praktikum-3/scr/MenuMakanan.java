import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pilih menu (1-4): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Nasi Goreng");
                break;
            case 2:
                System.out.println("Mie Ayam");
                break;
            case 3:
                System.out.println("Ayam Geprek");
                break;
            case 4:
                System.out.println("Bakso");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
