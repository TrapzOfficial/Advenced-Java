class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

public class OOPExample {
    public static void main(String[] args) {
        Animal a = new Animal("Generic");
        a.sound();

        Dog d = new Dog("Buddy");
        d.sound();
    }
}
