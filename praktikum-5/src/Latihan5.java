public class Latihan5 {
    static int hitungTotal(int[] data) {
        int total = 0;
        for (int n : data) total += n;
        return total;
    }

    static int[] filterDiAtasRataRata(int[] data) {
        double rata = (double) hitungTotal(data) / data.length;
        int[] temp = new int[data.length];
        int i = 0;

        for (int n : data)
            if (n > rata) temp[i++] = n;

        int[] hasil = new int[i];
        System.arraycopy(temp, 0, hasil, 0, i);
        return hasil;
    }

    public static void main(String[] args) {
        int[] data = {80, 75, 90, 60,88};

        System.out.println("Total: " + hitungTotal(data));

        int[] hasil = filterDiAtasRataRata(data);
        System.out.println("Di atas rata-rata: ");

        for (int n : hasil)
            System.out.print(n + " ");
    }
}

