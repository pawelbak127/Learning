public class Vehicle {

    public String color ;
    public String registerNumber ;
    public String model ;
    public Double price ;

    public void getVehicleInfo() {
        System.out.println("Model: " + model);
        System.out.println("Cena: " + String.format("%,.2f", price));
        System.out.println("Kolor: " + color);
    }
}
