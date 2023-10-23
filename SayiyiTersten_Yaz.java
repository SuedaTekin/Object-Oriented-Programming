import java.util.Scanner;
public class SayiyiTersten_Yaz {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        System.out.println("Girilen sayının tersten yazılışı = ");
        while(sayi > 0){

            System.out.println(sayi % 10);
            sayi /= 10;
        }
    }
}
