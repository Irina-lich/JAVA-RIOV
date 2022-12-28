public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String carBrand, String carClass, double weight, Engine engine, int maxSpeed){
        super(carBrand, carClass, weight, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    void start() {
        System.out.println("Sport car start");
    }

    @Override
    void stop() {
        System.out.println("Sport car stop");
    }

    @Override
    void printInfo() {
        System.out.println("Class: " + this.getClass() + "\n" +
                "Brand: " + this.getCarBrand() + "\n" +
                "Weight: " + this.getWeight() + "\n" +
                "Max speed: " + this.maxSpeed + "\n" +
                "Engine power: " + this.getEngine().getPower() + "\n"
                + "Engine efficiency: " + this.getEngine().getEfficiency());
    }
}
