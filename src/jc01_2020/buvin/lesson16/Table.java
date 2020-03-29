package jc01_2020.buvin.lesson16;

import java.util.Random;

public class Table {
    private int size;
    public int[][] table;
    boolean stop = false;

    public Table(int size) {
        this.size = size;
        table = new int[size][size];
    }

    public boolean isFree() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (table[i][j] == 0 && !stop) return true;
            }
        }
        return false;
    }

    public boolean findFree(int pl) {
        Random r = new Random();
        if (isFree()) {
            int i = 1000;
            synchronized (table) {
                int x, y;
                while (i-- > 0) {
                    x = r.nextInt(size);
                    y = r.nextInt(size);
                    if (table[x][y] == 0) {
                        table[x][y] = pl;
                        isWinner(x, y, pl);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (table[i][j] == 0) System.out.print("*");
                else if (table[i][j] == -1) System.out.print("o");
                else if (table[i][j] == 1) System.out.print("x");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void isWinner(int x, int y, int playerId) {
        //горизонталь
        int count1 = size - 1;
        for (int i = 0; i < size; i++) {
            if (table[i][y] == table[x][y] && x != i) {
                count1--;
            }
        }
        int count2 = size - 1;
        for (int i = 0; i < size; i++) {
            if (table[x][i] == table[x][y] && y != i) {
                count2--;
            }
        }
        int count3 = size - 1;
        for (int i = 0; i < size; i++) {
            if (table[i][i] == table[x][y] && y != i && x != i) {
                count3--;
            }
        }
        int count4 = size - 1;
        for (int i = 0; i < size; i++) {
            if (table[size - i - 1][i] == table[x][y] && y != i && (size - i - 1) != i) {
                count4--;
            }
        }

        if (count1 == 0||count2==0||count3==0||count4==0) {
            if (playerId == 1)
                System.out.println("Выиграл: Первый");
            else if (playerId == -1) System.out.println("Выиграл: Второй");

            stop = true;
//            Thread.interrupted();
        }
    }
}
