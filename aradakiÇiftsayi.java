import java.util.Scanner;

public class aradakiÇiftsayi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        if (input.hasNextInt()) {
            int sayiBirinci = input.nextInt();

            System.out.print("İkinci sayıyı giriniz: ");
            if (input.hasNextInt()) {
                int sayiIkinci = input.nextInt();

                int toplam = 0;

                for (int i = sayiBirinci + 1; i < sayiIkinci; i++) {
                    if (i % 2 == 0) {
                        toplam = toplam + i;
                    }
                }

                System.out.println("İki sayı arasındaki çift sayıların toplamı: " + toplam);
            } else {
                System.out.println("Geçerli bir ikinci sayı girilmedi.");
            }
        } else {
            System.out.println("Geçerli bir ilk sayı girilmedi.");
        }
    }
}
