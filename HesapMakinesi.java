import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("1.Sayısını giriniz: ");
        int sayi1=scan.nextInt();
        System.out.println("2.Sayısını giriniz: ");
        int sayi2=scan.nextInt();

        System.out.println("***İSLEMİNİZİ GİRİNİZ***");
        System.out.println("1.TOPLAMA");
        System.out.println("2.ÇIKARMA");
        System.out.println("3.ÇARPMA");
        System.out.println("4.BÖLME");

        System.out.println("Seciminizi giriniz: ");
        int secim = scan.nextInt();

        if(secim == 1){
            System.out.println("Toplama isleminizin sonucu =" + (sayi1 +sayi2));
        }
        else if(secim == 2){
            System.out.println("Çıkarma işleminin sonucu: " +(sayi1 -sayi2));
        }
        else if(secim == 3) {
            System.out.println("Carpma isleminin sonucu = " + (sayi1 * sayi2));
        }
        else if(secim == 4) {
            System.out.println("Bölme isleminin sonucu = " + (float)sayi1 / sayi2);
        }
        else {
            System.out.println("Yanlıs secim yaptınız. Seciminizi kontrol ediniz.");
        }
    }
}
