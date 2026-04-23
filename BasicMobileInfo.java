import java.util.Scanner;
// Interface (Abstraction + Multiple Inheritance)
interface Features {
    void camera();
    void battery();
}
// Abstract Class (Abstraction)
abstract class Mobile {

    // Encapsulation (private variables)
    private String model;
    private int price;
    private String releaseDate;

    // Constructor
    Mobile(String model, int price, String releaseDate) {
        this.model = model;
        this.price = price;
        this.releaseDate = releaseDate;
    }
    // Getter Methods
    public String getModel() {
        return model;
    }
    public int getPrice() {
        return price;
    }
    public String getReleaseDate() {
        return releaseDate;
    }

    abstract void display();
}
// Samsung Child Class (Inheritance + Polymorphism)
class Samsung extends Mobile implements Features {

     // Constructor
    Samsung(String model, int price, String releaseDate) {
        super(model, price, releaseDate);
    }
    // Method Overriding
    void display() {
        System.out.println("\nSamsung Mobile");
        System.out.println("Model: " + getModel());
        System.out.println("Price: " + getPrice() + " BDT");
        System.out.println("Release Date: " + getReleaseDate());
    }
    // Interface Methods
    public void camera() {
        System.out.println("Camera: 50MP");
    }
    public void battery() {
        System.out.println("Battery: 5000mAh");
    }
}
// iPhone Child Class
class iPhone extends Mobile implements Features {
     // Constructor
    iPhone(String model, int price, String releaseDate) {
        super(model, price, releaseDate);
    }
    void display() {
        System.out.println("\niPhone Mobile");
        System.out.println("Model: " + getModel());
        System.out.println("Price: " + getPrice() + " BDT");
        System.out.println("Release Date: " + getReleaseDate());
    }
    public void camera() {
        System.out.println("Camera: 48MP");
    }
    public void battery() {
        System.out.println("Battery: 4500mAh");
    }
}
// Vivo Child Class
class Vivo extends Mobile implements Features {

    Vivo(String model, int price, String releaseDate) {
        super(model, price, releaseDate);
    }
    void display() {
        System.out.println("\nVivo Mobile");
        System.out.println("Model: " + getModel());
        System.out.println("Price: " + getPrice() + " BDT");
        System.out.println("Release Date: " + getReleaseDate());
    }
    public void camera() {
        System.out.println("Camera: 64MP");
    }
    public void battery() {
        System.out.println("Battery: 5000mAh");
    }
}
// Oppo Child Class
class Oppo extends Mobile implements Features {
     // Constructor
    Oppo(String model, int price, String releaseDate) {
        super(model, price, releaseDate);
    }
    void display() {
        System.out.println("\nOppo Mobile");
        System.out.println("Model: " + getModel()); 
        System.out.println("Price: " + getPrice() + " BDT");
        System.out.println("Release Date: " + getReleaseDate());
    }
    public void camera() {
        System.out.println("Camera: 64MP");
    }
    public void battery() {
        System.out.println("Battery: 4500mAh");
    }
}
// Tecno Child Class
class Tecno extends Mobile implements Features {
    // Constructor
    Tecno(String model, int price, String releaseDate) {
        super(model, price, releaseDate);
    }
    void display() {
        System.out.println("\nTecno Mobile");
        System.out.println("Model: " + getModel());
        System.out.println("Price: " + getPrice() + " BDT");
        System.out.println("Release Date: " + getReleaseDate());
    }
    public void camera() {
        System.out.println("Camera: 50MP");
    }
    public void battery() {
        System.out.println("Battery: 6000mAh");
    }
}
// Main Class
public class BasicMobileInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = -1; // initial value

        while (choice != 0) {

            System.out.println("\nMobile Menu\n");
            System.out.println("1. Samsung");
            System.out.println("2. iPhone");
            System.out.println("3. Vivo");
            System.out.println("4. Oppo");
            System.out.println("5. Tecno");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                Samsung s = new Samsung("Samsung S23", 224999, "17 February 2023");
                s.display();
                s.camera();
                s.battery();
                System.out.println("-_-_-_-_-_-_-_-_-_-_-");
            } 
            else if (choice == 2) {
                iPhone i = new iPhone("iPhone 14", 109999, "16 September 2022");
                i.display();
                i.camera();
                i.battery();
                System.out.println("-_-_-_-_-_-_-_-_-_-_-");
            } 
            else if (choice == 3) {
                Vivo v = new Vivo("Vivo V29", 56999, "5 August 2023");
                v.display();
                v.camera();
                v.battery();
                System.out.println("-_-_-_-_-_-_-_-_-_-_-");
            } 
            else if (choice == 4) {
                Oppo o = new Oppo("Oppo Reno 10", 49000, "10 May 2023");
                o.display();
                o.camera();
                o.battery();
                System.out.println("-_-_-_-_-_-_-_-_-_-_-");
            } 
            else if (choice == 5) {
                Tecno t = new Tecno("Tecno Spark 10", 13499, "12 March 2023");
                t.display();
                t.camera();
                t.battery();
                System.out.println("-_-_-_-_-_-_-_-_-_-_-");
            } 
            else if (choice == 0) {
                System.out.println("Program Ended.");
            } 
            else {
                System.out.println("Invalid Choice!");
            }
        }
        sc.close();
    }
}