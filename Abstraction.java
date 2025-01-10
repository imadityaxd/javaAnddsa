/* Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where we type the text and send the message. We do not know the internal processing about the message delivery.

Abstraction lets you focus on what the object does instead of how it does it.*/

//There are two ways to achieve abstraction in Java:

//Using Abstract Class (0 to 100%)

//Using Interface (100%)


//Using class ->
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

/*Using Interface - The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.*/
interface printable {
    void print();
}
interface runnable {
    void run();
}
class Coder implements printable, runnable{
    public void print(){
        System.out.println("Print the page...");
    };
    public void run(){
        System.out.println("Run towards your goal...");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        System.out.println("Abstraction...");
        Bank b1 =new SBI();
        b1.roi();
        Bank b2 = new UCO();
        b2.roi();

        Coder c1 = new Coder();
        c1.print();
        c1.run();

    }
}
