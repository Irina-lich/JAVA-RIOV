public abstract class Car {
    private String carBrand;
    private String carClass;
    private double weight;
    private Engine engine;

    public Car (String carBrand, String carClass, double weight, Engine engine){
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
    }

    abstract void start();
    abstract void stop();
    abstract void printInfo();

    public void turnRight(){
        System.out.println("Turn right");
    }

    public void turnLeft(){
        System.out.println("Turn left");
    }

    public String getCarBrand(){
        return carBrand;
    }

    public String getcarClass(){
        return carClass;
    }

    public double getWeight(){
        return weight;
    }

    public Engine getEngine(){
        return engine;
    }

}
