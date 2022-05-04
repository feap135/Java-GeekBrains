package HomeWork4;

import java.util.Random;
import java.util.Scanner;

//Сапёр
public class MineSweeper {
    // final означает, что он не может быть переопределен в подклассах. Это полезно, когда мы хотим, чтобы исходную реализацию нельзя было переопределить.
    public static final int WIDTH = 15; // константа ширины поля
    public static final int HEIGHT = 10; // константа высоты поля
    public static final int MINES_COUNT = 20; // константа количество мин
    public static final int MINE = 1000; // константа мин
    public static final int EMPTY = 0;
    public static final int CELL_CLOSE = 0;
    public static final int CELL_OPEN = 0;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GRIN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final int CELL_FLAG = -1;

    // константы обозначаются ЗАГЛАВНЫМИ буквами
    public static void main(String[] args) {
        boolean userWin = play();
        if (userWin) {
            System.out.println("You won!");
        } else {
            System.out.println("Yoy were blown up");
        }
    }

    private static boolean move(int[][] board, int[][] moves) {
        Scanner scanner = new Scanner(System.in);
        printBoard(board, moves);
        int row, line;
        while (true) {
            System.out.print("Your turn (column, row,  for example 1A):  ");
            String move = scanner.nextLine();
            if (move.length() == 2) {
                row = move.charAt(0) - 'A'; // вытаскивает символ по индексу
                line = move.charAt(1) - '0';// вытаскивает символ по индексу

                if (row < WIDTH && row >= 0 && line < HEIGHT && line >= 0) {
                    break;
                }
            }
            System.out.println("Enter the coordinates of the playing field! >_<");
        }
        if (board[line][row] != MINE) {
            moves[line][row] = CELL_OPEN;
            return true;
        }
        return false;
    }

    public static boolean play() {
        boolean win = true;
        boolean isPassMove;
        int[][] board = generateBoard();
        int[][] moves = new int[HEIGHT][WIDTH];
        do {
            isPassMove = move(board, moves);
            win = isWin(moves);
        } while (isPassMove && !win);

        return isPassMove;
    }

    ///  HEIGHT * WIDTH - MINES_COUNT
    private static boolean isWin(int[][] moves) {
        int openCell = 0; // переменная считает сколько ячеек сейчас открыто
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (moves[i][j] == CELL_OPEN) {
                    openCell++; // плюсуем если ячейка уже открыта
                }
            }
        }
        return openCell + MINES_COUNT == HEIGHT * WIDTH; // если количество открытых ячеек и мин равно полю, то пользователь победил
    }

    public static int[][] generateBoard() {
        //---------------------------------------расставляем мины в массиве---------------------------------------------
        int[][] board = new int[HEIGHT][WIDTH]; // обозначаем величину массива
        Random random = new Random(); // рандом для обозначения мин в массиве
        int mines = MINES_COUNT; // создаем переменную для инициализации мин в массиве
        while (mines > 0) { // создаём цикл для заполнения массива минами в пустых ячейках
            int x, y; // переменные высоты и ширины
            do {
                x = random.nextInt(HEIGHT); // инициализируем рандомные переменные для высоты
                y = random.nextInt(WIDTH); // инициализируем рандомные переменные для ширины
            } while (board[x][y] == MINE); // условие для цикла do. Проверяет на наличие мин в ячейке чтобы избежать дубля инициализации мины
            board[x][y] = MINE; // уменьшаем счетчик при установке новой мины
            mines--;            // уменьшаем счетчик при установке новой мины
        }
        //-----------------------------------указываем сколько мин окружает каждую ячейку-------------------------------
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (board[i][j] == MINE) {
                    ; // если в поле уже лежит мина ,то можно переходить к следующей операции в цикле
                    continue;
                }
                int mCount = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (k < 0 || k >= HEIGHT || l < 0 || l >= WIDTH) { // исключение
                            continue;
                        }
                        if (board[k][l] == MINE) {
                            mCount++;
                        }
                    }
                }
                board[i][j] = mCount;
            }
        }
        return board; // возвращаем массив
    }

    public static void printBoard(int[][] board, int[][] moves) {
        System.out.print("  ");
        for (char i = 'A'; i < 'A' + WIDTH; i++) { // создаем цикл для обозначения ячеек буквенным алфавитом
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < HEIGHT; i++) {
            System.out.printf("%3d", i);
            for (int j = 0; j < WIDTH; j++) {
                if (moves[i][j] == CELL_CLOSE) {
                    System.out.print("[]");
                    continue;
                }
                if (moves[i][j] == CELL_FLAG) {
                    System.out.print(" P");
                    continue;
                }
                String colorCode = getColorCode(board[i][j]);
                System.out.print(colorCode);
                if (board[i][j] == EMPTY) {
                    System.out.print(" .");
                } else if (board[i][j] == MINE) {
                    System.out.print(" *");
                } else {
                    System.out.printf("%2d", board[i][j]);
                }
                System.out.print(ANSI_RESET);
            }
            System.out.println();
        }
    }

    public static String getColorCode(int i) { // кейсы для расцветки данных массива
        switch (i) {
            case EMPTY:
                return ANSI_WHITE;
            case MINE:
                return ANSI_PURPLE;
            case 1:
                return ANSI_BLUE;
            case 2:
                return ANSI_GRIN;
            case 3:
                return ANSI_RED;
            case 4:
                return ANSI_CYAN;
            default:
                return ANSI_YELLOW;
        }
    }
}
// проблема со столбцами . е
// реализовать флаг

