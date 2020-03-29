package jc01_2020.buvin.lesson16;

import static jc01_2020.buvin.lesson16.Main.table;

public class Player implements Runnable {
   int playerid;
    public Player(int id) {
        this.playerid=id;
    }

    @Override
    public void run() {
        synchronized (table) {
            while (table.findFree(playerid)) {
                try {
                    table.notifyAll();
                    table.print();
                    table.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
