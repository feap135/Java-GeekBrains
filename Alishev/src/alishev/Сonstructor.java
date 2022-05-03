package alishev;
/**
 * ������������ � Java ������������ ����� ����������� ���� ����, ������� �� �����, ��������������� ��� ������������� ����� ������� ��� ��� ��������. �� ���������� ������, ����� ��������� ����� ��������� ������.
 */

import java.sql.SQLOutput;

public class �onstructor {
    public static void main(String[] args) {
        Man man = new Man(12);
    }
}

class Man { // ������ �����
    private int age; // ������ ����������
    private String name; // ������ ����������

    public Man() {// - �����������. ��� ������ ��������� � ������ �����
        System.out.println("Constructor one "); // ������� ����� ���� ��� ���������� � �������
    }

    public Man(String name) {// - �����������. ��� ������ ��������� � ������ �����
        System.out.println("Constructor two "); // ������� ����� ���� � ������� ���� �����
        this.name = name; // ����������� ����������� ����������
    }

    public Man(String name, int age) {// - �����������. ��� ������ ��������� � ������ �����
        System.out.println("Constructor tree "); // ������� ����� ���� � ������� ���� ����� � �����
        this.name = name; // ����������� ����������� ����������
        this.age = age; // ����������� ����������� ����������
    }
    public Man(int age) {// - �����������. ��� ������ ��������� � ������ �����
        System.out.println("Constructor four "); // ������� ����� ���� � ������� ���� �����
        this.age = age; // ����������� ����������� ����������
    }
}