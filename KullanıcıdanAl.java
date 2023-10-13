import java.util.Scanner;
public class KullanıcıdanAl {
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayi girin:");
        float s1 = scan.nextFloat();

        System.out.print("İkinci sayi girin:");
        float s2 = scan.nextFloat();

        float carpim = s1 * s2;
        System.out.println("Çarpım Sonucu: " + carpim);
    }
}
