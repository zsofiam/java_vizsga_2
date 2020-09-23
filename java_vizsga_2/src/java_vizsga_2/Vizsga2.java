package java_vizsga_2;

import java.util.Scanner;

public class Vizsga2 {

	public static void main(String[] args) {
		System.out.println("2. feladat");
		System.out.println("Parancssorban ki�rjuk az �sszes primit�v"
				+ " v�ltoz� minimum �s maximum �rt�k�t, ha van ilyen.");
		System.out.println();
		System.out.println("Primit�v v�ltoz�k minimum �s maximum �rt�kei");
		displayMinAndMaxValue(Byte.TYPE, Byte.MIN_VALUE, Byte.MAX_VALUE);
		displayMinAndMaxValue(Short.TYPE, Short.MIN_VALUE, Short.MAX_VALUE);
		displayMinAndMaxValue(Character.TYPE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
		displayMinAndMaxValue(Integer.TYPE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		displayMinAndMaxValue(Long.TYPE, Long.MIN_VALUE, Long.MAX_VALUE);
		displayMinAndMaxValue(Float.TYPE, Float.MIN_VALUE, Float.MAX_VALUE);
		displayMinAndMaxValue(Double.TYPE, Double.MIN_VALUE, Double.MAX_VALUE);
		displayMinAndMaxValue(Boolean.TYPE, 0, 1);
		
		System.out.println();
		System.out.println("3. feladat");
		System.out.println("Boolean v�ltoz� ismeret�ben"
				+ " byte v�ltoz�t �ll�tgatunk (true => 1, false => 0) adatbek�r�s alapj�n.");
		System.out.println();
		setByteValue();
	}

	private static void setByteValue() {
		Scanner scanner = new Scanner(System.in);
		boolean trueOrFalse = false;
		byte byteVariable;
		while(true) {
		System.out.println("igaz (true), hamis (false) vagy l�pjen ki?");
		String answer = scanner.nextLine();
		switch(answer.toLowerCase()) {
		case "igaz":
		case "true":
			trueOrFalse = true;
			break;
		case "hamis":
		case "false":
			trueOrFalse = false;
			break;
		default:
			System.out.println("K�sz�nj�k a r�sztv�telt!");
			scanner.close();
			System.exit(0);
		}
		byteVariable = (byte) (trueOrFalse == true ? 1 : 0);
		System.out.println("Byte v�ltoz�nk �rt�ke most " + byteVariable + ".");
		}
	}

	public static void displayMinAndMaxValue(Class<?> type, Number min, Number max) {
		System.out.printf("t�pus: %-8s min: %-22s max: %s\n", type, min, max);
	}
}
