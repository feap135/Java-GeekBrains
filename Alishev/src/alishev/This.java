package alishev;

/**
 *  лючевое слово this Ч используетс€ дл€ ссылки на текущий класс с учетом метода или конструктора экземпл€ра.
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

    public void setName(String name) { // создаем сеттер
        this.name = name; // приравниваем поле к значению из параметра
    }

    public void setAge(int age) { // создаем сеттер
        this.age = age; // приравниваем поле к значению из параметра
    }
    public String getName() { // создаем геттер
        return name; // возвращаем значение при вызове
    }


    public int getAge() { // создаем геттер
        return age; // возвращаем значение при вызове
    }

    public void getInfo() { // создаем метод вывод€щий текст
        System.out.println(name + "," + age);
    }
}
