import javax.swing.plaf.synth.SynthTextAreaUI;

public class  TestClass{
    void m() {
        try {
            int data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Sıfıra bölme hatası yakalandı.");
        }
    }
    void n(){
        m();
    }
    void p(){
            n();
        }
    public static void main(String args[]){
        TestClass obj = new TestClass();
        obj.p();
        System.out.println("normal flow...");
    }
}
