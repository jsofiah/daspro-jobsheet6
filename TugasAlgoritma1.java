import java.util.Scanner;
public class TugasAlgoritma1 {
    public static void main(String[] args) {
        Scanner bilangan21 = new Scanner(System.in);
        int bil1, bil2, bil3;

        System.out.print("Masukkan bilangan pertama : ");
        bil1 = bilangan21.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        bil2 = bilangan21.nextInt();
        System.out.print("Masukkan bilangan ketiga : ");
        bil3 = bilangan21.nextInt();

        if(bil1 > bil2){
            if(bil1 > bil3)
                System.out.println("Bilangan terbesar : " + bil1);
            else 
                System.out.println("Bilangan terbesar : " + bil3);
        }
        else{
            if(bil2 > bil3)
                System.out.println("Bilangan terbesar : " + bil2);
            else
                System.out.println("Bilangan terbesar : " + bil3);
        }
    }
}
