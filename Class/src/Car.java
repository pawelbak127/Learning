public class Car extends Vehicle {

    public String registrationNumber;

    Car(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }
    private Double km ;

    public void setKm(Double km){
        this.km = km;
    }


    @Override
    public void getVehicleInfo(){
        System.out.println("Numer rejestracyjny: "+ registrationNumber);
        super.getVehicleInfo();
        System.out.println("Przebieg: "+ km);


    }
}
