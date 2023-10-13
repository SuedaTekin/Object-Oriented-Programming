import java.sql.SQLOutput;

public class YerDeğiştirme {
    public static void main(String[] args){
        float birinci = 1.20f, ikinci =2.45f;

        System.out.println("--Değişimden önce--");
        System.out.println("Birinci Sayı =" +birinci);
        System.out.println("ikinci sayı =" + ikinci);

        float gecici = birinci;
        birinci =ikinci;
        ikinci=gecici;

        System.out.println("--Değişimden sonra--");
        System.out.println("birinci sayı ="+ birinci);
        System.out.println("ikinci sayı ="+ ikinci);
    }
}
