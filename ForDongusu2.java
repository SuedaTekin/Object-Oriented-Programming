import java.util.Scanner;
public class ForDongusu2 {
    public static void main(String[] args){
        Scanner reader= new Scanner(System.in);
        System.out.println("Bir Sayı Girin:");

        int sayi=reader.nextInt();
        int toplam =0;

        for(int i = 1; i <= sayi; ++i)
        {
            toplam += i;
        }
        System.out.println("Sayıların Toplamı = " + toplam);
    }
}
