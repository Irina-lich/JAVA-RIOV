public class Horse extends Animal{
    String horseRacing;

    public Horse(String food, String location, String horseRacing) {
        super(food,location);
        this.horseRacing = horseRacing;
    }

    @Override
    public void makeNoise() {
        System.out.println("Igo-go-go");
    }

    @Override
    public void eat() {
        System.out.println("Horse eat carrot");
    }
}
