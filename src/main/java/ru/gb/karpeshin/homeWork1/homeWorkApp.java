package ru.gb.karpeshin.homeWork1;

/**
 * Task 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод
 * main().
 */
public class homeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
    }

    /**
     * Task 2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три
     * слова: Orange, Banana, Apple.
     */
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /**
     * 3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и
     * инициализируйте их любыми значениями, которыми захотите. Далее метод должен
     * просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль
     * сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
     */

    public static void checkSumSign() {
        int a = 88;
        int b = 77;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /**
     * 4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте
     * ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен
     * вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100
     * включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
     */
    public static void printColor() {
        int value = 11;
        if (value <= 0)

        System.out.println("red");
        if (value > 0 && 100 >= value)
        System.out.println("yellow");
        if (value > 101)
        System.out.println("green");
    }
}

