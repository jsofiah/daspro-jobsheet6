import java.util.Scanner;
public class Pemilihan2Percobaan221 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        String member, pembayaran;
        int jumlah_beli, menu;
        double diskon, harga, total_bayar;

        System.out.println("________________________________________");
        System.out.println("============+ MENU KAFE JTI ============");
        System.out.println("________________________________________");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("________________________________________");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        menu = input21.nextInt();
        input21.nextLine();
        System.out.print("Apakah anda bagian dari member (y/n)? = ");
        member = input21.nextLine();
        System.out.print("Jenis pembayaran melalu QRIS (y/n) = ");
        pembayaran = input21.nextLine();
        System.out.println("________________________________________");

        if (member.equalsIgnoreCase("y")){
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (menu == 1){
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } 
            else if (menu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            }
            else if (menu == 3){
                harga = 15000;
                System.out.println("Harga bunding = " + harga);
            }
            else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        }
        else if (member.equalsIgnoreCase("n")) {
            if (menu == 1){
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } 
            else if (menu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            }
            else if (menu == 3){
                harga = 15000;
                System.out.println("Harga bunding = " + harga);
            }
            else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga;
            System.out.println("Total bayar = " + total_bayar);
        }
        else {
            System.out.println("Member tidak valid");
            return;
        }

        if(pembayaran.equalsIgnoreCase("y")){
            total_bayar -= 1000;
            System.out.println("Total bayar via QRIS = " + total_bayar);
        }
        System.out.println("________________________________________");
    }
}