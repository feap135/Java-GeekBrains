package alishev;

import java.util.Scanner; //������ ��������

public class ScannerInfo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //������ ������ ������ ��������
        System.out.println("inter text:"); //������� ������ � �������� �� �������
        String str = s.nextLine(); //������ ����� ��� ����� ������ ������������� � �������, ��������� ����� ����� ���� ������
        System.out.println("You entered " + "'" + str + "'");//������� ����� ���������� ��� ������������� � �������
    }
}
