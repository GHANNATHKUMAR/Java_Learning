// Base class Phone
class Phone {
    // Method in the base class
    public void makeCall() {
        System.out.println("Making a call from a basic phone.");
    }

    // Another method in the base class
    public void sendMessage() {
        System.out.println("Sending a text message from a basic phone.");
    }
}

// Derived class Smartphone extending Phone
class Smartphone extends Phone {
    // Overriding makeCall() method
    @Override
    public void makeCall() {
        System.out.println("Making a video call from a smartphone.");
    }

    // Overriding sendMessage() method
    @Override
    public void sendMessage() {
        System.out.println("Sending a WhatsApp message from a smartphone.");
    }

    // New method specific to Smartphone
    public void browseInternet() {
        System.out.println("Browsing the internet on a smartphone.");
    }
}

public class Lab9 {
    public static void main(String[] args) {
        // Demonstrating Runtime Polymorphism
        Phone phone = new Smartphone();  // Phone reference, but Smartphone object
        phone.makeCall();  // Calls the overridden method in Smartphone
        phone.sendMessage();  // Calls the overridden method in Smartphone

        // To call browseInternet, need to cast to Smartphone
        Smartphone smartphone = (Smartphone) phone;  // Casting the reference
        smartphone.browseInternet();  // Calls the method in Smartphone
        Smartphone phone1 = new Smartphone();
        phone1.browseInternet();
        phone1.makeCall();
    }
}
