import java.util.Scanner;
public class ForDongusu {
    public static void main(String[] args){
        int sayi = 10 , toplam = 0;

        for (int i=1; i <= sayi; i++)
        {
            toplam += i;
        }
        System.out.println("Toplam =" +toplam);
    }
}
