package jc01_2020.buvin.lesson07.task02;

public class King extends Figure {
    public King(char vertical, int horizontal) {
        super(vertical, horizontal);
    }

    @Override
    public boolean moveTo(char toVertical, int toHorizontal) {

        int toVerticalInt = charToByte(toVertical);
        int fromVerticalInt = charToByte(getVertical());
        if (toHorizontal == getHorizontal() && toVerticalInt == fromVerticalInt) {
            System.out.println("Точки совпадают!!!");
            return false;
        }
        while (0 < toVerticalInt && toVerticalInt < 9 && 0 < toHorizontal && toHorizontal < 9) {

            if (toHorizontal > getHorizontal()) {
                if (toVerticalInt > fromVerticalInt) {
                    toVerticalInt--;
                    toHorizontal--;
                } else if (toVerticalInt < fromVerticalInt) {
                    toVerticalInt++;
                    toHorizontal--;
                } else if (toVerticalInt == fromVerticalInt) {
                    toHorizontal--;
                }
            } else if (toHorizontal < getHorizontal()) {
                if (toVerticalInt > fromVerticalInt) {
                    toVerticalInt--;
                    toHorizontal++;
                } else if (toVerticalInt < fromVerticalInt) {
                    toVerticalInt++;
                    toHorizontal++;
                } else if (toVerticalInt == fromVerticalInt) {
                    toHorizontal++;
                }
            } else if (toVerticalInt > fromVerticalInt) toVerticalInt--;
            else toVerticalInt++;

            if (toHorizontal == getHorizontal() && toVerticalInt == fromVerticalInt) {
                return true;
            }
            return false;
        }
        System.out.println("Данные за пределами.");
        return false;
    }
}
