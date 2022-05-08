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
        System.out.println("Max Integer: " + Integer.MAX_VALUE);
        System.out.println("Min Integer: " + Integer.MIN_VALUE);
        System.out.println("Max Double: " + Double.MAX_VALUE);
        System.out.println("Min Double: " + Double.MIN_VALUE);
        System.out.println("Max Float: " + Float.MAX_VALUE);
        System.out.println("Min Float: " + Float.MIN_VALUE);
        System.out.println("Max Float: " + Float.MAX_VALUE);
        System.out.println("Min Float: " + Float.MIN_VALUE);

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
