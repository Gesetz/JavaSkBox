import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args)
    {

////        Задание №1
////        Что нужно сделать
////        Распечатайте коды всех букв английского алфавита и сами буквы.
//
//        String alphabet = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//
//        for (int i = 0; i < alphabet.length(); i++){
//            char letter = alphabet.charAt(i);
//            if (letter != ' '){
//                System.out.println("Символ " + alphabet.charAt(i) + " равен коду: " + (int) letter);
//            } else {
//                System.out.println("Оп! это пробел!");
//            }
//        }

//        Задание №2
//        Что нужно сделать
//        Напишите код в проекте StringExperiments, который считает сумму заработка всех друзей (Васи, Пети и Маши).
//        Используйте методы indexOf(), lastIndexOf(), substring() и trim().
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        int aboutVasyaFinish = text.indexOf(',');
        int aboutMashaStart = text.lastIndexOf(',');

        int vasyaSallary = Integer.parseInt(text.substring(text.indexOf('5'), text.indexOf('5')+5).trim());
//        System.out.println(vasyaSallary);

        int petyaSallary = Integer.parseInt(text.substring(text.indexOf('7'), text.indexOf('7')+5).trim());
//        System.out.println(petyaSallary);

        String aboutMashaSallary = text.substring(text.indexOf('3',aboutMashaStart-1));
        int mashaSallary = Integer.parseInt(aboutMashaSallary.substring(0, aboutMashaSallary.indexOf(' ')));
//        System.out.println(mashaSallary);


        System.out.println("Cумма зарплат: " + (mashaSallary + petyaSallary + vasyaSallary));

        System.out.println(text);

//        Задание №1
//        Что нужно сделать
//        Внесите изменения в проект StringExperiments, чтобы суммы заработка каждого человека извлекались из текста
//        регулярным выражением, а в конце программы рассчитывалась и распечатывалась общая сумма заработка людей.
        int allSalary = 0;
//        String[] salaries = text.split("[0-9]");


        List<String> allMatches = new ArrayList<String>();
        Matcher m = Pattern.compile("\\d+").matcher(text);

        while (m.find()) {
            allMatches.add(m.group());
        }
        String[] salaries = allMatches.toArray(new String[0]);

        for (String word : salaries) {
            allSalary += Integer.parseInt(word);
//            System.out.println(word);
        }

        System.out.println("Значение allSalary: " + allSalary);


//        Задание №2
//        Что нужно сделать
//        Возьмите английский текст (не менее 100 слов) и напишите программу, которая будет разбивать его на слова и
//        печатать слова в консоли. Знаки препинания не являются частью слова.

        String engText = "The policy had not been publicly announced, but the reaction was swift. When I checked " +
                "airline ticket websites, I saw dates for flights in the near future turn gray one after another. " +
                "In less than an hour, all available slots in the entire month of March were fully booked. Panicking," +
                " I turned to a travel agent I knew. The next day, she called and offered me an option to fly on" +
                " March 8 to Shanghai with Hong Kong Airlines. Do you want it or not? Make a decision now, or it'll" +
                " go away, the agent pressured me.";

        List<String> allWords = new ArrayList<>();

        Matcher m2 = Pattern.compile("[a-zA-Z]+").matcher(engText);

        while (m2.find()) {
            allWords.add(m2.group());
        }

        String[] engWords = allWords.toArray(new String[0]);

        for (String word : engWords) {
            System.out.println(word);
        }


//        Задание №3
//        Что нужно сделать
//        Измените программу, написанную в уроке №4: вводимая строка с фамилией,
//        именем и отчеством должна разбиваться с использованием регулярного выражения.

//        Задание №4
//        Что нужно сделать
//        Реализуйте удаление лишних символов при вводе номера телефона в консоли и проверку соответствия
//        номера формату мобильных номеров России. Если введённую строку нельзя привести к формату мобильного номера
//        — выводите сообщение о неверном вводе. Телефон может быть введен не только в формате 79091234567, но и с
//        лишними символами.
//        Пример ввода номеров и результата вывода программы
//
//        Ввод пользователя в консоль	Вывод программы в консоль	Примечание
//        +7 909 123-45-67	79091234567	Символов 11 в номере, код страны 7 — номер верный.
//        +7 (909) 1234567	79091234567	Символов 11 в номере, код страны 7 — номер верный.
//        8-905-1234567	79051234567	Символов 11 в номере, первый символ 8 (код выхода на мобильный номер) заменяем на код страны 7 — номер верный.
//        9-453-1234567	Неверный формат номера	Символов 11 в номере, первый символ после очистки 9, это не 7 и не 8 — формат номера неверный.
//        8-905-123	Неверный формат номера	Символов 7 в номере — номер неверный.
//        905-1234567	79051234567	Количество символов 10 после очистки — значит, приводим к формату номера с 7.
//        8-905-12345672342	Неверный формат номера	Символов в номере больше чем 11 — номер неверный.

//        Цель задания
//        Закрепить использование методов String совместно с ранее пройденными темами.
//        Что нужно сделать
//        Пользователь вводит строку, в некоторой части которой содержится конфиденциальная информация. Ваша задача изменить строку и скрыть информацию в < >.
//        Напишите метод
//        String searchAndReplaceDiamonds(String text, String placeholder)
//        который будет заменять в переданной строке String text всё содержимое скобок <> (англ. diamonds) и сами скобки на переданную строку в String placeholder.

//        Пример работы
//        String safe = searchAndReplaceDiamonds(«Номер кредитной карты <4008 1234 5678> 8912», «***»);
//        В safe должна содержаться строка «Номер кредитной карты *** 8912».

//        Дополнительное задание*
//        Цель задания
//        Закрепить навыки работы с регулярными выражениями.
//        Что нужно сделать
//        Изменить метод 
//        String searchAndReplaceDiamonds(String text, String placeholder),
//        который будет заменять в переданной строке String text всё содержимое скобок <> и сами скобки на переданную строку в String placeholder, используя регулярные выражения.







    }
}