package homeWork3;
//import java.util.Arrays;
//import java.util.Random;
public class HomeWork3 {
//    public static void main(String[] args) {
//        /**
//         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//         */
//        int[] task1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        for (int i = 0; i < task1.length; i++) {
//            if (task1[i] == 1) {
//                System.out.println("0");
//            } else if (task1[i] == 0) {
//                System.out.println("1");
//            }
//        }
//        /**
//         * 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
//         */
//        int[] task2 = new int[100];
//        for (int i = 0; i < 100; i++) {
//            task2[i] = i + 1;
//        }
//        for (int i = 0; i < task2.length; i++) {
//            System.out.println("[" + task2[i] + "]");
//        }
//        /**
//         * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//         */
//        int[] task3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        for (int i = 0; i < 12; i++) {
//            System.out.println(task3[i]);
//            if (task3[i] < 6) {
//                System.out.println(task3[i] * 2);
//            }
//        }
//    }
//
//    /**
//     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
//     */
//    int[][] task4 = new int[3][3];
//       for(
//    int i = 0;
//    i<task4.length;i++)
//
//    {
//        for (int j = 0, x = task4[i].length - 1; j < task4[i].length; j++, x--) {
//            if (i == j || i == x) task4[i][j] = 1;
//            else task4[i][j] = 0;
//            System.out.print(task4[i][j] + " ");
//        }
//        System.out.print("\n");
//    }
//
//    /**
//     * 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
//     */
//    int len = 2;
//    int initialValue = 3;
//    int[] task5 = new int[len];
//      for(
//    int i = 0;
//    i<len;i++)
//
//    {
//        task5[i] = initialValue;
//        System.out.print("[" + i + "]" + task5[i] + " ");
//    }
//
//    /**
//     * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
//     */
//    int[] task6 = new int[10];
//    int max = task6[0];
//    int min = task6[0];
//        for(
//    int i = 0;
//    i !=task6.length;i++)
//
//    {
//        task6[i] = new Random().nextInt(-2147483648, 2147483647);
//        if (task6[i] > max) {
//            max = task6[i];
//        }
//        if (task6[i] < min) {
//            min = task6[i];
//        }
//    }
//        System.out.println(min +" "+max);
}

