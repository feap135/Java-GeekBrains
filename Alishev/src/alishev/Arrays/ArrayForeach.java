package alishev.Arrays;

public class ArrayForeach {
    public static void main(String[] args) {
        //����������� ��������� ��������� � ������ �������
        String[] myString = new String[5]; //������� ������ ������ String �� ���� �����
        myString[0] = "Hello"; //����������� ������ ������ �������� ��������
        myString[1] = "My name is Max";
        myString[2] = "I am from Russia";
        myString[3] = "I learn Java now";
        myString[4] = "I love coding";
        for (int i = 0; i < myString.length; i++) { //������� �� ������� ������ � ������ ����� for
            System.out.println(myString[i]); //������� ������ ������� � ����
        }
        System.out.println(); //������ � �������� ��� ���������� ����� for b � foreach

        //���� foreach:
        int[] myNumbers = {1, 2, 3, 4, 5}; //������� ������ � ������� ������������������ �����������
        int mySum = 0; //������� ���������� � ������� ����� ����� ����������
        for (int z : myNumbers) { //���� foreach. ���� : ��� �������� ��� �� ����� ���������� � z ��� �������� �������
            mySum = mySum + z; //���������� ����� ���� ����� ������� � ������ ������������� ����
            System.out.println(mySum); //������� ���������
        }

    }
}
