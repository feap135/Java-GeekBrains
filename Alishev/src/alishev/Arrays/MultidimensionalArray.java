package alishev.Arrays;

/**
 * ��������� �������
 */
public class MultidimensionalArray {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4}, //������� ������������� ������
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(matrix[0][1]); //������� �� ���������� � ������. ��� ��������� � ���� [0], ����� �� ���������� � �������!
        System.out.println(matrix[2][3]);

        //--------------------------------������ ��������� ����---------------------------------------------------------
        String[][] myString = new String[3][3]; //������� �������� ����� �� 4-�� ����� � 4-�� ��������
        myString[1][1] = "First"; //������ �������� ������ � ������ �����������
        System.out.println(myString[1][1]); //������� � ������� ����������������� ������ � �������

        //---------------------------����� ������� �� ����� � ������� ���� ������---------------------------------------
        int[][] matrix1 = {
                {21, 22, 23, 24}, //������� ������������� ������
                {35, 36, 37, 38},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        for (int i = 0; i < matrix1.length; i++) { // i=0-����� ������ ������ , i < matrix1.!length! - ��������� ������������� �����
            for (int j = 0; j < matrix1[i].length; j++) { // j=0-����� ������� �������,  i < matrix1[i].!length! - ��������� ������������� �����
                System.out.print(matrix1[i][j] + " "); // ������� �������� �� ����� ������� � ������. ���� ���������� ������ ����
            }
            System.out.println(); //����� ������ ������� ����� ��������� �� ����� ������
        }

    }
}

