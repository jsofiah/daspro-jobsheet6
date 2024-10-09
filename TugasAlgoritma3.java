import java.util.Scanner;
public class TugasAlgoritma3 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        String merk, kategori;
        int ukuran;
        double harga = 0;

        System.out.print("Masukkan merk: ");
        merk = input21.nextLine();
        System.out.print("Masukkan kategori: ");
        kategori = input21.nextLine();
        System.out.print("Masukkan ukuran: ");
        ukuran = input21.nextInt();

        if(merk.equalsIgnoreCase("Converse")) {
            if(kategori.equalsIgnoreCase("Slip On")) {
                if(ukuran >= 36) {
                    if(ukuran <= 40) {
                        harga = 800000;
                    } else {
                        System.out.println("Ukuran tidak tersedia");
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else if(kategori.equalsIgnoreCase("High Top")) {
                if(ukuran >= 36) {
                    if(ukuran <= 44) {
                        harga = 1200000;
                    } else {
                        System.out.println("Ukuran tidak tersedia");
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else {
                System.out.println("Kategori tidak tersedia");
            }
        } else if(merk.equalsIgnoreCase("Sketcher")) {
            if(kategori.equalsIgnoreCase("Woman")) {
                if(ukuran >= 36) {
                    if(ukuran <= 41) {
                        harga = 1000000;
                    } else {
                        System.out.println("Ukuran tidak tersedia");
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else if(kategori.equalsIgnoreCase("Man")) {
                if(ukuran >= 41) {
                    if(ukuran <= 44) {
                        harga = 1800000;
                    } else {
                        System.out.println("Ukuran tidak tersedia");
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else {
                System.out.println("Kategori tidak tersedia");
            }
        } else if(merk.equalsIgnoreCase("Nike")) {
            if(kategori.equalsIgnoreCase("Kids")) {
                if(ukuran >= 36) {
                    if(ukuran <= 40) {
                        harga = 750000;
                    } else {
                        System.out.println("Ukuran tidak tersedia");
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else if(kategori.equalsIgnoreCase("Adult")) {
                if(ukuran >= 40) {
                    if(ukuran <= 44) {
                        harga = 1500000;
                    } else {
                        System.out.println("Ukuran tidak tersedia");
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else {
                System.out.println("Kategori tidak tersedia");
            }
        } else {
            System.out.println("Merk tidak tersedia");
        }

        System.out.println("Pembelian " + merk + " kategori " + kategori + " dengan ukuran " + ukuran);
        System.out.println("Total pembelian : " + harga);
    }
}
