# Laporan Modul 1-5

**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek

**Nama:** M. Iqbal Sarmansyah  

**NIM:** 2025573010136  

**Kelas:** TI 2A

---

## Pendahuluan

Pemrograman Berorientasi Objek (PBO) merupakan salah satu konsep pemrograman yang digunakan untuk mengembangkan perangkat lunak dengan mengorganisasikan program ke dalam objek yang memiliki atribut dan metode. Konsep ini bertujuan untuk membuat kode program lebih terstruktur, mudah dipahami, serta dapat digunakan kembali. Dalam penerapannya, PBO memiliki beberapa konsep utama, seperti class, object, encapsulation, inheritance, polymorphism, dan abstraction.

Praktikum Pemrograman Berorientasi Objek dilaksanakan untuk memberikan pemahaman dan pengalaman langsung dalam menerapkan konsep PBO menggunakan bahasa pemrograman Java. Melalui kegiatan praktikum, mahasiswa mempelajari cara membuat kelas dan objek, menggunakan atribut dan metode, serta menerapkan berbagai konsep PBO dalam penyelesaian permasalahan melalui program komputer.

Dengan adanya praktikum ini, mahasiswa diharapkan mampu memahami prinsip dasar Pemrograman Berorientasi Objek dan menerapkannya dalam pembuatan program yang efektif, terstruktur, dan mudah dikembangkan. Selain itu, praktikum ini juga bertujuan untuk meningkatkan kemampuan berpikir logis, analitis, dan sistematis dalam menyelesaikan permasalahan pemrograman.

---
## Tujuan

1. Memahami persiapan dan konfigurasi lingkungan kerja untuk pemrograman Java.
2. Memahami sintaks dasar Java, penggunaan variabel, tipe data, dan operator dalam pembuatan program.
3. Mempelajari penerapan struktur kontrol keputusan untuk menentukan alur program berdasarkan kondisi tertentu.
4. Memahami penggunaan array dan perulangan untuk menyimpan serta mengolah sekumpulan data secara efisien.
5. Mempelajari penggunaan method dan fungsi untuk membuat kode program yang terstruktur, modular, dan mudah digunakan kembali.

---

## 1. Persiapan LIngkungan Kerja
Persiapan lingkungan kerja merupakan tahap awal dalam pemrograman untuk menyiapkan perangkat lunak yang diperlukan, seperti JDK dan IntelliJ IDEA. Persiapan ini bertujuan agar program Java dapat ditulis, dijalankan, dan diuji dengan baik.

**1.1. Instalasi IntelliJ IDEA dan JDK**

IntelliJ IDEA diinstal melalui situs resminya, sedangkan JDK Amazon Corretto diunduh melalui dokumentasi resmi AWS. Setelah instalasi selesai, dilakukan pemeriksaan melalui terminal dengan perintah berikut:

```bash
java -version
javac -version
```

Jika instalasi berhasil, terminal akan menampilkan informasi versi Java yang terpasang.

**1.2. Instalasi dan Konfigurasi Git**

Git diinstal melalui situs resmi Git. Setelah itu, identitas pengguna dan editor diatur menggunakan perintah berikut:

```bash
git config --global user.name "M. Iqbal Sarmansyah"
git config --global user.email "emailkamu@gmail.com"
git config --global core.editor "code --wait"
git config --list
```

Perintah tersebut digunakan untuk mengatur nama, email, editor default, dan memeriksa konfigurasi Git.

**1.3. Registrasi Akun GitHub**

Akun GitHub dibuat melalui situs https://github.com dengan menggunakan email aktif, password yang kuat, dan username. Setelah proses verifikasi selesai, akun dapat digunakan untuk membuat dan mengelola repository.

**1.4. Membuat Repository GitHub**

Repository dibuat dengan nama `TI-PPBO-2026-2027` dan visibilitas Public. Selanjutnya, repository diunduh ke komputer lokal menggunakan perintah:

```bash
git clone URL_REPOSITORY
```

`URL_REPOSITORY` diganti dengan URL repository milik sendiri yang tersedia di GitHub.

**1.5. Membuat File Catatan Praktikum**

Setelah repository berhasil di-clone, folder `praktikum-1` dibuat untuk menyimpan file catatan praktikum. Contoh perintah yang digunakan:

```bash
cd TI-PPBO-2026-2027
mkdir praktikum-1
cd praktikum-1
echo "# Catatan Praktikum" > README-praktikum.md
```

File tersebut berisi judul catatan praktikum dan menjadi bagian dari struktur repository.

**1.6. Menyimpan Perubahan ke GitHub**

Setelah file dibuat, perubahan ditambahkan, disimpan dalam riwayat Git, dan diunggah ke GitHub menggunakan perintah berikut:

```bash
cd ..
git status
git add .
git commit -m "Praktikum 1: Inisialisasi catatan praktikum"
git push origin main
```

Perintah `git status` digunakan untuk memeriksa perubahan, `git add .` menambahkan file ke staging area, `git commit` menyimpan perubahan secara lokal, dan `git push origin main` mengunggah commit ke repository GitHub.

### Hasil Praktikum

Hasil dari persiapan lingkungan kerja adalah tersedianya IntelliJ IDEA dan JDK untuk pemrograman Java, Git untuk pengelolaan versi, serta akun dan repository GitHub untuk menyimpan kode program secara online. Keberhasilan praktikum dapat dibuktikan melalui tampilan versi Java, konfigurasi Git, dan file `README-praktikum.md` yang telah muncul di repository GitHub.

---


## 2. Pengenalan Sintaks Java, Variabel, Tipe Data, dan Operator

Pengenalan sintaks Java, variabel, tipe data, dan operator merupakan dasar dalam mempelajari pemrograman Java. Sintaks Java adalah aturan penulisan kode program, sedangkan variabel digunakan untuk menyimpan data, tipe data menentukan jenis nilai yang disimpan, dan operator digunakan untuk melakukan operasi perhitungan maupun perbandingan.

Dalam praktikum ini, mahasiswa mempelajari struktur dasar program Java yang terdiri dari class dan method `main()`, penggunaan `System.out.print()` dan `System.out.println()` untuk menampilkan keluaran, serta penulisan komentar sebagai penjelas kode. Selain itu, dipelajari deklarasi variabel dengan tipe data seperti `int`, `double`, `char`, `boolean`, dan `String`, serta konversi tipe data (*casting*) dari satu tipe ke tipe lainnya.

Operator dalam Java meliputi operator aritmatika untuk perhitungan, operator relasional untuk membandingkan nilai, dan operator logika untuk menggabungkan kondisi. Praktikum ini juga memperkenalkan penggunaan `Scanner` untuk menerima input dari pengguna melalui keyboard.

### Contoh Penerapan

**2.1. Struktur Dasar Program Java**

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Halo, Dunia!");
    }
}
```

Output:
```text
Halo, Dunia!
```

Program tersebut menunjukkan struktur dasar Java yang terdiri dari class, method `main()`, dan perintah untuk menampilkan teks.

**2.2. Variabel dan Tipe Data**

```java
String nama = "Iqbal";
int umur = 19;
double tinggi = 170.5;
char golDarah = 'O';
boolean mahasiswaAktif = true;

System.out.println("Nama: " + nama);
System.out.println("Umur: " + umur);
System.out.println("Tinggi: " + tinggi);
System.out.println("Golongan Darah: " + golDarah);
System.out.println("Aktif: " + mahasiswaAktif);
```

Contoh tersebut menunjukkan penggunaan variabel untuk menyimpan data dengan tipe yang berbeda.

**2.3. Operator Aritmatika**

```java
int a = 17, b = 5;

System.out.println("Jumlah: " + (a + b));
System.out.println("Selisih: " + (a - b));
System.out.println("Perkalian: " + (a * b));
System.out.println("Pembagian: " + (a / b));
System.out.println("Sisa bagi: " + (a % b));
```

Output:
```text
Jumlah: 22
Selisih: 12
Perkalian: 85
Pembagian: 3
Sisa bagi: 2
```

**2.4. Input Menggunakan Scanner**

```java
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        System.out.println("Halo " + nama + ", umur Anda " + umur);
        sc.close();
    }
}
```

Program tersebut menerima input nama dan umur dari pengguna, kemudian menampilkan kembali data yang dimasukkan.

### Hasil Praktikum

Praktikum ini memberikan pemahaman mengenai struktur dasar program Java, penggunaan variabel dan tipe data, penerapan operator, serta penerimaan input menggunakan `Scanner`. Konsep-konsep tersebut menjadi dasar untuk membuat program Java yang lebih kompleks.

### Analisis

Berdasarkan praktikum yang dilakukan, setiap elemen dasar Java memiliki fungsi yang berbeda dalam membangun program. Sintaks digunakan untuk menyusun instruksi, variabel dan tipe data untuk mengelola informasi, operator untuk melakukan perhitungan dan perbandingan, serta `Scanner` untuk menerima masukan pengguna. Pemahaman terhadap konsep-konsep tersebut membantu mahasiswa membuat program yang terstruktur dan sesuai kebutuhan.

---


## 3. Struktur Kontrol Keputusan (If-Else dan Switch-Case)

Struktur kontrol keputusan merupakan bagian dari pemrograman Java yang digunakan untuk menentukan tindakan berdasarkan kondisi tertentu. Struktur `if` menjalankan kode ketika kondisi bernilai benar (`true`), sedangkan `if-else` menyediakan alternatif ketika kondisi tidak terpenuhi. Adapun `else if` digunakan untuk memeriksa beberapa kondisi secara berurutan, seperti menentukan kelulusan mahasiswa berdasarkan nilai ujian.

Dalam praktikum ini, mahasiswa mempelajari penggunaan `switch-case` untuk memilih tindakan berdasarkan nilai tertentu. Pernyataan `break` berfungsi menghentikan eksekusi pada suatu kasus, sedangkan `default` dijalankan apabila tidak ada kasus yang sesuai. Selain itu, dipelajari operator logika `&&` (AND), `||` (OR), dan `!` (NOT) untuk menggabungkan atau membalik kondisi dalam pengambilan keputusan.

### Contoh Penerapan

**3.1. Percabangan If-Else**

```java
public class IfDemo {
    public static void main(String[] args) {
        int nilai = 80;

        if (nilai >= 75) {
            System.out.println("Anda LULUS");
        } else {
            System.out.println("Anda TIDAK LULUS");
        }
    }
}
```

Output:
```text
Anda LULUS
```

**3.2. Percabangan Else-If**

```java
public class KonversiNilai {
    public static void main(String[] args) {
        int nilai = 78;
        char huruf;

        if (nilai >= 85) {
            huruf = 'A';
        } else if (nilai >= 70) {
            huruf = 'B';
        } else if (nilai >= 55) {
            huruf = 'C';
        } else {
            huruf = 'E';
        }

        System.out.println("Nilai huruf: " + huruf);
    }
}
```

Output:
```text
Nilai huruf: B
```

**3.3. Penggunaan Switch-Case**

```java
public class SwitchDemo {
    public static void main(String[] args) {
        int hari = 3;

        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            default:
                System.out.println("Hari tidak dikenali");
        }
    }
}
```

Output:
```text
Rabu
```

**3.4. Penggunaan Operator Logika**

```java
public class LogikaDemo {
    public static void main(String[] args) {
        int nilaiUjian = 80;
        int kehadiran = 90;

        if (nilaiUjian >= 75 && kehadiran >= 80) {
            System.out.println("LULUS mata kuliah");
        } else {
            System.out.println("TIDAK LULUS mata kuliah");
        }
    }
}
```

Output:
```text
LULUS mata kuliah
```

### Hasil Praktikum

Praktikum ini memberikan pemahaman mengenai penggunaan struktur percabangan `if`, `if-else`, `else if`, dan `switch-case` dalam program Java. Selain itu, praktikum ini membantu memahami fungsi `break`, `default`, serta operator logika untuk menentukan keputusan berdasarkan satu atau beberapa kondisi.

### Analisis

Struktur kontrol keputusan memungkinkan program menghasilkan keluaran yang berbeda sesuai kondisi yang diperiksa. Percabangan `if-else` digunakan untuk dua kemungkinan, `else if` untuk beberapa kondisi, dan `switch-case` untuk memilih tindakan berdasarkan nilai tertentu. Urutan kondisi pada `else if` harus diperhatikan agar hasilnya tepat. Sementara itu, operator `&&`, `||`, dan `!` membantu menggabungkan atau membalik kondisi sehingga pengambilan keputusan dapat dilakukan dengan lebih fleksibel.

---


## 4. Perulangan dan Array

Perulangan dan array merupakan konsep dasar dalam pemrograman Java yang digunakan untuk mengolah data secara berulang dan terstruktur. Perulangan memungkinkan suatu blok kode dijalankan berkali-kali tanpa harus menuliskan perintah yang sama berulang kali. Java menyediakan tiga jenis perulangan utama, yaitu `for`, `while`, dan `do-while`. Perulangan `for` cocok digunakan ketika jumlah iterasi sudah diketahui, `while` memeriksa kondisi sebelum menjalankan kode, sedangkan `do-while` menjalankan kode minimal satu kali sebelum memeriksa kondisi.

Dalam praktikum ini, mahasiswa juga mempelajari perulangan bersarang (*nested loop*), yaitu perulangan di dalam perulangan yang dapat digunakan untuk membuat pola bintang dan mengolah matriks. Selain itu, dipelajari penggunaan `break` untuk menghentikan perulangan dan `continue` untuk melewati iterasi tertentu. Materi array mencakup array satu dimensi dan dua dimensi, cara mengakses elemen menggunakan indeks yang dimulai dari 0, serta penggunaan perulangan untuk menampilkan dan mengolah seluruh elemen array.

Array juga dapat digunakan untuk melakukan berbagai operasi pengolahan data, seperti menghitung total dan rata-rata, mencari nilai maksimum dan minimum, melakukan pencarian data (*linear search*), serta menghitung jumlah elemen pada matriks. Selain itu, praktikum ini memperkenalkan algoritma pengurutan sederhana, seperti *bubble sort* dan *selection sort*, untuk mengurutkan data tanpa menggunakan metode pengurutan bawaan Java.

### Contoh Penerapan

**1. Perulangan For**

```java
public class ForDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }
    }
}
```

Output:
```text
Perulangan ke-1
Perulangan ke-2
Perulangan ke-3
Perulangan ke-4
Perulangan ke-5
```

**4.2. Perulangan While**

```java
public class WhileDemo {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println("Iterasi ke-" + i);
            i++;
        }
    }
}
```

Output:
```text
Iterasi ke-1
Iterasi ke-2
Iterasi ke-3
Iterasi ke-4
Iterasi ke-5
```

**4.3. Perulangan Bersarang (Nested Loop)**

```java
public class PolaBintang {
    public static void main(String[] args) {
        int tinggi = 5;

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

Output:
```text
*
**
***
****
*****
```

**4.4. Deklarasi dan Pengaksesan Array**

```java
public class ArrayDemo {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 60, 88};

        System.out.println("Elemen pertama: " + nilai[0]);
        System.out.println("Jumlah elemen: " + nilai.length);

        for (int n : nilai) {
            System.out.println(n);
        }
    }
}
```

Output:
```text
Elemen pertama: 80
Jumlah elemen: 5
80
75
90
60
88
```

**4.5. Menghitung Total dan Rata-rata Array**

```java
public class OperasiArray {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 60, 88};
        int total = 0;

        for (int n : nilai) {
            total += n;
        }

        double rataRata = (double) total / nilai.length;

        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}
```

Output:
```text
Total: 393
Rata-rata: 78.6
```

### Hasil Praktikum

Praktikum ini memberikan pemahaman mengenai penggunaan perulangan `for`, `while`, dan `do-while`, perulangan bersarang, serta perintah `break` dan `continue`. Selain itu, mahasiswa mempelajari penggunaan array satu dimensi dan dua dimensi untuk menyimpan serta mengolah sekumpulan data. Operasi yang dipelajari meliputi perhitungan total dan rata-rata, pencarian nilai maksimum dan minimum, pencarian data, serta pengolahan matriks dan pengurutan data.

### Analisis

Perulangan membantu menjalankan instruksi secara berulang dengan lebih efisien, sedangkan array memungkinkan beberapa data dengan tipe yang sama disimpan dalam satu variabel. Penggunaan perulangan untuk mengakses array memudahkan proses pengolahan data, seperti menghitung rata-rata, mencari nilai tertinggi dan terendah, serta melakukan pencarian dan pengurutan. Pada array dua dimensi, perulangan bersarang digunakan untuk mengakses elemen berdasarkan baris dan kolom. Dengan memahami konsep perulangan dan array, program dapat dibuat lebih terstruktur dan mampu mengolah data dalam jumlah banyak.

---


## 5. Method dan Fungsi

Method merupakan blok kode dalam Java yang memiliki nama dan dapat dipanggil berulang kali untuk menjalankan tugas tertentu. Penggunaan method membantu mengurangi pengulangan kode, membuat program lebih terstruktur, serta memudahkan proses pemeliharaan dan perbaikan program. Pada praktikum ini, mahasiswa mempelajari method tanpa nilai kembali (`void`), method dengan parameter, dan method yang mengembalikan nilai menggunakan `return`.

Selain itu, dipelajari variabel lokal (*local variable*) yang hanya dapat diakses di dalam method tempat variabel tersebut dideklarasikan. Materi berikutnya adalah *method overloading*, yaitu penggunaan beberapa method dengan nama yang sama tetapi memiliki jumlah atau tipe parameter yang berbeda. Java akan menentukan method yang dipanggil berdasarkan parameter yang diberikan.

Praktikum ini juga membahas penggunaan array sebagai parameter method dan array sebagai nilai kembali (*return value*). Array dapat dikirimkan ke method untuk diolah, misalnya menghitung rata-rata dan mencari nilai maksimum. Method juga dapat mengembalikan array baru, seperti hasil pengurutan menggunakan algoritma *bubble sort*, tanpa mengubah array asli. Konsep-konsep tersebut membantu memisahkan proses pengolahan data menjadi bagian-bagian yang lebih terstruktur dan dapat digunakan kembali.

### Contoh Penerapan

**5.1. Method Tanpa Nilai Kembali (Void)**

```java
public class MethodDemo {
    static void sapa() {
        System.out.println("Halo, selamat datang!");
    }

    public static void main(String[] args) {
        sapa();
        sapa();
        sapa();
    }
}
```

Output:
```text
Halo, selamat datang!
Halo, selamat datang!
Halo, selamat datang!
```

**5.2. Method dengan Parameter**

```java
public class BiodataDemo {
    static void tampilkanBiodata(String nama, int umur, String kota) {
        System.out.println(nama + " (" + umur + " tahun) - " + kota);
    }

    public static void main(String[] args) {
        tampilkanBiodata("Budi", 20, "Bandung");
    }
}
```

Output:
```text
Budi (20 tahun) - Bandung
```

**5.3. Method dengan Nilai Kembali (Return)**

```java
public class ReturnDemo {
    static int tambah(int a, int b) {
        return a + b;
    }

    static boolean isGenap(int angka) {
        return angka % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Hasil tambah: " + tambah(15, 7));
        System.out.println("Apakah 8 genap? " + isGenap(8));
        System.out.println("Apakah 7 genap? " + isGenap(7));
    }
}
```

Output:
```text
Hasil tambah: 22
Apakah 8 genap? true
Apakah 7 genap? false
```

**5.4. Method Overloading**

```java
public class OverloadingDemo {
    static int tambah(int a, int b) {
        return a + b;
    }

    static int tambah(int a, int b, int c) {
        return a + b + c;
    }

    static double tambah(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(tambah(2, 3));
        System.out.println(tambah(2, 3, 4));
        System.out.println(tambah(2.5, 3.5));
    }
}
```

Output:
```text
5
9
6.0
```

**5. Method dengan Parameter Array**

```java
public class MethodArrayDemo {
    static double hitungRataRata(int[] data) {
        int total = 0;

        for (int nilai : data) {
            total += nilai;
        }

        return (double) total / data.length;
    }

    static int cariMaksimum(int[] data) {
        int max = data[0];

        for (int nilai : data) {
            if (nilai > max) {
                max = nilai;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nilaiUjian = {80, 75, 90, 60, 88};

        System.out.println("Rata-rata: " + hitungRataRata(nilaiUjian));
        System.out.println("Maksimum: " + cariMaksimum(nilaiUjian));
    }
}
```

Output:
```text
Rata-rata: 78.6
Maksimum: 90
```

**5.6. Method yang Mengembalikan Array**

```java
static int[] urutkanAscending(int[] data) {
    int[] hasil = data.clone();

    for (int i = 0; i < hasil.length - 1; i++) {
        for (int j = 0; j < hasil.length - 1 - i; j++) {
            if (hasil[j] > hasil[j + 1]) {
                int temp = hasil[j];
                hasil[j] = hasil[j + 1];
                hasil[j + 1] = temp;
            }
        }
    }

    return hasil;
}
```

Contoh penggunaan pada method `main`:
```java
int[] nilai = {80, 75, 90, 60, 88};
int[] terurut = urutkanAscending(nilai);

System.out.print("Setelah diurutkan: ");
for (int n : terurut) {
    System.out.print(n + " ");
}
```

Output:
```text
Setelah diurutkan: 60 75 80 88 90
```

### Hasil Praktikum

Praktikum ini memberikan pemahaman mengenai pembuatan dan pemanggilan method dalam Java, penggunaan parameter, nilai kembali (`return`), serta ruang lingkup variabel lokal. Mahasiswa juga mempelajari *method overloading* dan penggunaan array sebagai parameter maupun nilai kembali. Materi ini dapat diterapkan untuk membuat program yang lebih modular, mengurangi pengulangan kode, serta mempermudah pengolahan data.

### Analisis

Method membantu memisahkan program menjadi beberapa bagian berdasarkan tugasnya. Method `void` digunakan untuk menjalankan perintah tanpa mengembalikan nilai, sedangkan method dengan `return` menghasilkan nilai yang dapat digunakan kembali. *Method overloading* memungkinkan penggunaan nama method yang sama dengan parameter berbeda. Sementara itu, penggunaan array pada method mempermudah pengolahan sekumpulan data, seperti menghitung rata-rata, mencari nilai maksimum, dan mengurutkan data. Dengan menerapkan konsep tersebut, kode program menjadi lebih terstruktur, mudah dibaca, dan dapat digunakan kembali.

---


## Kesimpulan

Berdasarkan praktikum Pemrograman Berorientasi Objek Modul 1–5, dapat disimpulkan bahwa pemahaman dasar pemrograman Java dimulai dari persiapan lingkungan kerja menggunakan IntelliJ IDEA, JDK, Git, dan GitHub. Selanjutnya, mahasiswa mempelajari sintaks dasar Java, variabel, tipe data, operator, serta penggunaan input dan output untuk membuat program yang dapat menerima dan mengolah data.

Pada modul berikutnya, mahasiswa mempelajari struktur kontrol keputusan menggunakan `if-else` dan `switch-case` untuk menentukan alur program berdasarkan kondisi tertentu. Penggunaan perulangan seperti `for`, `while`, dan `do-while`, serta array satu dimensi dan dua dimensi, membantu proses pengolahan data secara berulang dan terstruktur. Selain itu, mahasiswa mempelajari method dan fungsi, penggunaan parameter, nilai kembali (`return`), *method overloading*, serta pengolahan array melalui method agar kode program lebih modular dan dapat digunakan kembali.

Melalui keseluruhan praktikum ini, mahasiswa memperoleh pemahaman mengenai tahapan dasar pembuatan program Java, mulai dari menulis dan menjalankan kode hingga mengelola perubahan menggunakan Git dan GitHub. Penerapan seluruh materi tersebut menjadi dasar untuk mengembangkan program yang lebih terstruktur, efisien, mudah dipahami, dan mudah dikembangkan pada materi Pemrograman Berorientasi Objek selanjutnya.
