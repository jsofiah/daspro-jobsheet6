import java.util.Scanner;
public class TugasAlgoritma2 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        String jenisBuku;
        int jumlahBeli, diskon = 0;

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = input21.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBeli = input21.nextInt();

        if(jenisBuku.equalsIgnoreCase("Kamus")){
            if(jumlahBeli < 1)
                System.out.println("Input tidak valid");
            else {
                diskon = 10;
                if(jumlahBeli < 1)
                    System.out.println("Input tidak valid");
                else if(jumlahBeli > 2)
                    diskon += 2;
                else
                    diskon +=0;
            }
        }
        else if(jenisBuku.equalsIgnoreCase("Novel")){
            if(jumlahBeli < 1)
                System.out.println("Input tidak valid");
            else{
                diskon = 7;
                if(jumlahBeli > 3)
                    diskon += 2;
                else if(jumlahBeli <= 3)
                    diskon += 1;
                else 
                    diskon +=0;
            }
        }
        else{
            if(jumlahBeli < 1)
                System.out.println("Input tidak valid");
            else if(jumlahBeli >3)
                diskon = 5;
            else 
                diskon = 0;
        }

        System.out.println("Diskon yang didapat sebesar " + diskon + " %");
    }
}
