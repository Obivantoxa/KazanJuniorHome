package lesson5.hw;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String selectFigura = ScannerUtils.getFiguraFromUser();
		
		switch(selectFigura){
		case "1":
		case "Triangle":
			System.out.println("Triangle celected");
			FiguraUtils.triangleFigura();
			break;
		case "2":
		case "Circle":
			FiguraUtils.circleFigura();
			break;
		case "3":
		case "Parallelogram":
			FiguraUtils.parallelogramFigura();
			break;
	
		case "4":
		case "Cone":
			FiguraUtils.coneFigura();
			break;
		case "5":
		case "Oval":
			FiguraUtils.ovalFigura();
			break;
		case "6":
		case "Tetrahedron":
			FiguraUtils.TetrahedronFigura();
			break;	
		}
	}
}
