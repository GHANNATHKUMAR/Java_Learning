
class vehicle {
    protected String model;
    protected int year;
    vehicle() {
    }
    vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayinfo1() {
        System.out.println("hello model is  " + model + year);
    }
}

class car extends vehicle {
    private String color;

    car(String model, int year, String color) {
        super(model, year);
        this.color = color;
        System.out.println("hello done ");
    }

    car() {
        super();
    }

    void displayCarinfo() {
        System.out.println("car color " + color);
        displayinfo1(); // no call for super.displyinfo() because displayinfo is onlyin parent not in  child
    }
}

public class examendsem4 {
    public static void main(String[] args) {
        car obj = new car("toyoto", 2022, "red");
        obj.displayCarinfo();
    }
}
