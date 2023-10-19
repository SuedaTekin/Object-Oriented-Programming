import java.util.Scanner;
public class EtkinlikOnerme {
    public static void main(String[] args){
        // Hava sıcaklığını al
        // Sıcaklık 30 veya daha yüksekse yüzme etkinliğini öner
        // 5 ve 30 arasında ise sinema öner
        // 4 ve daha az ise kayak yapmayı öner
        Scanner scan = new Scanner(System.in);
        int sicaklik;
        System.out.println("Hava Sıcaklığı Giriniz :");
        sicaklik = scan.nextInt();

        if(sicaklik > 30){
            System.out.println("Bu havada yüzmeye gidilir. ");
        }else if(sicaklik <=30 && sicaklik>=5){
            System.out.println("Bu havada en iyi sinemaya gidilir.");
        }else{
            System.out.println("Bu havada en iyi kayak yapmaya gidilir." );
        }
    }
}
