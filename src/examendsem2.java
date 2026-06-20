class animal {
    void Animal() {
        System.out.println("animal");
    }
}

class dog extends animal {
    void Dog() {
        System.out.println("Dog");
    }
}

class babydog extends dog {
    void Babydog() {
        System.out.println("babydog");
    }
}

public class examendsem2 {
    public static void main(String[] args) {
        babydog obj = new babydog();
        obj.Animal();
        obj.Dog();
        obj.Animal();
        dog obj1 = new babydog();
        obj1.Dog();
    }
}
