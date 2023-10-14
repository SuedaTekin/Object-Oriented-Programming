import java.util.Scanner;
public class cembercevresi {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Çemberin yarıçapını giriniz:");
        int yarıcap=scan.nextInt();
        System.out.println("Çemberin çevresi="+(2*Math.PI * yarıcap));
    }
}
