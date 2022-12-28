public class Dog extends Animal {
    String sniff;

    public Dog (String food, String location, String sniff) {
        super(food, location);
        this.sniff = sniff;
    }

    @Override
    public void makeNoise() {
        System.out.println("Gav-av-av");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bone");
    }
}
