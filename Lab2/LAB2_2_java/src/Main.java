public class Main {
    public static void main(String[] args) {
        Veterinar veterinar = new Veterinar();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("bones", "Aviary", "sniff id good");
        animals[1] = new Cat("fish", "house", "claws are sharp");
        animals[2] = new Horse("carrot", "field", "horse racing is fast");

        for (Animal animal : animals) {
            veterinar.treatAnimal(animal);
        }

        for (int i = 0; i<animals.length; i++)  {
            veterinar.treatAnimal(animals[i]);
        }
    }
}