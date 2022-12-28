public class Phone {
    String model;
    String number;
    double weight;

    public Phone(String model, String number, double weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.model = model;
        this.number = number;
    }

    public Phone(){

    }

    @Override
    public String toString() {
        return model + " " + number + " " + weight;
    }

    public void receiveCall(String name){
        String prefix = "Call";
        System.out.println(prefix + " " + name);
    }

    public String getNumber(){
        return this.number;
    }

    public void receiveCall(String name, String number) {
        System.out.println("Call" + " " + name + " " + number);
    }

    public void sendMessage (String... number){
        for (String i : number){
            System.out.println(i);
        }
    }


}