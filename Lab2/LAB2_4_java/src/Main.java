public class Main {

    public static void main(String[] args) {
        Engine sportEngine = new Engine(750, 1000);
        Engine standardEngine = new Engine(200, 300);

        Car lorry = new Lorry("Volvo ", "C ", 7700, standardEngine, 240);
        Car car = new SportCar("Porshe", "B", 2300, sportEngine, 320);

        lorry.start();
        lorry.stop();
        lorry.printInfo();

        System.out.println();

        car.start();
        car.stop();
        car.printInfo();
    }
}

