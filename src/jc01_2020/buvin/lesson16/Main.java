package jc01_2020.buvin.lesson16;

/*
*
* Написать игру крестики нолики, где два игрока-потока играют друг с другом
* Ходят по очереди.
* Вывести в консоль результат партии и итоговое игровое поле
*
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static Table table;
    public static void main(String[] args) {
        Player player1 = new Player(1);
        Player player2 = new Player(-1);

        table = new Table(3);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.execute(player1);
        service.execute(player2);

    }

}
