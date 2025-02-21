class Animal {
    public void sound() {
        System.out.println("Animals make sounds");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dogs bark");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cats meow");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal(); 
        Animal dog = new Dog();       
        Animal cat = new Cat();       
        animal.sound(); 
        dog.sound();   
        cat.sound(); 
    }
}