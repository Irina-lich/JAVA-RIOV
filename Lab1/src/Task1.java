import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a % 10);

    }
}

class Task2 {
    public static void main(String[] args){
        int b=764;
        System.out.println(((b%10)+((b/10)%10)+((b/100)%10)));
    }
}

class Task3 {
    public static void main(String[] args){
        int n=-565;
        if (n>0)
        {n += 1;}
        else
        {n = n;}
        System.out.println(n);
    }
}

class Task4 {
    public static void main(String[] args){
        int n=0;
        if (n>0)
        {n += 1;}
        else if (n<0)
        {n -= 2;}
        else
        {n = 10;}
        System.out.println(n);
    }
}

class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите три числа");
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(numbers[0]);
        sc.close();
    }
}

class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        if (n>0 & n%2!=0)
        {System.out.println("Положительное нечетное число");}
        else if (n<0 & n%2!=0)
        {System.out.println("Отрицательное нечетное число");}
        else if (n>0 & n%2==0)
        {System.out.println("Положительное четное число");}
        else if (n<0 & n%2==0)
        {System.out.println("Отрицательное четное число");}
        else
        {System.out.println("Нулевое число");}
        sc.close();
    }
}

class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите код города");
        Scanner sc = new Scanner(System.in);
        Double cost;
        Double sum;
        int code = sc.nextInt();
        if (code == 905){
            cost = 4.15;
            sum = cost * 10;
            System.out.println("Москва. Стоимость разговора: " + sum);}
        else if (code == 194){
            cost = 1.98;
            sum = cost * 10;
            System.out.println("Ростов. Стоимость разговора: " + sum);}
        else if (code == 491){
            cost = 2.69;
            sum = cost * 10;
            System.out.println("Краснодар. Стоимость разговора: " + sum);}
        else if (code == 800){
            cost = 5.00;
            sum = cost * 10;
            System.out.println("Киров. Стоимость разговора: " + sum);}
        else {
            System.out.println("Неизвестный код города");}
        }

    }

class Task8 {
    public static void main(String[] args) {
        int myArray[] = {1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
        int max = 0;
        int sumplus = 0;
        int summinus = 0;
        int sum =0;
        int middle = 0;
        int kol =0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max)
                max = myArray[i];
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > 0){
                kol++;
                sumplus += myArray[i];}
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0 && myArray[i]%2 ==0  )
                summinus += myArray[i];
        }
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                count++;
                sum += myArray[i];
                middle = sum/count;
            }
        }
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Сумма положительных элементов массива: " + sumplus);
        System.out.println("Сумма четных отрицательных элементов массива: " + summinus);
        System.out.println("Количество положительных элементов массива: " + kol);
        System.out.println("Среднее арифметическое отрицательных элементов массива: " + middle);

    }
}

class Task9 {
    public static void main(String[] args) {
        int myArray[] = {15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};
        int n = myArray.length;
        int[] reverse;
        reverse = new int[n];
        for (int i = 0; i < n; i++) {
            reverse[i] = myArray[n - i - 1];
            System.out.print(reverse[i] + " ");
        }
    }
}

class Task10 {
    public static void main(String[] args) {
        int myArray[] = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,52};
        int nullar = 0;
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] != 0) {
                myArray[nullar++] = myArray[i];
                System.out.print(myArray[i] + " ");
            }
        }
        for (int i = nullar; i < myArray.length; i++){
            myArray[i] = 0;
            System.out.print(myArray[nullar++] + " ");
        }
    }
}