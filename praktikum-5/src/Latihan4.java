import java.util.Scanner;
public class Latihan4 {
    static int cariNilaiMinimum(int[] data) {
        int min = data[0];

        for (int nilai : data) {
            if (nilai < min) {
                min = nilai;
            }
        }
        return min;
    }

    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];

        for (int nilai : data) {
            if (nilai > max) {
                max = nilai;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah nilai ujian: ");
        int jumlah = input.nextInt();

        int[] data = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        System.out.println("Nilai Minimim: " + cariNilaiMinimum(data));
        System.out.println("Nilai Maksimum: " + cariNilaiMaksimum(data));
    }
}