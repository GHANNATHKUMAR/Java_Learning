class Animal {
}

class Dog extends Animal {
}

public class Midsemp3 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        // Checking if myDogis an instance of Dog
        System.out.println("myDogis instance of Dog: " + (myDog instanceof
                Dog));
    }
}