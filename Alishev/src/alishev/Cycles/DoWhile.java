package alishev.Cycles;

import java.util.Scanner;

/**
 * Данный цикл нужен для точного ввода с консоли. Берём для примера кейс с вводом пароля
 */
public class DoWhile {
    //более длинный вариант с выводом текста ошибки. Но хороший программист не дублирует код. Тут есть дубль
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //делаем импорт сканнера
        System.out.println("Enter your password:"); //выводим текст пользователю
        int password = s.nextInt(); //создаем строку ввода для пользователя
        while (password != 12345) { //создаём условие для принятия пароля, в скобках условие верного ввода пароля
            System.out.println("You entered wrong password"); //строка с ошибкой ,если значение не соответсвует
            password = s.nextInt(); //строка на новую попатку ввода
        }
        System.out.println("Password accepted");//строка подтверждающая верный ввод

//данный пример короткийц и более правильный, но он не сообщает об ошибке
        Scanner s1 = new Scanner(System.in); //делаем импорт сканнера
        int password1; // инициализируем наш пароль
        do {
            System.out.println("Entered your password"); //строка с текстом задачи для пользователя
            password1 = s1.nextInt(); //строка с вводом в консоли для пользователя
        } while (password1 != 12345);//делаем цикл на случай неверногог ввода пароля, в скобках условие для принятия пароля
        System.out.println("Password accepted"); //выводим текст если цикл завершился верным вводом парполя
    }
}
