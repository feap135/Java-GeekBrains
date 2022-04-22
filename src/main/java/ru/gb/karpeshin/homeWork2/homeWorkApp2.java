package ru.gb.karpeshin.homeWork2;

public class homeWorkApp2 {
    public static void main(String[] args) {
        within10and20(1, 5);
        String e = checkNumber(-1);
        System.out.println(e);
        boolean f = checkPositiveOrNegative(10);  //№3
        System.out.println(f);
        printWordNTimes("word", 3);
        boolean y = checkLeapYears(512);
        System.out.println(y);

    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    public static boolean within10and20(int x1, int x2) {
        int c = x1 + x2;
        return (10 <= c && c <= 20);
    }

    /**
     * 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
    public static String checkNumber(int e) {
        if (e >= 0)
            return "Положительное число";
        else
            return "Отрицательное число";
    }

    /**
     * 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    public static boolean checkPositiveOrNegative(int f) { //№3
        return (f < 0);
    }

    /**
     * 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    public static void printWordNTimes(String word, int h) { //№4
        for (int i = 0; i < h; i++) {
            System.out.println(word);
        }
    }

    /**
     * 5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static boolean checkLeapYears(int y) { //№5
        return ((y > 0) && (y % 4 == 0) && (y % 400 == 0) || (y % 100 != 0));
    }
}
