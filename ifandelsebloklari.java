public class ifandelsebloklari {
    public static void main(String[] args){
        int a = 10,b = 2,c = 25;

        if((a < c) && (a < b)){
            System.out.println("A en küçük sayıdır.");
        }else if((c < a) && ( c < b)){
            System.out.println("C en küçük sayıdır.");
        }else{
            System.out.println("B en küçük sayıdır.");
        }
        if(a == 10){
            System.out.println("A 10'a eşittir.");
        }
    }
}
