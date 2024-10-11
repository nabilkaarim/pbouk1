public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil ("Toyota", 2022, 4);
        Motor motor = new Motor("Honda", 2023, "Sport");
        Handphone handphone = new Handphone ("iPhone", 999.99, "iOS");
        System.out.println("Car Information:");
        mobil.displayInfo();
        System.out.println();
        System.out.println("Motorcycle Information:");
        motor.displayInfo();
        System.out.println();
        System.out.println("Smartphone Information:");
        handphone.showDetails();
    }
}