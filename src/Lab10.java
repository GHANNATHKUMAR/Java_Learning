interface ElectriVehicle {
    void chargebattery(int amount);

    void status();
}

interface GasVehicle {
    void refuel(int litres);

    void status();
}

class Hybrid implements ElectriVehicle, GasVehicle {
    int batterylevel;
    int fuellevel;

    public Hybrid(int batterylevel, int fuellevel) {
        this.batterylevel = batterylevel;
        this.fuellevel = fuellevel;
    }

    public void chargebattery(int amount) {
        batterylevel += amount;
        System.out.println("battery charged" + batterylevel);
    }

    public void refuel(int litres) {
        litres += litres;
        System.out.println("fuel is now " + litres);
    }

    @Override
    public void status() {
        System.out.println("hybrid card status ");
        System.out.println("Battery level " + batterylevel);
        System.out.println("Fuel level " + fuellevel);
    }

    public void drive() {
        if (batterylevel > 0 || fuellevel > 0) {
            System.out.println("car can be driven");
        } else {
            System.out.println("cannot driven");
        }
    }

    public void electricstatus() {
        System.out.println("Battery level is" + batterylevel);
    }

    public void gasstatus() {
        System.out.println("fuel level is " + fuellevel);
    }
}

public class Lab10 {
    public static void main(String[] args) {
        Hybrid car = new Hybrid(50, 20);
        car.electricstatus();
        car.gasstatus();
        car.status();
        car.drive();
        car.refuel(20);
        car.chargebattery(40);
        car.status();
    }
}
