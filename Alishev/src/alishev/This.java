package alishev;

/**
 * �������� ����� this � ������������ ��� ������ �� ������� ����� � ������ ������ ��� ������������ ����������.
 */
public class This {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Maxim");
        human.setAge(12);
        human.getInfo();
    }
}

class Human {
    int age;
    String name;

    public void setName(String name) { // ������� ������
        this.name = name; // ������������ ���� � �������� �� ���������
    }

    public void setAge(int age) { // ������� ������
        this.age = age; // ������������ ���� � �������� �� ���������
    }
    public String getName() { // ������� ������
        return name; // ���������� �������� ��� ������
    }


    public int getAge() { // ������� ������
        return age; // ���������� �������� ��� ������
    }

    public void getInfo() { // ������� ����� ��������� �����
        System.out.println(name + "," + age);
    }
}
