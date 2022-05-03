package alishev.Operators;

/**
 * данный цикл идет с проверкой условия по ступеням
 */
public class If {
    public static void main(String[] args) {
        int i = 0;
        if (i > 0) {
            System.out.println("in the positive range");
        } else if (i < 0) {
            System.out.println("in the negative range");
        } else {
            System.out.println("not determined");
        }
    }
}
