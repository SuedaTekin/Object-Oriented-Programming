import java.util.Scanner;
public class AtmProje {
    public static void main(String[] args){
        int bakiye = 1000,input, miktar;
        Scanner scan = new Scanner(System.in);

        System.out.println("Merhabalar Sueda Tekin Banka Hoşgeldiniz");
        System.out.println("Güncel Bakiye : " + bakiye + "TL");

        while(bakiye>0){
            System.out.println();
            System.out.println("1- Para Yatır");
            System.out.println("2- Para Çek");
            System.out.println("3- Bakiye Sorgula ");
            System.out.println("4- Çıkış Yap ");
            System.out.println("Yapmak istediğiniz İşlemi Seçiniz :");
            input = scan.nextInt();

            if(input == 1){
                System.out.println("Yatırmak istediğiniz miktar :");
                miktar = scan.nextInt();
                bakiye += miktar;
            }else if(input == 2){
                System.out.println("Çekmek istediğiniz miktar :");
                miktar = scan.nextInt();
                if(miktar > bakiye){
                    System.out.println("Yetersiz Bakiye !");
                }else{
                    bakiye -= miktar;
                }
            }else if(input == 3){
                System.out.println("Güncel Bakiyeniz :" + bakiye + "TL");
            }else if(input == 4){
                System.out.println("Çıkış Yapılıyor ");
                break;
            }else{
                System.out.println("Geçersiz bir işlem girdiniz !");
            }
        }
        System.out.println("Tekrar Bekleriz ");
    }
}
