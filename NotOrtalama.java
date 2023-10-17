import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args){
        int quiz ,vize,fınal;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.println("Quiz notunu giriniz :");
        quiz=input.nextInt();
        System.out.println("Vize notunu giriniz :");
        vize=input.nextInt();
        System.out.println("Final notunu giriniz :");
        fınal=input.nextInt();

        ortalama=(quiz * 0.1) +(vize *0.40)+(fınal *0.50);
        System.out.println("Not ortalamaınız :" + ortalama);
        String sonuc=(ortalama >= 50) ? "Geçtiniz" : "Kaldınız";
        System.out.println(sonuc);
    }
}
