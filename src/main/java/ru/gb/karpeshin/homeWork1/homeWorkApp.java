package ru.gb.karpeshin.homeWork1;

/**
 * Task 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод
 * main().
 */
public class homeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
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
        }
        else  {
            System.out.println("Сумма отрицательная");
        }
    }
}

