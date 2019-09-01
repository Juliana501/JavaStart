import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        int exampleNumber = scanner.nextInt();
        switch (exampleNumber) {
            case 4:
                exampleFour();
                break;
            case 5:
                exampleFive();
                break;
            case 6:
                exampleSix();
                break;
            case 7:
                exampleSeven();
                break;
            case 8:
                exampleEight();
                break;
            case 9:
                exampleNine();
                break;
            case 10:
                exampleTen();
                break;
            default:
                System.out.println("Некорректный номер задачи!");
        }
    }
// Задача №4: Отработка поразрядных операций
// Ввести с консоли число в бинарном формате.
// Перевести его в десятичный формат, записать в переменную int и вывести на экран.

    public static void exampleFour() throws IOException {
        //public static void main(String[] args) throws Exception{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            try {
                int a = Integer.parseInt(input);
                int result = 0;
                int exponent = 0;
                int currentSymbol;
                while (a > 0) {
                    currentSymbol = a % 10;
                    if ((currentSymbol != 0 ) & (currentSymbol != 1)) {
                        throw new NumberFormatException();
                    }
                    result += currentSymbol * Math.pow(2, exponent);
                    exponent++;
                    a = a / 10;
                }
                System.out.println(result);
            } catch (NumberFormatException e) {
                System.out.println("Введи число в бинарном формате");
            }
        }

// Задача №5: Таблица умножения
// Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа.
// Использовать циклы запрещено.
    public static void exampleFive() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        Integer a = Integer.parseInt(number);
        //if ((a >= 0) & (a <=10)) {
            System.out.println(a * 1);
            System.out.println(a * 2);
            System.out.println(a * 3);
            System.out.println(a * 4);
            System.out.println(a * 5);
            System.out.println(a * 6);
            System.out.println(a * 7);
            System.out.println(a * 8);
            System.out.println(a * 9);
            System.out.println(a * 10);


        }
/* Задача №6: Отработка арифметических операций
   Написать программу, которая будет выполнять следующие действия:
   1. Ввод трех чисел с клавиатуры x, y, z
   2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
   3. Деление среднего арифметического на 2 без остатка
   4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно" */


    public static void exampleSix() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int a = (x + y + z) / 3;
        System.out.println(a);
        if (a / 2 > 3) System.out.println("Программа выполнена корректно");
    }


/* Задача №7: Условие вывода данных
   Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
   В программе должны присутствовать константы X, Y, Z.
   Программа должна сравнивать введенное значение с клавиатуры со значением констант
   и вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
   Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!" */

    public static void exampleSeven() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        final int X = 1;
        final int Y = 2;
        final int Z = 3;

        if (number == X || number == Y || number == Z) {
            System.out.println("Данное значение имеется в константах");}
        else {
            System.out.println("Такой константы нет!");}
    }


// Задача №8: Цикличный вывод данных на экран
// Необходимо с помощью цикла вывести на экран числа от 1 до 50.

    public static void exampleEight() throws IOException {

        for (int i = 1; i < 51; i++) {
            System.out.println(i);
        }
    }

    /* Задание №9: Ввод/вывод данных для массива
       Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
       где каждый элемент массива умножается на 2.
       Размер массива задается пользователем. */

    public static void exampleNine() throws IOException {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Размер массива: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            System.out.println("Элементы массива:");
            for (int i = 0; i < size; i++) array[i] = scanner.nextInt();
            System.out.println("Результат:");
            for (int i = 0; i < size; i++) System.out.print(array[i] * 2 + "; ");
        }

/* Задание №10: Ввод/вывод данных для матрицы
   Произведите ввод данных с клавиатуры в матрицу,
   а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
   Размерность матрицы задается пользователем. */

    public static void exampleTen() throws IOException {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Количество строк: ");
            int m = scanner.nextInt();
            System.out.print("Количество столбцов: ");
            int n = scanner.nextInt();
            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                System.out.println("Строка " + (i + 1) + ": ");
                for (int j = 0; j < n; j++) matrix[i][j] = scanner.nextInt();
            }
            System.out.println("Итоговая матрица: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) System.out.print(matrix[i][j] + "\t");
                System.out.println();
            }
            System.out.println("Результат:");
            for (int i = 0; i < n; i++) System.out.print(matrix[0][i] * 3 + "\t");
        }
    }








