package alishev.Arrays;

import java.util.Arrays;

/**
 * ����� deepToString() ������ Arrays ���������� ��������� ������������� ��������� ����������� ���������� ������� ��������. � ������� �� ��������. toString(), ���� ������ �������� ������ ������� � �������� ���������, ��������� ������������� �������� �� ���������� � ��� �����.
 */
public class DeppToString {
    private static java.util.Arrays Arrays;

    //-------------------------------------------------DeepToString-----------------------------------------------------
    public static void main(String[] args) {
        int[][] arr = new int[3][3]; // ������ �������� �������
        arr[0][0] = 1; // �������������� ������
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        String s = Arrays.deepToString(arr); // ������� ���� ������ � �������
        System.out.println(s); // ������� �� �������  ������ s
    }
}
