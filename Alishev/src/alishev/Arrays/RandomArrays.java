package alishev.Arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomArrays {
    public static void main(String[] args) {
        int a1 = 2; // ������ ����������� ����������
        int a2 = 4;
        int a3 = 7;
        int[] arr = new int[10]; //������� ������ �� ���� �����

        for (int i = 0; i < arr.length; i++) { // �������������� ������ ������ for
            arr[i] = new Random().nextInt(10); // ����������� ��������� �������� ������� RANDOM
        }
        System.out.println(Arrays.toString(arr)); // ������� � �������
    }
}