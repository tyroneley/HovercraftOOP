public class PoliceCar extends Vehicle implements IsEmergency, IsLandVehicle {
    private int numWheels;

    public PoliceCar() {}

    public PoliceCar(String name, int maxPassenger, int maxSpeed) {
        super(name, maxPassenger, maxSpeed);
        this.numWheels = 4;
    }

    public void Shoot() {
        System.out.println("BLACK PERSON SPOTTED. PEW PEW PEW");
    }

    public void soundSiren() {
        System.out.println("BLACK PERSON SPOTTED. HE'S GETTING AWAY");
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
