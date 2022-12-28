public class Lorry extends Car{
    private int loadCapacity;

    public Lorry(String carBrand, String carClass, double weight, Engine engine, int loadCapacity){
        super(carBrand, carClass, weight, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void start() {
        System.out.println("Lorry start");
    }

    @Override
    void stop() {
        System.out.println("Lorry stop");
    }

    @Override
    void printInfo() {
        System.out.println("Brand: " + this.getCarBrand() + "\n" + "Class: " + this.getcarClass() + "\n" + "Weight: " + this.getWeight() + "\n" + "Load capacity " + this.loadCapacity + "\n" + "Engine power: " + this.getEngine().getPower()
                + "\n" + "Engine efficiency: " + this.getEngine().getEfficiency());
    }
}
