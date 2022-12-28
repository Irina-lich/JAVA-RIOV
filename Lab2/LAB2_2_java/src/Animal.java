public class Animal {
    String food;
    String location;

    public Animal (String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise (){
        System.out.println("Some animal is making noise");
    }

    public void eat (){
        System.out.println("Some animal is eating");
    }

    public void sleep (){
        System.out.println("Some animal is sleeping");
    }

}
