import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //хочу чтобы пользователь задал размеры матрицы
        int[][] matr = createMatrixOfZeroes();
        int column = 0;
        //printMatr(matr);
        randomize(matr);
        printMatr(matr);
        //printLineSums(matr);
        printMaxElemMatrix(matr);
        //вывести столбец, содержащий максимальный элемент матрицы
        printСolumnMax(matr);
        //вывеcти строки без максимума и минимума
        printMatrixRowsNoMinMax(matr);

    }

    private static int[][] createMatrixOfZeroes() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размеры матрицы");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] matr = new int[n][m];
        return matr;
    }

    public static void printMatr(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.printf(" %4d", matr[i][j]);
            }
            System.out.println();
        }
    }

    public static void randomize(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                Random rn = new Random();
                int randomNum = rn.nextInt(100);
                matr[i][j] = randomNum;
            }
        }
    }

    //подсчитать и вывести сумму элементов в каждой строке матрицы
    public static void printLineSums(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            int s = 0;
            for (int j = 0; j < matr[i].length; j++) {
                s += matr[i][j];
            }
            System.out.println("сумма элементов строки " + i + " равна " + s);
        }
    }

    public static void printMaxElemMatrix(int[][] matr) {
        int max = findMaxElem(matr);
        System.out.printf("Максимум = " + max + ". ");
    }

    public static int findMaxElem(int[][] matr)
    {
        int max = 0;
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (matr[i][j] > max) {
                    max = matr[i][j];
                }
            }
        }
        return max;
    }

    public static int printСolumnMax(int[][] matr) {
        int max = 0;
        int column = 0;
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (matr[i][j] > max) {
                    max = matr[i][j];
                    column = j + 1;
                }
            }
        }
        System.out.println("Столбец c максимумом №" + column + ", сам столбец ниже:");

        /*for (int i = 0; i < (matr.length); i++) {
            int j = column;
            System.out.printf(" %3d", matr[i][j - 1]);
            System.out.println();
        }*/
        int[][] m = sliceColumnFromMatrix(matr,column-1);
        printMatr(m);
        return column;
    }

    public static int[][] sliceColumnFromMatrix(int[][] matr, int col)
    {
        int[][] column =new int[matr.length][1];
        for (int i = 0; i < matr.length; i++) {
            column[i][0] = matr[i][col];
        }
        return column;
    }

    public static int printMatrixRowsNoMinMax(int[][] matr) {
        int max = 0;
        int min = 999;
        int rowmax = 0;
        int rowmin = 0;
        //поиск строки максимума
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (matr[i][j] > max) {
                    max = matr[i][j];
                    rowmax = i ;
                }
            }
        }
        //поиск строки минимума
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (matr[i][j] < min) {
                    min = matr[i][j];
                    rowmin = i;
                }
            }
        }
        System.out.println("Строка c максимумом №" + rowmax + " = " +max+", её не выводим");
        System.out.println("Строка c минимумом №" + rowmin + " = " +min+", её не выводим");

        for (int i = 0; i < (matr.length); i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (!((i == rowmax) || (i == rowmin)))
                    System.out.printf(" %3d", matr[i][j]);
            }System.out.println();
        }
        return rowmax;

    }
}