package src;
import java.util.Scanner;

public class DoWhileCuti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah Hari cuti: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    System.out.println("Sisa jatah cuti anda adalah " + jatahCuti);
                    System.out.print("Apakah anda ingin memilih ulang hari cuti anda? (y/t)?: ");
                    konfirmasi = sc.next();

                    if (konfirmasi.equalsIgnoreCase("y")) {
                    System.out.print("Jumlah Hari cuti: ");
                    jumlahHari = sc.nextInt();

                    if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("sisa jatah cuti: \n" + jatahCuti);
                    break;
                    } else if (jumlahHari >= jatahCuti) {System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    System.out.println("Sisa jatah cuti anda adalah " + jatahCuti);
                    System.out.print("apakah anda ingin mengambil cuti sesuai sisa jatah cuti anda (y/t)?: ");
                    konfirmasi = sc.next();
                    if (konfirmasi.equalsIgnoreCase("y")) {
                        jatahCuti = 0;
                        break;
                    } else if (konfirmasi.equalsIgnoreCase("t")) {
                        System.out.println("Terimakasih");
                        break;
                    }

                    }

                     } else {System.out.println("Terimakasih");
                        break;

                }
            }
        } 
        else {
                System.out.println("Terimakasih");
                break;
            }

        } while(jatahCuti > 0);
        
        sc.close();

    }
    
}
