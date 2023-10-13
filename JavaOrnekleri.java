import java.util.Scanner;
public class JavaOrnekleri {
    public static void main(String[] args){
        Scanner reader= new Scanner(System.in);
        System.out.println("Bir Sayı Girin:");

        double sayi= reader.nextInt();
        if(sayi< 0.0)
            System.out.println(sayi+ "Negatiftir.");
        else if(sayi > 0.0)
            System.out.println(sayi +"Pozitiftir.");
        else
            System.out.println(sayi +"Sıfırdır.");
    }
}
