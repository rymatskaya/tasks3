// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner in = new Scanner(System.in);
        System.out.printf("Выберите номер задания от 1 до 4: ");
        int task = in.nextInt();
        switch (task) {
            case 1:
                /*
                * 1. Дан порядковый номер месяца. Вывести на консоль пору года, к которой относится месяц.
                * */
                System.out.println("Задание 1: ");
                System.out.println("Дан порядковый номер месяца. Вывести на консоль пору года," +
                                     " к которой относится месяц: ");
                System.out.printf("Введите номер месяца: ");
                int month = in.nextInt();
                switch (month) {
                    case 12,1,2:
                        System.out.println("Зима!");
                        break;
                    case 3,4,5:
                        System.out.println("Весна!");
                        break;
                    case 6,7,8:
                        System.out.println("Лето!");
                        break;
                    case 9,10,11:
                        System.out.println("Осень!");
                        break;
                    default:
                        System.out.println("Нет подходящей поры года для такого номера месяца!");
                }

                break;
            case 2:
                System.out.println("Задание 2: ");
                System.out.println("Дано целое число. Определить, является ли последняя цифра" +
                        " этого числа – цифрой 3" );
                System.out.printf("Введите число: ");
                int ch = in.nextInt();
                if (ch % 10 == 3)   {
                    System.out.println("Число "+ ch + " заканчивается на 3");
                }  else   {
                    System.out.println("Число "+ ch +  "заканчивается на другое число");
                }
                break;
            case 3:
                System.out.println("Задание 3: ");
                System.out.println(" Имеется целое число, вводимое пользователем с консоли. " +
                        " Это число - сумма денег в рублях. " +
                        "-Вывести это число, добавив к нему слово \"рубль\" в правильном падеже" +
                        " (\"рубль\", \"рублей\", \"рубля\")");
                System.out.printf("Введите число: ");
                int rub = in.nextInt();
                if (rub < 0)
                {
                   System.out.printf("Неверное значение!");

                }
                String curr = " рубл";
                int rest = rub % 100;
                if (rest > 10 && rest < 20)
                    curr += "ей";
                else
                {
                    rest %= 10;
                    if (rest == 1)
                        curr += "ь";
                    else if (rest > 1 && rest < 5)
                        curr += "я";
                    else
                        curr += "ей";
                }
                System.out.printf(rub+curr);
                break;
            case 4:
                System.out.println("Задание 4: ");
                System.out.println("Написать программу, которая считывает год, введённый пользователем," +
                        " и определяет, является ли этот год високосным.");
                System.out.printf("Введите год: ");
                int year = in.nextInt();
                if (year < 0 || year > 2023)
                {
                    System.out.printf("Неверное значение!");
                }
                else
                {
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                        System.out.println("Високосный год");
                    else
                        System.out.println("Невисокосный год");
                }
                break;
            default:
                System.out.println("Не было такого задания");
        }



        }
    }
