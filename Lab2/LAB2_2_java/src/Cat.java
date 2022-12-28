public class Cat extends Animal{
    String claw;

    public Cat (String food, String location, String claw) {
        super(food, location);
        this.claw = claw;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }
}
