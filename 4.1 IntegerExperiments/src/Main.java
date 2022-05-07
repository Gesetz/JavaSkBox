import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        Scanner in = new Scanner(System.in);
        System.out.println("Imput a number: ");

        String imput = in.nextLine();
        sumDigits(Integer.valueOf(imput));

    }

    //2. Реализуйте статический метод sumDigits, чтобы он считал сумму цифр в числе
    // и возвращал сумму в результате своей работы.
    // Для реализации метода можете использовать методы:
    // класса Integer: toString(), parseInt();
    // класса String: charAt(), length(), valueOf().
    // 3. Выведите в консоль суммы цифр чисел: 12345, 10, 5059191.
    public static Integer sumDigits(Integer number)
    {
        System.out.println(number.toString());
        System.out.println(number.toString().length());


        System.out.println(number);
        //@TODO: write code here
        return 0;
    }
}
