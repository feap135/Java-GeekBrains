package alishev.Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class ScannerArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // ������ ��������

        int[] a = new int[5]; // ������ ������ �������

        for (int i = 0; i < a.length; i++) { // �������������� � ������� ������
            int i1 = scanner.nextInt(); // �������������� � ������� ��������
            a[i] = i1; // ������������ �������� ������ �� �������
        }
        System.out.println(Arrays.toString(a)); // ������� ���������� ������
        scanner.close(); // ��������� �������
    }
}
