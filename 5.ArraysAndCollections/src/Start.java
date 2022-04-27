import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

//        Задание №1 Что нужно сделать
//        1. Создайте массив из мнемонической фразы:
//        Каждый охотник желает знать, где сидит фазан.
//        2. Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
//
//        Пример
//        Первоначальный массив: [“a”, “b”, “c”, “d”].
//        Массив с элементами в обратном порядке: [“d”, “c”, “b”, “a”].
        String[] array1 = {"Каждый", "охотник", "желает", "знать,", "где", "сидит", "фазан."};

//        System.out.println("Размер массива:" + array1.length);

        // Создаю массив одного размера
        String array2[] = new String[array1.length];

        // В обратном порядке перегоняю элементы одного массива в другой.

        for (int i = array1.length - 1; i >= 0; i--){
           array2[array1.length - 1 - i] = array1[i];
        }

        // Проверяю, что получилось
//        System.out.println("array1: ");
        for (String word: array1) {
//            System.out.printf(word + " ");
        }

//        System.out.println("array2: ");
        for (String word: array2) {
//            System.out.printf(word + " ");
        }

//        Задание №2
//        Что нужно сделать
//      Вынесите в константы условия задания:
//	•	количество пациентов,
        final int patients = 30;

//	•	минимальная и максимальная температура пациентов,
        final float minTemp = 32;
        final float maxTemp = 40;

//	•	минимальная и максимальная температура диапазона здоровых пациентов.
        final float healthyMin = (float) 36.2;
        final float healthyMax = (float) 36.9;

//	•	Создайте массив типа float с температурами 30 пациентов (от 32 до 40 градусов).
        float[] temps = new float[30];
        final DecimalFormat df = new DecimalFormat("0.0");

        for (int i = 0; i < patients; i++){
            double random = minTemp + Math.random() * (maxTemp - minTemp);
//            System.out.println("Случайное число " + (i+1)+ ": " + df.format(random));
            temps[i] = (float) random;
        }

//	•	Напишите код, который выводит среднюю температуру по больнице и количество здоровых пациентов (с температурой от 36,2 до 36,9), а также температуры всех пациентов.
//        Пример
//        Температуры пациентов: 36.7 38.9 34.7
//        Средняя температура: 36.76
//        Количество здоровых: 1
        float allTemps = 0;
        int healthyPeople = 0;
        System.out.printf("Температура пациентов: ");
        for (float temp: temps){
            allTemps = allTemps + temp;
            System.out.printf(df.format(temp) + " ");
            if (temp > healthyMin && temp < healthyMax){
                healthyPeople++;
            }
        }
        System.out.println("");
        System.out.println("Средняя температура: " + df.format(allTemps/patients));

        System.out.println("Количество здоровых: " + healthyPeople);

//        Создайте с помощью циклов двумерный массив строк. При его распечатке в консоли должен выводиться крестик из X:
//         x     x
//          x   x
//           x x
//            x
//           x x
//          x   x
//         x     x


        String[][] simbolX = new String[7][7];

        for (int i = 0; i <= 6; i++){
            for (int j = 0; j <=6; j++){
//                Отладка System.out.println("i = " + i + " j = " + j + "||" + " Второй символ:" + ((j - (simbolX.length-1))*-1));
                if (j == i || i == (j - (simbolX.length-1))*-1){
                   simbolX[i][j] = "X";
                } else {
                   simbolX[i][j] = " ";
                }
            }
        }
        for (String[] arrayI: simbolX){
            System.out.println("");
            for (String line: arrayI) {
                System.out.printf(line);
            }
        }
        System.out.println("");
//Разработайте список дел, который управляется командами в консоли. Команды: LIST, ADD, EDIT, DELETE. 
//Принцип работы команд:
//	•	LIST — выводит дела с их порядковыми номерами;
//	•	ADD — добавляет дело в конец списка или дело на определённое место, сдвигая остальные дела вперёд, если указать номер; 
//	•	EDIT — заменяет дело с указанным номером;
//	•	DELETE — удаляет.
//        Примеры команд
//	•	LIST
//	•	ADD Какое-то дело
//	•	ADD 4 Какое-то дело на четвёртом месте
//	•	EDIT 3 Новое название дела
//	•	DELETE 7 
//Команды вводятся одной строкой пользователем в консоль.

        ArrayList<String> todoList = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String input = in.nextLine();

        System.out.println("Вы ввели: " + input);

        // Распарсить выражение, найти команду
        String command = new String();
        String text = new String();
        int positionInList;

        // Выполнить действие
        switch (command) {
            case ("LIST"):
//                @ something
                break;
            case ("ADD"):
                break;
            case ("EDIT"):
                break;
            default:
                break;
        }




    }
}
