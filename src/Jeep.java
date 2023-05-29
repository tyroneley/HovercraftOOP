public class Jeep extends Vehicle implements IsLandVehicle {
    private int numWheels;

    public Jeep() {}

    public Jeep(String name, int maxPassenger, int maxSpeed) {
        super(name, maxPassenger, maxSpeed);
        this.numWheels = 4;
    }

    public void soundHorn() {
        System.out.println("BLACK PERSON SPOTTED. SOUND THE HORN");
    }

    public int getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void drive() {
        System.out.println("BLACK PERSON SPOTTED. DRIVE AWAY!!!");
    }
}
