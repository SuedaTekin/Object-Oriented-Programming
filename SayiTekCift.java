import java.util.Scanner;
public class SayiTekCift {
    public static void main(String[] args){

        Scanner giris = new Scanner(System.in);
        int sayi;
        System.out.print("Bir tane tam sayı giriniz:");
        sayi = giris.nextInt();

        if(sayi % 2 == 0){
            System.out.println(sayi + "Sayısı Çift Sayıdır");
        }
        else{
            System.out.println(sayi + " Sayısı Tek Sayıdır");
        }
    }
}
