package alishev.Cycles;

import java.util.Scanner;

/**
 * ������ ���� ����� ��� ������� ����� � �������. ���� ��� ������� ���� � ������ ������
 */
public class DoWhile {
    //����� ������� ������� � ������� ������ ������. �� ������� ����������� �� ��������� ���. ��� ���� �����
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //������ ������ ��������
        System.out.println("Enter your password:"); //������� ����� ������������
        int password = s.nextInt(); //������� ������ ����� ��� ������������
        while (password != 12345) { //������ ������� ��� �������� ������, � ������� ������� ������� ����� ������
            System.out.println("You entered wrong password"); //������ � ������� ,���� �������� �� ������������
            password = s.nextInt(); //������ �� ����� ������� �����
        }
        System.out.println("Password accepted");//������ �������������� ������ ����

//������ ������ ��������� � ����� ����������, �� �� �� �������� �� ������
        Scanner s1 = new Scanner(System.in); //������ ������ ��������
        int password1; // �������������� ��� ������
        do {
            System.out.println("Entered your password"); //������ � ������� ������ ��� ������������
            password1 = s1.nextInt(); //������ � ������ � ������� ��� ������������
        } while (password1 != 12345);//������ ���� �� ������ ���������� ����� ������, � ������� ������� ��� �������� ������
        System.out.println("Password accepted"); //������� ����� ���� ���� ���������� ������ ������ �������
    }
}
