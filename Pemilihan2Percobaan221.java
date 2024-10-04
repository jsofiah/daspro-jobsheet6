import java.util.Scanner;
public class Pemilihan2Percobaan221 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        String member, jenisPembayaran;
        int jumlah_beli, menu;
        double diskon, harga, total_bayar;

        System.out.println("_________________________________________");
        System.out.println("============== MENU KAFE JTI ============");
        System.out.println("_________________________________________");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("_________________________________________");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        menu = input21.nextInt();
        input21.nextLine();
        System.out.print("Apakah anda bagian dari member (y/n)? = ");
        member = input21.nextLine();
        System.out.print("Jenis pembayaran melalui QRIS (y/n) = ");
        jenisPembayaran = input21.nextLine();
        System.out.println("_________________________________________");

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

        if(member.equalsIgnoreCase("y")){
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            total_bayar = harga - (harga * diskon);
        }
        else if(member.equalsIgnoreCase("n")){
            total_bayar = harga;
        }
        else{
            System.out.println("Member tidak valid");
            return;
        }

        if(jenisPembayaran.equalsIgnoreCase("y")){
            total_bayar -= 1000;
            System.out.println("Total Pembayaran via QRIS = " + total_bayar);
        }
        else{
            System.out.println("Total Pembayaran = " + total_bayar);
        }
        System.out.println("_________________________________________");
    }
}
