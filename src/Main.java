import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //хочу чтобы пользователь задал размеры матрицы
        int[][] matr = createMatrixOfZeroes();

        //printMatr(matr);
        randomize(matr);
        printMatr(matr);
        //printLineSums(matr);
        printMaxElemMatrix(matr);
        printRowMax(matr);

    }

    private static int[][] createMatrixOfZeroes() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размеры матрицы");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] matr = new int[n][m];
        return matr;
    }

    public static void printMatr(int[][] matr)
    {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.printf(" %3d", matr[i][j]);
            }
            System.out.println();
        }
    }

    public static void randomize(int[][] matr)
    {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                Random rn = new Random();
                int randomNum = rn.nextInt(1000) ;
                matr[i][j] = randomNum;
            }
        }
    }

    //подсчитать и вывести сумму элементов в каждой строке матрицы
    public static void printLineSums(int[][] matr)
    {
        for (int i = 0; i < matr.length; i++) {
            int s = 0;
            for (int j = 0; j < matr[i].length; j++) {
                s += matr[i][j];
            }
            System.out.println("сумма элементов строки "+i+" равна "+s);
        }
    }

    public static void printMaxElemMatrix(int[][] matr) {
    int max = 0;
    for (int i = 0; i < matr.length; i++) {
        for (int j = 0; j < matr[i].length; j++) {
            if (matr[i][j] > max) {
                max = matr[i][j];
            }
        }
    }
    System.out.println("Максимум равен "+max);
    }
    public static void printRowMax(int[][] matr) {
        int max = 0;
        int row = 0;

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (matr[i][j] > max) {
                    max = matr[i][j];

                }row = j; System.out.println("столбец = " +row);
            }
        }

    }
}