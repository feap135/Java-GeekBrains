package alishev.Arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomArrays {
    public static void main(String[] args) {
        int a1 = 2; // создаём примитивные переменные
        int a2 = 4;
        int a3 = 7;
        int[] arr = new int[10]; //создаем массив из трех ячеек

        for (int i = 0; i < arr.length; i++) { // инициализируем массив циклом for
            arr[i] = new Random().nextInt(10); // присваиваем рандомные значения методом RANDOM
        }
        System.out.println(Arrays.toString(arr)); // выводим в консоль
    }
}