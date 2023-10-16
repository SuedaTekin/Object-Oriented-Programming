import java.util.Scanner;

public class IsaretDegistirme {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi=scanner.nextInt();

        if(sayi <0){
            //Eğer girilen sayı negatifse, pozitif değerini bulun
            int pozitifSayi = sayi * (-1);
            System.out.println("Girelen değerin pozitif = " +pozitifSayi);
        }else if(sayi>0){
            //eğer girilen sayı pozitifse,negatif değerini bulun
            int negatifSayi = sayi * (-1);
            System.out.println("Girilen değerin negatifi = "+ negatifSayi);
        }else{
            //Eğer girilen sayı sıfırsa,sıfırın negatif ve pozitif değeri aynıdır
            System.out.println("Girilen sayı sıfırdır.");
        }
    }
}
