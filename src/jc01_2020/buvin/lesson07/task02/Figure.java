package jc01_2020.buvin.lesson07.task02;

public abstract class Figure {

	private char vertical;
	private int horizontal;

	public Figure(final char vertical, final int horizontal) {
		this.vertical = vertical;
		this.horizontal = horizontal;
		if (!(0 < charToByte(vertical) &&  charToByte(vertical) < 9 && 0 < horizontal && horizontal < 9))
		{
			System.out.println("Данные за пределами.");

		}
	}

	public abstract boolean moveTo(char toVertical, int toHorizontal);

	public char getVertical() {
		return vertical;
	}

	public int getHorizontal() {
		return horizontal;
	}

	public int charToByte(char ch) {
		if (65 <= ch && ch <= 72) return ch - 71;
		else if (97 <= ch && ch <= 104) return ch - 96;
		else return 0;
	}

}
