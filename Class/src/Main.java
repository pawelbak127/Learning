import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("Choose number which refer to preferred action.");
            System.out.println("1. Add new car");
            System.out.println("2. Get info about existing cars");
            System.out.println("3. Exit");

            int response = scanner.nextInt();
            scanner.nextLine(); // Pobieranie nowej linii po nextInt()

            switch (response) {
                case 1:
                    System.out.println("Please enter your vehicle registration number: ");
                    String registrationNumber = scanner.nextLine();

                    Car newCar = new Car(registrationNumber);

                    System.out.println("Please enter the model of the car: ");
                    newCar.model = scanner.nextLine();

                    System.out.println("Please enter the color of the car: ");
                    newCar.color = scanner.nextLine();

                    boolean validPriceInput  = false;
                    while (!validPriceInput) {
                        try {
                            System.out.println("Please enter the price of the car: ");
                            newCar.price = scanner.nextDouble();
                            scanner.nextLine(); // Konsumowanie nowej linii po nextInt()
                            validPriceInput = true;
                        } catch (InputMismatchException e) {
                            System.out.println("This field can only contain NUMBERS. Please try again.");
                            scanner.nextLine(); // Konsumowanie błędnego wejścia
                        }
                    }

                    boolean validKmInput  = false;
                    while (!validKmInput) {
                        try {
                            System.out.println("Please enter the kilometers driven by the car: ");
                            newCar.setKm(scanner.nextDouble());
                            scanner.nextLine(); // Konsumowanie nowej linii po nextInt()
                            validKmInput = true;
                        } catch (InputMismatchException e) {
                            System.out.println("This field can only contain NUMBERS. Please try again.");
                            scanner.nextLine(); // Konsumowanie błędnego wejścia
                        }
                    }

                    cars.add(newCar);
                    System.out.println("Car added successfully!");
                    newCar.getVehicleInfo();
                    break;

                case 2:
                    System.out.println("Information about all cars:");
                    for (Car car : cars) {
                        car.getVehicleInfo();
                        System.out.println("----------------------------------------------------");
                    }
                    break;

                case 3:
                    continueRunning = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }

        System.out.println("Exiting the program. Goodbye!");
    }
}