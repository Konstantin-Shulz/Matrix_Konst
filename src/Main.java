import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //хочу чтобы пользователь задал размеры матрицы
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размеры матрицы");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] matr = new int[n][m];
        printMatr(matr);
        randomize(matr);
        printMatr(matr);
    }

    public static void printMatr(int[][] matr)
    {
        //todo: сделать красивый форматированный вывод
        for (int i = 0; i < matr.length; i++) {
            System.out.println(Arrays.toString(matr[i]));
        }
    }

    public static void randomize(int[][] matr)
    {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = 19;
            }
        }
    }
}