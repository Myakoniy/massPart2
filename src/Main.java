import java.util.Random;



public class Main {
    public static void main(String[] args) {


        Random random = new Random();

        int[] zarplata = new int[30];

        for (int i = 0; i < zarplata.length; i++) {
            zarplata[i] = random.nextInt(100000) + 100000;
        }

        for (int i = 0; i < zarplata.length; i++) {
            System.out.println(zarplata[i]);
        }

        //Zadanie 1
        System.out.println("Zadanie 1");

        int sum = 0;
        for (int i = 0; i < zarplata.length; i++) {
            sum = sum + zarplata[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Zadanie 2
        System.out.println("Zadanie 2");

        int maxZp = 0;
        int minZp = 200_001;

        for (int i = 0; i < zarplata.length; i++) {
            if (maxZp < zarplata[i]) {
                maxZp = zarplata[i];
            }
        }
        for (int i = 0; i < zarplata.length; i++) {
            if (minZp > zarplata[i]) {
                minZp = zarplata[i];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minZp + " Рублей. Максимальная сумма трат за день составила " + maxZp + " рублей");

        //Zadanie 3
        System.out.println("Zadanie 3");

        float middleZp = sum / 30;

        System.out.println("«Средняя сумма трат за месяц составила " + middleZp + " рублей»");


        //Zadanie 4
        System.out.println("Zadanie 4");
        
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int z = reverseFullName.length - 1; z >= 0; z--) {

                System.out.print(reverseFullName[z]);

        }


    }

}