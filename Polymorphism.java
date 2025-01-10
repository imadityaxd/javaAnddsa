/*Polymorphism - If one task is performed in many ways it is known as polymorphism. It means that something (method or object) can act in different ways depending on the situation.
 * ex- If you ask an animal to speak - 
 * a dog will bark
 * a cat will meow
 * a horse will neigh
 * 
 * There are two types of polymorphism in Java - 
 * 1. Compile time polymorphism 
 * 2. Run time polymorphism
 * 
 */


/* Compile-time polymorphism (Method Overloading) - In method overloading, multiple methods have same name but different parameters. The method to be called is determined during compile time. */
class Addition{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}

/* Run-time polymorphism (Method Overriding) - In method overriding, a subclass provides a specific implementation of a method already defined in its superclass. The method to be executed is determined at runtime based on the object type. 
 * Multiple methods have same name but different outputs based on their object.
 */

class Bike{
    int wheels = 2;
    void run(){
        System.out.println("Runnning...");
    }
}
class R15 extends Bike{
    void run(){
        System.out.println("I'm Chappri");
    }
}
class Splendor extends Bike{
    void run(){
        System.out.println("Cheeta hi kehde");
    }
}
public class Polymorphism {
    public static void main(String [] args){
        System.out.println("Compile-time Polymorphism...");

        Addition a1 = new Addition();
        System.out.println(a1.add(4,3));
        System.out.println(a1.add(4,3,3));
        System.out.println(a1.add(4.5,3.4));

        System.out.println("Run-time Polymorphism...");

        Bike b = new Splendor();
        b.run();
        Bike b1 = new R15();
        b1.run();
        

    }
}
