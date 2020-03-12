package jc01_2020.buvin.test01;

/*
 *
 * Написать программу для умножения произвольных матриц. Вывести в консоль матрицу А, матрицу В и результирующую матрицу С.
 *
 * Теория:
 * 1) количество строк матрицы А должно быть равно количеству столбцов матрицы В
 * 2) Результатом умножения матрицы Am×n на матрицу Bn×k будет матрица Cm×k такая, что элемент матрицы C,
 * стоящий в i-той строке и j-том столбце (Сij), равен сумме произведений элементов i-той строки матрицы A на
 * соответствующие элементы j-того столбца матрицы B.
 *
 *
 *    A
 * 1  2  3
 * 4	 5	6
 * 7	 8	9
 *
 *    B
 * 1  2  3  4
 * 4  3  2  1
 * 1  2  3  4
 *
 * С = A * B
 * 12  14  16  18
 * 30  35  40  45
 * 48  56  64  72
 *
 */

import java.util.Random;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class MatrixMultiplication {

    static int[][] a;
    static int[][] b;
    static int[][] c;
    static int rowsA;
    static int columnsA;
    static int rowsB;
    static int columnsB;

    static private void print(int[][] matr, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
	static private void printC( int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(c[i][j]);
				System.out.print(" ");
			}
		}
	}
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Кол-во строк матрицы А
		rowsA = scanner.nextInt();
//		Кол-во столбцов матрицы А
		columnsA = scanner.nextInt();
//		Кол-во строк матрицы B
		rowsB = scanner.nextInt();
//		Кол-во столбцов матрицы B
		columnsB = scanner.nextInt();

		a = new int[rowsA][columnsA];
		b = new int[rowsB][columnsB];
		c = new int[rowsA][columnsB];
		if (columnsA != rowsB) {
			System.out.println("Умножать нельзя");

		} else {
			// Заполнить массивы А и В с помощью scanner.nextInt(). Тестовые данные заполняются построчно для каждого массива

			for (int i = 0; i < rowsA; i++) {
				for (int j = 0; j < columnsA; j++) {
					a[i][j] = scanner.nextInt();

				}
			}
			for (int i = 0; i < rowsB; i++) {
				for (int j = 0; j < columnsB; j++) {
					b[i][j] = scanner.nextInt();
				}
			}
			// Вывести в консоль матрицу А
			print(a, rowsA, columnsA);
			System.out.println("-----------");
			// Вывести в консоль матрицу В
			print(b, rowsB, columnsB);
			System.out.println("-----------");
			// Перемножить матрицы
			int[][] resultat = new int[rowsA][columnsB];
			for (int i = 0; i < rowsA; i++) {
				for (int j = 0; j < columnsB; j++) {
					for (int s = 0; s < rowsA; s++) {
							int ax =a[i][s];
							int ax1 =c[i][j];
							int ax2 =b[s][j];

						c[i][j] += a[i][s] * b[s][j];
					}
				}
			}
			// Вывести результирующую матрицу по одному значению через пробел (порядок вывода - построчно)
			printC(rowsA, columnsB);
		}
	}
}
