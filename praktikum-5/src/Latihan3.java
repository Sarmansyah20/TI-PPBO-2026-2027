public class Latihan3 {
    static double koversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double konversiSuhu(double celsius, String satuanTujuan) {
        if (satuanTujuan.equalsIgnoreCase("Kelvin")) {
            return celsius + 273.15;
        }
        return (celsius * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        System.out.println("Celsius ke Farenheit: " + koversiSuhu(30));
        System.out.println("Celsius ke Kelvin: " + konversiSuhu(30, "Kelvin"));
    }
}
