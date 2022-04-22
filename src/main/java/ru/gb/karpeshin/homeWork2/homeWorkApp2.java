package ru.gb.karpeshin.homeWork2;

public class homeWorkApp2 {
    public static void main(String[] args) {
        within10and20(1, 5);

    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    public static boolean within10and20(int x1, int x2) {
        int c = x1 + x2;
        return (10 <= c && c <= 20);

    }

}
