package ru.gb.karpeshin.homeWork2;

public class homeWorkApp2 {
    public static void main(String[] args) {
        within10and20(1, 5);
        String e = checkNumber(-1);
        System.out.println(e);
        boolean f = checkPositiveOrNegative(10);  //№3
        System.out.println(f);

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
}
