package alishev.Arrays;

public class ArrayForeach {
    public static void main(String[] args) {
        //присваиваем буквенные выражения в ячейки массива
        String[] myString = new String[5]; //создали массив класса String из пяти ячеек
        myString[0] = "Hello"; //присваиваем каждой ячейке тестовые значения
        myString[1] = "My name is Max";
        myString[2] = "I am from Russia";
        myString[3] = "I learn Java now";
        myString[4] = "I love coding";
        for (int i = 0; i < myString.length; i++) { //выводим на консоль массив с помощь цикла for
            System.out.println(myString[i]); //выводим массив начиная с нуля
        }
        System.out.println(); //строка с пустотой для разделения дикла for b и foreach

        //цикл foreach:
        int[] myNumbers = {1, 2, 3, 4, 5}; //создаем массив с заранее задекларированными переменными
        int mySum = 0; //создаем переменную к которой потом будем прибавлять
        for (int z : myNumbers) { //цикл foreach. Знак : тут означает что бы будем поставлять к z все значения массива
            mySum = mySum + z; //прибавляем сумму всех чисел начиная с нашего обозначенного нуля
            System.out.println(mySum); //выводим результат
        }

    }
}
