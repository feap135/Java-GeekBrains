package alishev.Operators;

import java.util.Scanner;

/**
 * нужен когда нужно проверить много условий
 */
public class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = s.nextInt(); //обозначаем то что будем вводить цифры, можно использовать текс /String age = s.next.Line();/
        switch (age){ //указываем на что будет ссылаться наш switch
            case 1,2,3,4,5: //задаем значения кейсу
                System.out.println("You are child"); //вывод ответа если он есть в кейсе
            break; // выход из кейса
            case 6,7,8,9,10,11,12,13,14,15,16,17,18:
                System.out.println("You are schoolboy");
                break;
            case 19,20,21,22,23:
                System.out.println("You are student");
                break;
            case 24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65:
                System.out.println("You are grown man");
                break;
            case 66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100:
                System.out.println("You are retiree");
                break;
            default: //если значения нет в кейсе, то выведем ошибку
                System.out.println("Unknown age");
        }
    }
}
