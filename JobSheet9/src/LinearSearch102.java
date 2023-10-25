import java.util.Scanner;

public class LinearSearch102 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int key = 0, hasil = 0;

        System.out.println("Masukkan jumalah elemen array: ");
        int jumlahElemen = input10.nextInt();

        int [] arrayInt = new int[jumlahElemen];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Masukkan elemen array ke- " + i);
            arrayInt[i] = input10.nextInt();
        }

        System.out.println("masukkan key yang ingin dicari: ");
        key = input10.nextInt();


        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("key ada di posisi indeks ke- " + hasil);
                break;
            } else {
                System.out.println("key tidak ditemukan");
                break;
            }
        }

        input10.close();
    }
}
