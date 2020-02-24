package jc01_2020.buvin.lesson11.task02;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Random;

/*
 *
 * В методе main реализовать следующую логику при возникновении исключений:
 *
 * исключение - вывод в консоль
 * NullPointerException - "NPE"
 * ArithmeticException - "ArithmeticException"
 * NumberFormatException - "ArithmeticException"
 * FileNotFoundException - "File is absent"
 *
 * URISyntaxException никак не обрабатывать.
 * В конце программы вывести в консоль фразу "Program finished successfully"
 *
 */

public class Application {

	public static void main(String[] args) throws Exception {
		invokeMethodWithException();
	}

	private static void invokeMethodWithException() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
		int i = new Random().nextInt(5);
		try {
			if (i == 0) {
				throw new NullPointerException();
			} else if (i == 1) {
				throw new ArithmeticException();
			} else if (i == 2) {
				throw new FileNotFoundException();
			} else if (i == 3) {
				throw new URISyntaxException("", "");
			} else if (i == 4) {
				throw new NumberFormatException();
			}
		} catch (NullPointerException e) {
			System.out.println("NPE");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (FileNotFoundException e) {
			System.out.println("File is absent");
		} catch (URISyntaxException e) {
		} catch (NumberFormatException e) {
			System.out.println("ArithmeticException");
		} finally {
			System.out.println("Program finished successfully");
		}
	}

}
