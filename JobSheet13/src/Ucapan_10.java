import java.util.Scanner;

public class Ucapan_10 {
   
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan Nama orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("thank you " + nama + "\nMay the force be with you.");
    }
    
}
