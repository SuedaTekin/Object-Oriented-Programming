import java.awt.*;

public class Operatorler {

    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int toplam = a + b;
        int cikarma = a - b;
        int carpma = a * b;
        int bolme = a / b;
        int mod = a % b;
        System.out.println("Toplam :" +toplam);
        System.out.println("Çıkarma:" +cikarma);
        System.out.println("Çarpma :" +carpma);
        System.out.println("Bölme:" +bolme);
        System.out.println("Mod:" +mod);
        toplam++ ;
        System.out.println(toplam);
        cikarma-- ;
        System.out.println(cikarma);

        int sonuc1 = ++a + --b;
        int sonuc2 = a++ + b--;
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(a);
        System.out.println(b);
    }

}

