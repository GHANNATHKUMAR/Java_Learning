public class DAY23 {
    int modelYear;
    String modelName;

    // Constructor with one parameter
    public DAY23(String modelName) {
        // Call the two-parameter constructor
        this(2020, modelName);
    }

    // Constructor with two parameters
    public DAY23(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public void printInfo() {
        System.out.println(modelYear + " " + modelName);
    }

    public static void main(String[] args) {
        DAY23 car1 = new DAY23("Corvette");
        DAY23 car2 = new DAY23(1969, "Mustang");

        car1.printInfo();
        car2.printInfo();
        // 2020 Corvette
        // 1969 Mustang
    }
}
