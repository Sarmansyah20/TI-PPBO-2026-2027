public class Latihan1 {
    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang(10, 5));
        System.out.println("Luas Lingkaran: " + luasLingkaran(7));
    }
}
