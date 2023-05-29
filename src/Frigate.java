public class Frigate extends Vehicle implements IsSeaVessel {
    private int displacement;

    public Frigate() {}

    public Frigate(String name, int maxPassenger, int maxSpeed) {
        super(name, maxPassenger, maxSpeed);
        this.displacement = 3;
    }

    public void fireGun() {
        System.out.println("BLACK PERSON SPOTTED. FIRE!!!!!");
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
