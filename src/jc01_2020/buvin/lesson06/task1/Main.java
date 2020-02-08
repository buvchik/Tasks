package jc01_2020.buvin.lesson06.task1;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time((byte)10,(byte)15,(byte)15);
        Time time2 = new Time((byte)20,(byte)5,(byte)5);
        Time time3 = new Time(-1);

        System.out.println(time1.compareTo(time2));
        System.out.println(time2.compareTo(time3));

    }
}
