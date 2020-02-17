package jc01_2020.buvin.lesson08.task03;

/*
 * Создать объект своего класса Date (не java.util или java.sql), используя вложенные классы Год, Месяц, День.
 * Методы: задать дату, вывести на консоль день недели по заданной дате. День недели представить в виде перечисления (enum).
 * Рассчитать количество дней, в заданном временном промежутке.
 *
 * public Date(int day, int month, int year)
 * public DayOfWeek getDayOfWeek()
 * public int getDayOfYear()
 * public int daysBetween(Date startDate, Date endDate)
 *
 * В классе Year должна осуществляться проверка на високостность. Установить это значение для соотв. атрибута года.
 * В классе Month можно сделать метод который позволит узнать количество дней для того или иного месяца [1-12].
 * Метод можно использовать для подсчета дней в других методах.
 *
 * public int getDays(int monthNumber, boolean leapYear)
 *
 * Перечисление должно иметь конструктор с параметром, для того чтобы задать индексы дней недели [0-6]. 0 – Понедельник.
 *
 * Так же можно создать статический метод
 * public static DayOfWeek valueOf (int index)
 * Для того чтобы можно было после математических расчетов использовать данный метод для преобразования индекса дня недели
 * в соотв. элемент перечисления.
 *
 * При желании можно сделать собственную архитектуру для решения поставленной задачи. Главное продемонстрировать в решении
 * использование вложенных классов и перечисления.
 *
 */


import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {

    enum DayOfWeek {
        Понедельник(0),
        Вторник(1),
        Среда(2),
        Четверг(3),
        Пятница(4),
        Суббота(5),
        Воскресенье(6);

        private int index;

        DayOfWeek(int index) {
            this.index = index;
        }
        public static DayOfWeek valueOf (int index){
            for (DayOfWeek d:DayOfWeek.values()) {
                if (d.index==index){
                    return d;
                }
            }
            return null;
        }
    }

    public static class Date {
        int year;
        int month;
        int day;
        boolean leapYear;

        public Date(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
            leapYear = new Year().leapYear();
        }

        public class Year {
            public boolean leapYear() {
                if (year % 400 == 0) return true;
                if (year % 400 != 0 && year % 100 == 0) return false;
                else if (year % 4 == 0) return true;
                else return false;
            }
        }

        class Month {
            public int getDays(int month, boolean leapYear) {
                byte day = 0;
                if (1 <= month && month <= 12)
                    switch (month) {
                        case 1:
                            day = 31;
                            break;
                        case 2:
                            if (leapYear) day = 29;
                            else day = 28;
                            break;
                        case 3:
                            day = 31;
                            break;
                        case 4:
                            day = 30;
                            break;
                        case 5:
                            day = 31;
                            break;
                        case 6:
                            day = 30;
                            break;
                        case 7:
                            day = 31;
                            break;
                        case 8:
                            day = 31;
                            break;
                        case 9:
                            day = 30;
                            break;
                        case 10:
                            day = 31;
                            break;
                        case 11:
                            day = 30;
                            break;
                        case 12:
                            day = 31;
                            break;
                        default:
                            day = 0;
                    }
                return day;
            }
        }

        class Day {
        }

        public DayOfWeek getDayOfWeek() {
            return DayOfWeek.valueOf(day);
        }

        public int getDayOfYear() {
            if (leapYear)return 356;
            else return 355;
        }
        public String dateToString(Date date){
            return date.day+"."+date.month+"."+date.year;
        }
        public int daysBetween(Date startDate, Date endDate) {
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            java.util.Date date1 = null;
            java.util.Date date2 = null;
            try {
                date1 = format.parse(dateToString(startDate));
                date2 = format.parse(dateToString(endDate));
            } catch (Exception e) {
                e.printStackTrace();
            }
            int days =  (int)(date1.getTime() - date2.getTime()) / (24 * 60 * 60 * 1000);
            return days;
        }

    }

    public static void main(String[] args) {
        Date date = new Date(2020, 2, 17);
        Date date2 = new Date(2025, 12, 17);
        System.out.println(date.daysBetween(date,date2));;
        DayOfWeek dayOfWeek = DayOfWeek.Вторник;
        System.out.println(DayOfWeek.valueOf(1));

    }
}
