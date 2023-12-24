import java.util.Scanner;
public class Konversi_10 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Desimal: ");
        int desimal = input21.nextInt();

        String[] konversi = {"Biner", "Oktal", "Hexadesimal"};
        boolean ulangi = true;

        while (ulangi) {
            System.out.println("Pilih Konversi: ");
            for(int i = 0; i < konversi.length; i++){
                System.out.println((i + 1) + ". Konversi ke " + konversi[i]);
            }
            System.out.println((konversi.length + 1) + ". Keluar");
            System.out.print("Masukkan pilihan (1-" + (konversi.length +1) + ")");
            int pilihan = input21.nextInt();

            if (pilihan >= 1 && pilihan <= konversi.length) {
                switch (pilihan) {
                    case 1:
                        String binary = Integer.toBinaryString(desimal);
                        System.out.println("Bilangan biner : " + binary);
                        break;
                    case 2:
                        String oktal = Integer.toOctalString(desimal);
                        System.out.println("Bilangan oktal : " + oktal);
                        break;
                    case 3:
                        String hexa = Integer.toHexString(desimal);
                        System.out.println("Bilangan hexa : " + hexa);
                    default:
                        break;
                }
            } else if(pilihan == konversi.length + 1){
                ulangi = false;
            } else {
                System.out.println("Pilihan tidak valid");
            }
        }
        input21.close();
    }
}