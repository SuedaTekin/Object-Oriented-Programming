import java.util.Scanner;
public class aHarfi {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sayac=0;

        System.out.println("Cumle veya kelime giriniz:");
        String cumle = scan.nextLine();

        for(int i=0; i<cumle.length();i++)
        {
            if(cumle.charAt(i)=='a' || cumle.charAt(i) == 'A'){
                sayac++;
            }
        }
        System.out.println("Girilen cumle veya kelimede " + sayac + "tane 'a' harfi vardir.");
    }
}
