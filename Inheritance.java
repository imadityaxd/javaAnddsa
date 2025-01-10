//Inheritance - When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. It provides code reusability. It is used to achieve runtime polymorphism.
//syntax - class Dog extends Animal
//Example below- 
class Animal{
    int ears = 2;
    int eyes = 2;
    int legs;
    void eat(){
        System.out.println("Eating...");
    }
    void bath(){
        System.out.println("Bathing...");
    }
};

class Dog extends Animal{
    int legs = 4;
    String color = "Brown";
};

public class Inheritance{
    public static void main(String [] args){
        Dog abhishek = new Dog();
        abhishek.bath();
        abhishek.eat();
        System.out.println("The color of this dog is: " + abhishek.color);
    } 
}