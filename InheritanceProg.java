class Animal{
    public void walk(){
        System.out.println("Waking....");
    }
    public void eating(){
        System.out.println("eating..");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Barking...");
    }
}
public class InheritanceProg {
    public static void main(String[] args) {
    Dog tom=new Dog();
    tom.walk();
    tom.eating();
    tom.bark();
    }
}
