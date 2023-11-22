import java.util.Scanner;

public class UcapanTerimaKasih_10 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimakasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" + "you inspired in me a love for learning and made me feel like i could ask you anything.");

    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
        String ucapan = "Terima kasih pak.. bu.. semoga sehat selalu";
        UcapanTambahan(ucapan);
    }
}
