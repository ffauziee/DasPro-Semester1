public class Quizz {

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
        double highestCatch = 0;
        for (int i = 0; i < ikanTangkap.length; i++) {
            for (int j = 0; j < ikanTangkap[i].length; j++) {
                if (i == 0 && j == 0 || ikanTangkap[i][j] > highestCatch) {
                    areaTangkapTerbanyak = (i + 1) * 10 + j + 1;
                    highestCatch = ikanTangkap[i][j];
                }
            }
        }
        return areaTangkapTerbanyak;
    }

    public static int cariAreaTerkecil(double[][] ikanTangkap) {
        int areaTangkapTerbanyak = 0;
        double lowestCatch = Double.MAX_VALUE;
        for (int i = 0; i < ikanTangkap.length; i++) {
            for (int j = 0; j < ikanTangkap[i].length; j++) {
                if (i == 0 && j == 0 || ikanTangkap[i][j] < lowestCatch) {
                    areaTangkapTerbanyak = (i + 1) * 10 + j + 1;
                    lowestCatch = ikanTangkap[i][j];
                }
            }
        }
        return areaTangkapTerbanyak;
    }

    public static void main(String[] args) {
        double[][] ikanTangkap = {
            {8.2, 9.5, 8.3, 9.4, 7.9, 9.0, 8.0, 9.2},
            {7.3, 8.1, 7.8, 8.4, 7.0, 8.5, 7.5, 8.6},
            {7.4, 8.7, 7.6, 8.3, 7.2, 8.2, 7.4, 8.6},
            {7.6, 8.4, 7.8, 8.0, 7.4, 8.5, 7.6, 8.8},
            {7.5, 8.5, 7.8, 8.3, 7.2, 8.6, 7.4, 8.7}
        };
    
        System.out.println("Jumlah rata-rata jumlah ikan yang ditangkap di seluruh wilayah: " + hitungRataWilayah(ikanTangkap));
        System.out.println("Jumlah rata-rata ikan yang ditangkap di seluruh area: " + hitungRataArea(ikanTangkap));
        System.out.println("Area dari setiap wilayah yang menghasilkan tangkapan tertinggi: " + cariAreaTerbanyak(ikanTangkap));
        System.out.println("Area dari wilayah yang menghasilkan tangkapan terendah: " + cariAreaTerkecil(ikanTangkap));
        System.out.println("Total ikan yang ditangkap: " + hitungTotal(ikanTangkap) + " kg");

    }
}

