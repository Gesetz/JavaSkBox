import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
//        Container container = new Container();
//        container.count += 7843;

//        Scanner in = new Scanner(System.in);
//        System.out.println("Imput a number: ");

//        String imput = in.nextLine();
//        sumDigits(Integer.valueOf(imput));

//        4.2
//        напишите код, который распечатает в консоль минимальные отрицательные
//        и максимальные положительные значения всех типов чисел.
//        System.out.println("Max Short: " + Short.MAX_VALUE);
//        System.out.println("Max Short: " + Short.MIN_VALUE);
//        System.out.println("Max Integer: " + Integer.MAX_VALUE);
//        System.out.println("Min Integer: " + Integer.MIN_VALUE);
//        System.out.println("Max Long: " + Long.MAX_VALUE);
//        System.out.println("Max Long: " + Long.MIN_VALUE);
//        System.out.println("Max Double: " + Double.MAX_VALUE);
//        System.out.println("Min Double: " + Double.MIN_VALUE);
//        System.out.println("Max Float: " + Float.MAX_VALUE);
//        System.out.println("Min Float: " + Float.MIN_VALUE);
//        System.out.println("Max Float: " + Float.MAX_VALUE);
//        System.out.println("Min Float: " + Float.MIN_VALUE);
//
//
//        int min = 5;
//        int max = 7;
//
//        max -= min;
//
//        // Rand
//        System.out.println("Rand " + Math.random());
//        System.out.println("Rand number: " + ((int) (Math.random() * ++max) + min));

//        4.3
//        Что нужно сделать
//        Вы доставляете гуманитарную помощь в ящиках одинакового размера.
//        У вас есть грузовики и контейнеры.
//        В каждый грузовик помещается максимум 12 контейнеров.
//        В каждый контейнер — не более 27 ящиков.
//        Ящики, контейнеры и грузовики пронумерованы.

        final int TRUCK_CAPACITY = 5;
        final int CONTAINER_CAPACITY = 35;

        int boxNumber = 1;
        int containerNumber = 1;
        int boxesAmount;

        System.out.println("How many boxes need to deliver?");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()){
            boxesAmount = scanner.nextInt();
//        Количество контейнеров
            int containerAmount = (int) Math.ceil( (double) boxesAmount / CONTAINER_CAPACITY );
//        Количество грузовиков
            int trucksAmount = (int) Math.ceil( (double) containerAmount / TRUCK_CAPACITY );


            for (int i = 1; i <= trucksAmount; i++){
                System.out.println("Truck " + i + ":");

                for (int j = 0; j < TRUCK_CAPACITY && containerNumber <= containerAmount; j++) {
                    System.out.println("\tContainer "+ containerNumber +":");

                    for (int k = 1; k <= CONTAINER_CAPACITY && boxNumber <= boxesAmount; k++) {
                        System.out.println("\t\tBox " + boxNumber);

                        boxNumber++;
                    }

                    containerNumber++;
                }
            }



            System.out.println("\n\nRequirement:\nTruck: " + trucksAmount + "\n\tContainers: " + containerAmount);

        } else {
            System.out.println("Wrong argument. It's not a number.");
        }

//        Подсчитать, сколько надо грузовиков, контейнеров и коробок.

//        Напишите программу, которая распределит ящики по контейнерам и грузовикам в зависимости от их количества.
//        Программа должна выводить необходимое для этого число грузовиков и контейнеров.
//
//        Принцип работы программы
//        Указываем число ящиков — получаем результат в виде строк:
//    Грузовик 1:
//        Контейнер 1:
//                  Ящик 1
//                  Ящик 2
//                  Ящик 3
//                  …
//        Контейнер 2
//                  Ящик 28
//                  Ящик 29
//
//        Необходимо:
//        грузовиков — 1 шт.
//            контейнеров — 10 шт.
//
//        Рекомендации:
//        Для добавления отступа в строке вы можете использовать символ табуляции «\t».
//        Обратите внимание на арифметическую операцию «Остаток от деления»
//
//        System.out.println(45 % 10); // вывод будет 5.





    }

    //2. Реализуйте статический метод sumDigits, чтобы он считал сумму цифр в числе
    // и возвращал сумму в результате своей работы.
    // Для реализации метода можете использовать методы:
    // класса Integer: toString(), parseInt();
    // класса String: charAt(), length(), valueOf().
    // 3. Выведите в консоль суммы цифр чисел: 12345, 10, 5059191.
    public static Integer sumDigits(Integer number)
    {
        int sumDigits = 0;
//        System.out.println(number.toString());
//        System.out.println(number.toString().length());

        for (int i = 0; i < number.toString().length(); i++) {
//          int intFromImput = parseInt(number.charAt(i));
            char numberToAdd = number.toString().charAt(i);
            sumDigits = sumDigits + Integer.parseInt(String.valueOf(numberToAdd));
        }

        System.out.println("Summary: " + sumDigits);

//        System.out.println(number);
        //@TODO: write code here
        return 0;
    }
}
