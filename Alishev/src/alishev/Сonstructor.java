package alishev;
/**
 * Конструкторы в Java представляют собой специальный блок кода, похожий на метод, предназначенный для инициализации полей объекта при его создании. Он вызывается всегда, когда создается новый экземпляр класса.
 */

import java.sql.SQLOutput;

public class Сonstructor {
    public static void main(String[] args) {
        Man man = new Man(12);
    }
}

class Man { // создаём класс
    private int age; // создаём переменную
    private String name; // создаём переменную

    public Man() {// - конструктор. Имя должно совпадать с именем класс
        System.out.println("Constructor one "); // выводим текст если нет параметров у объекта
    }

    public Man(String name) {// - конструктор. Имя должно совпадать с именем класс
        System.out.println("Constructor two "); // выводим текст если у объекта есть текст
        this.name = name; // присваиваем конструтору переменную
    }

    public Man(String name, int age) {// - конструктор. Имя должно совпадать с именем класс
        System.out.println("Constructor tree "); // выводим текст если у объекта есть текст и цифры
        this.name = name; // присваиваем конструтору переменную
        this.age = age; // присваиваем конструтору переменную
    }
    public Man(int age) {// - конструктор. Имя должно совпадать с именем класс
        System.out.println("Constructor four "); // выводим текст если у объекта есть цифры
        this.age = age; // присваиваем конструтору переменную
    }
}