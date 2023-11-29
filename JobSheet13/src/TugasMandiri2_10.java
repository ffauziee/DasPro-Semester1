import java.util.Scanner;

public class TugasMandiri2_10 {

    static int[][] nilaiTugas = {
            {20, 19, 25, 20, 10, 0, 10},
            {30, 30, 40, 10, 15, 20, 25},
            {5, 0, 20, 25, 10, 5, 45},
            {50, 0, 7, 8, 0, 30, 60},
            {15, 10, 16, 15, 10, 10, 5}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Data nilai tugas mahasiswa:");
        tampilkanData();

        int hari = cariHariNilaiTertinggi();
        System.out.println("Pada hari ke-" + hari + " terdapat nilai tertinggi dibanding hari lain.");

        int nomorMahasiswa = nomorMahasiswaNilaiTertinggi();
        System.out.println("Mahasiswa yang memiliki nilai tertinggi adalah nomor mahasiswa ke-" + nomorMahasiswa + ".");
        System.out.println("Keterangan nilai:");
        tampilkanDataMahasiswa(nomorMahasiswa);

        scanner.close();
    }

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan data nilai tugas mahasiswa:");
        for (int i = 0; i < nilaiTugas.length; i++) {
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                nilaiTugas[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
    }

    public static void tampilkanData() {
        for (int i = 0; i < nilaiTugas.length; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + " : ");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print(nilaiTugas[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari pada hari keberapakah terdapat nilai tertinggi dibanding hari lain dari keseluruhan mahasiswa
    public static int cariHariNilaiTertinggi() {
        int hari = 0;
        int nilaiTertinggi = nilaiTugas[0][0];
        for (int i = 0; i < nilaiTugas.length; i++) {
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                if (nilaiTugas[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiTugas[i][j];
                    hari = j + 1;
                }
            }
        }
        return hari;
    }

    // Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi
    public static int nomorMahasiswaNilaiTertinggi() {
        int nomorMahasiswa = 0;
        int nilaiTertinggi = nilaiTugas[0][0];
        for (int i = 0; i < nilaiTugas.length; i++) {
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                if (nilaiTugas[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiTugas[i][j];
                    nomorMahasiswa = i + 1;
                }
            }
        }
        return nomorMahasiswa;
    }

    // Fungsi untuk menampilkan data mahasiswa berdasarkan nomor mahasiswa yang dipilih
    public static void tampilkanDataMahasiswa(int nomorMahasiswa) {
        System.out.print("Data nilai mahasiswa nomor " + nomorMahasiswa + " : ");
        for (int i = 0; i < nilaiTugas[nomorMahasiswa - 1].length; i++) {
            System.out.print(nilaiTugas[nomorMahasiswa - 1][i] + " ");
        }
        System.out.println();
    }
}