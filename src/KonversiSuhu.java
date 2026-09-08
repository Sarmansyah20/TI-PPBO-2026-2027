import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input nilai Celcius
        System.out.print("Masukkan suhu Celcius: ");
        double celcius = input.nextDouble();

        //Celcius ke Farenheit
        double farenheit = celcius * 9 / 5 + 32;
    }
}
