package alishev.Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class ScannerArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // импорт сканнера

        int[] a = new int[5]; // задаем длинну массива

        for (int i = 0; i < a.length; i++) { // инициализируем в консоли €чейки
            int i1 = scanner.nextInt(); // инициализируем с помощью сканнера
            a[i] = i1; // приравниваеи значение €чейки из консоли
        }
        System.out.println(Arrays.toString(a)); // выводим полученный массив
        scanner.close(); // закрываем сканнер
    }
}
