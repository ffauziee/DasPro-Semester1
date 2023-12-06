import java.util.Scanner;

public class LinearSearch102 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int key = 0, hasil;

        System.out.println("Masukkan jumalah elemen array: ");
        int jumlahElemen = input10.nextInt();

        int [] arrayInt = new int[jumlahElemen];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Masukkan elemen array ke- " + (i+1));
            arrayInt[i] = input10.nextInt();
        }

        System.out.println("masukkan key yang ingin dicari: ");
        key = input10.nextInt();


        int i = 0;
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("key ada di posisi indeks ke- " + (hasil+1));
            } else {
                System.out.println("key tidak ditemukan");
            }
            input10.close();
    }

        
}

