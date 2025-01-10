//this file is dedicated to explain oops concepts in java

/* Object oriented programming -oops is a methodology or paradigm to design a program using objects and classes.
 * It simplifies the software development and maintenance by providing us some oops concepts:
 * 
 * Objects
 * Class
 * Inheritance
 * Polymorphism
 * Abstraction
 * Encapsulation
 *  
 * Now we'll understand each of these with suitable examples - 
 * 
 * Object- An object is an entity that has state and behavior. ex - book, chair, pen,etc. It can be physical or logical.
 * 
 * Class - Collection of objects is called class. It is a logical entity.
 * A class can also be defined as blueprint using which you can create individual objects.Class does not consume any space.
*/
//a simple example - 
class Dog{
    int legs =4;
    String color = "brown"; 
    void bark(){
        System.out.println("Bow-bow");
    }
}
public class Main{
    public static void main(String [] args){
        //creating an object of class DOG

        Dog kutta1 = new Dog();
        kutta1.bark();
        System.out.println("This dog has "+kutta1.legs+" legs and " + kutta1.color+ " color.");
    }
}