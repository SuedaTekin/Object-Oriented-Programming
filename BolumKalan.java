import java.util.Scanner;
public class BolumKalan {
    public static void main(String[] args){

        int bolunen = 25, bolen = 4;

        int bolum = bolunen / bolen;
        int kalan =bolunen % bolen;

        System.out.println("Bölüm = " + bolum);
        System.out.println("Kalan = " + kalan);
    }
}
