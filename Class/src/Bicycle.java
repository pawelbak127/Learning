public class Bicycle extends Vehicle {
    public void ringBell(){
        System.out.println("Tutaj dzwoni dzwonek :D Dryn!! Dryn!! bo to rower");
    }

    @Override
    public void run() {
        System.out.println("Bicycle is slow because it is powered by legs!!");
    }
}
