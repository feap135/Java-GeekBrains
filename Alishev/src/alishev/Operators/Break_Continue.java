package alishev.Operators;

/**
 * Break ����� ��� ������ �� �����
 * Continue ����� ��� �������� false ��������
 */
public class Break_Continue {
    public static void main(String[] args) {
        int i = 1; //�������������� ����������
        while (true) {//������� ����
            if (i == 11) {//��� ��� - �������� 11
                break; //������������� ���� �� �������� ����� ���
            }
            System.out.println(i);//������ ���������� ����������
            i++; //���������� � 1 � �������� ��������
        }
        System.out.println("You are out of the loop"); //������� ���� ���� ��� ���������� (10)

        for (int v = 0; v <= 11; v++) {
            if (v % 2 == 0) { //v&2==0 �������� ��������� �������. ������: 6%2= 3 (������� ���), 7%2=3 � ��� 1 ��������.
                continue; //�������� ����� ���������� ����� ��������� ����� � �������� �� �������
            }
            System.out.println("it's an add number" + v); //������� ������� ������ ������ �� �������
        }
    }
}
