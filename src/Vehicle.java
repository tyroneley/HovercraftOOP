public class Vehicle {
    private String name;
    private int maxPassenger;
    private int maxSpeed;

    public Vehicle() {}

    public Vehicle(String name, int maxPassenger, int maxSpeed) {
        this.name = name;
        this.maxPassenger = maxPassenger;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPassenger() {
        return this.maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
