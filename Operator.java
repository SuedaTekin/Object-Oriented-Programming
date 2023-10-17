public class Operator {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int toplam = a + b;
        int cikarma = a - b;
        int carpma = a * b;
        int bolme = a / b;
        int mod = a % b;

        toplam++;
        cikarma--;

        int sonuc = ++a + --b;

        int sayi1 =10;
        int sayi2=5;

        boolean kosul = (sayi1/sayi2)==2;
        System.out.println(kosul);

        boolean kosul1 =(sayi1>sayi2);
        boolean kosul2=(sayi2>sayi1);

        boolean sonuc2=kosul1 && kosul2;
        System.out.println(sonuc2);

        sonuc2 = kosul1 || kosul2;
        System.out.println(sonuc2);


    }
}
