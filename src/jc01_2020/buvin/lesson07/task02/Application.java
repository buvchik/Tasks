package jc01_2020.buvin.lesson07.task02;

/*
 *
 * Реализовать валидацию хода шахматной фигуры
 *
 * Даны шахматные фигуры, которые должны являться наследниками класса Figure. В конструктор передается начальное положение
 * фигуры в виде char e, int 2 (char g, int 8 и т.д.). Реализовать для каждой фигуры метод moveTo(char c, int i), который
 * вернет логическое значение доступен ли такой ход для этой фигуры. Постарайтесь максимально использовать принципы ООП.
 * Не добавляйте новые поля в классах-фигурах
 * Ссылку на созданный объект фигуры в методе main хранить в переменной типа Figure
 *
 */

public class Application {

    public static void main(String[] args) {
//который по диагонали
        Figure bishop = new Bishop('a', 2);
        System.out.println(bishop.moveTo('c', 4));
//король
        Figure king = new King('b', 1);
        System.out.println(king.moveTo('a', 2));
//слон
        Figure knight = new Knight('e', 3);
        System.out.println(knight.moveTo('d', 1));
//пешка
        Figure pawn = new Pawn('e', 3);
        System.out.println(pawn.moveTo('d', 4));
//королева
        Figure queen = new Queen('e', 3);
        System.out.println(queen.moveTo('e', 2));
//ладья(крепость)
        Figure rook = new Rook('e', 3);
        System.out.println(rook.moveTo('e', 4));

    }
}
