abstract class Bank{
    abstract void roi();
}
class SBI extends Bank{
    void roi(){
        System.out.println("7%");
    };
}
class UCO extends Bank{
    void roi(){
        System.out.println("11%");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        System.out.println("Abstraction...");
        Bank b1 =new SBI();
        b1.roi();
        Bank b2 = new UCO();
        b2.roi();
    }
}
