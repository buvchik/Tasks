package jc01_2020.buvin.lesson06.task2;

public class Bankomat {


    int cash20;
    int cash50;
    int cash100;


    public Bankomat(int cash20, int cash50, int cash100) {
        this.cash20 = cash20;
        this.cash50 = cash50;
        this.cash100 = cash100;
    }

    protected boolean keepMoney(int money) {
        int c20;
        int c50 = 0;
        int c100 = 0;
        if (money / 100 >= 0 && money / 100 <= cash100) {
            c100 = money / 100;
            money -= c100 * 100;
        } else if (money / 100 >= 0 && money / 100 > cash100) {
            money -= cash100 * 100;
            c100 = cash100;
        }
        if (money / 50 >= 0 && money / 50 <= cash50) {
            c50 = money / 50;
            money -= c50 * 50;
        } else if (money / 50 >= 0 && money / 50 > cash50) {
            if (money % 2 == 0 && cash50 % 2 == 0) {
                money -= cash50 * 50;
                c50 = cash50;
             } else{
                money -= (cash50-1) * 50;
                c50 = cash50-1;
            }

        }
        if (money / 20 >= 0 && money % 20 == 0 && money / 20 <= cash20) {
            c20 = money / 20;
            money -= c20 * 20;
        } else if (money / 20 >= 0 && money % 20 == 0 && money / 20 > cash20) {
            System.out.println("Нет 20");
            return false;
        } else return false;
        if (c100 != 0) System.out.println(c100 + " шт. - 100 ");
        if (c50 != 0) System.out.println(c50 + " шт. - 50");
        if (c20 != 0) System.out.println(c20 + " шт. - 20 ");
        return true;
    }

}
