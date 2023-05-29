public class Hovercraft extends Vehicle implements IsLandVehicle {
    private int numWheels;
    private int displacement;

    public Hovercraft() {}

    public Hovercraft(String name, int maxPassenger, int maxSpeed) {
        super(name, maxPassenger, maxSpeed);
        this.numWheels = 0;
        this.displacement = 3;
    }

    public void enterLand() {
        System.out.println("BLACK PERSON SPOTTED. LAND LAND LAND");
    }

    public void enterSea() {
        System.out.println("BLACK PERSON SPOTTED. GET IN THE WATER THEY CAN'T SWIM");
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

    public int getDisplacement() {
        return this.displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void launch() {
        System.out.println("BLACK PERSON SPOTTED. LAUNCH AWAY!!!");
    }
}
