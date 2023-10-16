import java.util.Scanner;

public class CarpımTablosu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Çarpılacak sayıyı giriniz: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            System.out.print("Kaça kadar çarpılacak: ");
            if (scanner.hasNextInt()) {
                int y = scanner.nextInt();

                System.out.println(n + " çarpım tablosu:");
                for (int i = 1; i <= y; i++) {
                    System.out.println(n + " * " + i + " = " + (n * i));
                }
            } else {
                System.out.println("Lütfen geçerli bir sayı giriniz.");
            }
        } else {
            System.out.println("Lütfen geçerli bir sayı giriniz.");
        }
    }
}
