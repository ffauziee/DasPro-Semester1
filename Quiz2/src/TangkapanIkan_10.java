import java.util.Scanner;

public class TangkapanIkan_10 {

    public static Scanner sc = new Scanner(System.in);

    public static double[][] extractValues(double[][] ikanTangkap) {
        return ikanTangkap;
    }
    public static double hitungRataWilayah(double[][] ikanTangkap) {
        double totalWilayah = 0;
        for (int i = 0; i < ikanTangkap.length; i++) {
            for (int j = 0; j < ikanTangkap[i].length; j++) {
                totalWilayah += ikanTangkap[i][j];
            }
        }
        return totalWilayah / (ikanTangkap.length * ikanTangkap[0].length);
    }

    public static double hitungRataArea(double[][] ikanTangkap) {
        double totalArea = 0;
        for (int i = 0; i < ikanTangkap.length; i++) {
            for (int j = 0; j < ikanTangkap[i].length; j++) {
                totalArea += ikanTangkap[i][j];
            }
        }
        return totalArea / (ikanTangkap.length * ikanTangkap[0].length);
    }

    public static double hitungTotal(double[][] ikanTangkap) {
        double totalTangkapan = 0;
        for (int i = 0; i < ikanTangkap.length; i++) {
            for (int j = 0; j < ikanTangkap[i].length; j++) {
                totalTangkapan += ikanTangkap[i][j];
            }
        }
        return totalTangkapan;
    }

    public static int cariAreaTerbanyak(double[][] ikanTangkap) {
        int areaTangkapTerbanyak = 0;
        double tangkapanTerbanyak = 0;
        for (int i = 0; i < ikanTangkap.length; i++) {
            for (int j = 0; j < ikanTangkap[i].length; j++) {
                if (i == 0 && j == 0 || ikanTangkap[i][j] > tangkapanTerbanyak) {
                    areaTangkapTerbanyak = (i + 1) * 10 + j + 1;
                    tangkapanTerbanyak = ikanTangkap[i][j];
                }
            }
        }
        return areaTangkapTerbanyak;
    }

    public static int cariAreaTerkecil(double[][] ikanTangkap) {
        int areaTangkapTerbanyak = 0;
        double tangkapanTerkecil = Double.MAX_VALUE;
        for (int i = 0; i < ikanTangkap.length; i++) {
            for (int j = 0; j < ikanTangkap[i].length; j++) {
                if (i == 0 && j == 0 || ikanTangkap[i][j] < tangkapanTerkecil) {
                    areaTangkapTerbanyak = (i + 1) * 10 + j + 1;
                    tangkapanTerkecil = ikanTangkap[i][j];
                }
            }
        }
        return areaTangkapTerbanyak;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah Wilayah: ");
        int m = sc.nextInt();
        System.out.print("Masukkan jumlah Area: ");
        int n = sc.nextInt();

        double[][] ikanTangkap = new double[m][n];

        System.out.println("Masukkan jumlah tangkapan ikan setiap area: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ikanTangkap[i][j] = sc.nextDouble();
            }
        }
    
        System.out.println("Jumlah rata-rata ikan yang ditangkap di seluruh wilayah: " + hitungRataWilayah(ikanTangkap));
        System.out.println("Jumlah rata-rata ikan yang ditangkap di seluruh area: " + hitungRataArea(ikanTangkap));
        System.out.println("Area dari setiap wilayah yang menghasilkan tangkapan tertinggi: " + cariAreaTerbanyak(ikanTangkap));
        System.out.println("Area dari wilayah yang menghasilkan tangkapan terendah: " + cariAreaTerkecil(ikanTangkap));
        System.out.println("Total ikan yang ditangkap: " + hitungTotal(ikanTangkap) + " kg");

    }
}

