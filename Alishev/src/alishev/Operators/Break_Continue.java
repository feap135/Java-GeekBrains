package alishev.Operators;

/**
 * Break нужен для выхода из цикла
 * Continue нужен для пропуска false значений
 */
public class Break_Continue {
    public static void main(String[] args) {
        int i = 1; //инициализируем переменную
        while (true) {//создаем цикл
            if (i == 11) {//где тру - значение 11
                break; //останавливаем цикл на принятом тесли тру
            }
            System.out.println(i);//выводи актуальную переменную
            i++; //прибавляем к 1 к текущему значению
        }
        System.out.println("You are out of the loop"); //выводим тест если тру достигнуто (10)

        for (int v = 0; v <= 11; v++) {
            if (v % 2 == 0) { //v&2==0 означает отсутсвие остатка. Пример: 6%2= 3 (остатка нет), 7%2=3 и еще 1 осталось.
                continue; //оператор будет продолжать вывод остальных чисел с остатком до предела
            }
            System.out.println("it's an add number" + v); //консоль выводит нужные данные по условию
        }
    }
}
