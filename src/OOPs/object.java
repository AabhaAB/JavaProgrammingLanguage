package OOPs;

public class object {
	private String make;
    private String model;
    private int year;

    // Constructor
    public object(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Creating objects of the Car class
        object car1 = new object("Toyota", "Camry", 2020);
        object car2 = new object("Honda", "Civic", 2018);

        // Accessing object's methods
        car1.displayInfo();
        System.out.println();
        car2.displayInfo();
    }
}
