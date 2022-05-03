package alishev;

import java.util.Scanner; //импорт сканнера

public class ScannerInfo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //делаем импорт класса сканнера
        System.out.println("inter text:"); //выводим строку с текстоми на консоль
        String str = s.nextLine(); //создаём метод для ввода текста пользователем с консоли, программа будет ждать ввод текста
        System.out.println("You entered " + "'" + str + "'");//выводим текст написанный уже пользователем в консоль
    }
}
