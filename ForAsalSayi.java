import java.util.Scanner;
public class ForAsalSayi {
    public static void main(String[] args){
        //Asal sayı bulma

        Scanner scan=new Scanner(System.in);
        int input;
        boolean asal=true;
        do{
            System.out.println("Lütfen pozitif bir sayı giriniz :");
            input = scan.nextInt();
        } while(input < 2);

        for(int i = 2; i < input; i++){
            if(input%i==0){
                asal=false;
                break;
            }
        }
        if( asal ){
            System.out.println("Girilen sayı :" + input + " asaldır.");
        }else{
            System.out.println("Girilen sayı :" + input + " asal değildir.");
        }
    }
}
