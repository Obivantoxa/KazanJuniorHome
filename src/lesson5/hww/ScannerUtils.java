package lesson5.hww;

import java.util.Scanner;

public class ScannerUtils {
	
	public static String getFiguraFromUser(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chose form of figure: ");
		System.out.println("1 - Triangle");
		System.out.println("2 - Circle");
		System.out.println("3 - Parallelogram");
		System.out.println("4 - Cone");
		System.out.println("5 - Oval");
		System.out.println("6 - Tetrahedron");
		String inputFigura = scanner.nextLine();
		if(!inputFigura.equals("1")&&
				!inputFigura.equals("2")&&
				!inputFigura.equals("3")&&
				!inputFigura.equals("4")&&
				!inputFigura.equals("5")&&
				!inputFigura.equals("6")&&
				!inputFigura.equalsIgnoreCase("Triangle")&&
				!inputFigura.equalsIgnoreCase("Circle")&&
				!inputFigura.equalsIgnoreCase("Parallelogram")&&
				!inputFigura.equalsIgnoreCase("Cone")&&
				!inputFigura.equalsIgnoreCase("Oval")&&
				!inputFigura.equalsIgnoreCase("Tetrahedron")){
			return getFiguraFromUser();
		}
		return inputFigura;
	}

}
