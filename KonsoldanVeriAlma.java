import java.net.StandardSocketOptions;
import java.util.Scanner;
public class KonsoldanVeriAlma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b;

        System.out.println("A sayısını giriniz : ");
        a = input.nextInt();
        System.out.println("B saysını giriniz :");
        b = input.nextInt();

        System.out.println("A sayısı :" +a);
        System.out.println("B sayısı :" +b);
        
    }

}
