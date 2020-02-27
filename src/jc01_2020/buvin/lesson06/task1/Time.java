package jc01_2020.buvin.lesson06.task1;

public class Time {
    byte sec;
    byte min;
    byte hour;
    long allInSecond = -1;


    Time(long sec) {
        if (sec < 0 || sec >= 86399) {
            System.out.println("Значения выходят за рамки дозволенного)");
        } else {
            this.allInSecond = sec;
        }
    }

    Time(byte sec, byte min, byte hour) {
        if (sec < 0 || sec >= 60 || min < 0 || min >= 60 || hour < 0 || hour >= 24) {
            System.out.println("Значения выходят за рамки дозволенного)");
        } else {
            this.sec = sec;
            this.min = min;
            this.hour = hour;
            allInSecond(sec, min, hour);
        }
    }

    private long allInSecond(long sec, byte min, byte hour) {
        allInSecond = hour * 60 * 60 + min * 60 + sec;
        return allInSecond;
    }

    public byte compareTo(Time newTime) {
        if (allInSecond == -1 || newTime.allInSecond == -1) {
            // System.out.println("Error: Incorrect data entered (:");
            return -2;
        } else if (newTime.allInSecond > allInSecond) {
            return 1;
        } else if (newTime.allInSecond < allInSecond) {
            return -1;
        } else return 0;
    }

    public void print(int i) {
        switch (i) {
            case -1:
                System.out.println("Первое время меньше");
                break;
            case 0:
                System.out.println("Время равно");
                break;
            case 1:
                System.out.println("Первое время больше");
                break;
            default:
                System.out.println("Error: Incorrect data entered (:");
                break;
        }
    }
}
