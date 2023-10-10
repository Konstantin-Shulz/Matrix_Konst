import java.util.Arrays;
import java.util.Random;
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
                int randomNum = rn.nextInt(100) ;
                matr[i][j] = randomNum;
            }
        }
    }
}