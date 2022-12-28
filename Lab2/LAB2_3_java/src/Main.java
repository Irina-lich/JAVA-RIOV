public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("iphone", "+795456239", 0.5);
        Phone phone2 = new Phone("iphone", "+795456239", 1);
        Phone phone3 = new Phone("huawei", "+795456239", 0.3);

        System.out.println(phone1.toString() +" \n"+ phone2 +" \n"+ phone3 );

        phone1.receiveCall("Ilya");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Ilya", phone2.number);

        phone1.sendMessage("+7995214896");
        phone1.sendMessage("+7995214896","+785412359");
    }


}