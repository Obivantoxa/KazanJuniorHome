package lesson5.hww;

import java.util.Scanner;

public class FiguraUtils {

	public static void triangleFigura() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side of the Triangle \"A\" ");
		int a = scanner.nextInt();
		System.out.println("Enter the side of the Triangle \"B\" ");
		int b = scanner.nextInt();
		System.out.println("Enter the side of the Triangle \"C\" ");
		int c = scanner.nextInt();
		if (Triangle.pravinTreug(a,b,c)){
			System.out.println("Entered rigth triangle : ");
			Triangle tr =new Triangle();
			tr.setA(a);
			tr.setB(b);
			tr.setC(c);
			System.out.println("Perimetr = " + tr.perimetr());
			System.out.println("Square = " + tr.square());
			System.out.println("Try next figure ..");
			ScannerUtils.getFiguraFromUser();
		}else{
			System.out.println("Re-enter the sides of the triangle");
			triangleFigura();
		}
	}

	public static void circleFigura() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of circle \"R\" ");
		int r = scanner.nextInt();
		if(Circle.pravinCircle(r)){
			System.out.println("Entered rigth Circle : ");
			Circle circle = new Circle();
			circle.setR(r);
			System.out.println("Dlina circle = "+ circle.dlinaCircle());
			System.out.println("Square of circle "+ circle.circleSquare());
			System.out.println("Try next figure ..");
			ScannerUtils.getFiguraFromUser();
		}else{
			System.out.println("Re-enter the radius of the circle");
			circleFigura() ;
		}
		
	}

	public static void parallelogramFigura() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side of the parallelogram  \"A\" ");
		int a = scanner.nextInt();
		System.out.println("Enter the side of the parallelogram  \"B\" ");
		int b = scanner.nextInt();
		System.out.println("Enter Visota parallelogram  \"h\" ");
		int h = scanner.nextInt();
		if (Parallelogram.pravilParallelogram(a, b, h)){
			System.out.println("Entered rigth parallelogram : ");
			Parallelogram parallelogram = new Parallelogram();
			parallelogram.setA(a);
			parallelogram.setB(b);
			parallelogram.setH(h);
			System.out.println("Perimetr = " + parallelogram.perimetr());
			System.out.println("Square = " + parallelogram.square());
			System.out.println("Try next figure ..");
			ScannerUtils.getFiguraFromUser();
		}else{
			System.out.println("Enter the side of the parallelogram");
			circleFigura() ;
		}
	}

	public static void coneFigura() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of the Cone  \"r\" ");
		int r = scanner.nextInt();
		System.out.println("Enter the side of the Cone  \"h\" ");
		int h = scanner.nextInt();
		System.out.println("Enter dlana Cone  \"l\" ");
		int l = scanner.nextInt();
		if (Cone.pravilCone(r, h, l)){
			System.out.println("Entered rigth Cone : ");
			Cone cone = new Cone();
			cone.setR(r);
			cone.setH(h);
			cone.setL(l);
			System.out.println("squareBokovaya = " + cone.squareBokovaya());
			System.out.println("squareOsnovaniya = " + cone.squareOsnovaniya());
			System.out.println("squarePolnaya = " + cone.squarePolnaya());
			System.out.println("obiem = " + cone.obiem());
			System.out.println("Try next figure ..");
			ScannerUtils.getFiguraFromUser();
		}else{
			System.out.println("Enter the side of the Cone");
			circleFigura() ;
		}
	}

	public static void ovalFigura() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of the Oval  \"ra\" ");
		int ra = scanner.nextInt();
		System.out.println("Enter the radius of the Oval  \"rb\" ");
		int rb = scanner.nextInt();
		if (Oval.pravilOval(ra, rb)){
			System.out.println("Entered rigth Oval : ");
			Oval oval = new Oval();
			oval.setRa(ra);
			oval.setRb(rb);
			System.out.println("dlina ovala = " + oval.dlina());
			System.out.println("square ovala = " + oval.square());
			System.out.println("Try next figure ..");
			ScannerUtils.getFiguraFromUser();
		}else{
			System.out.println("Enter the side of the Oval");
			circleFigura() ;
		}
		
	}

	public static void TetrahedronFigura() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side of the Tetrahedron  \"a\" ");
		int a = scanner.nextInt();
		
		if (Tetrahedron.pravilTetrahedron(a)){
			System.out.println("Entered rigth Tetrahedron : ");
			Tetrahedron tetrahedron = new Tetrahedron();
			tetrahedron.setA(a);
			System.out.println("obiem tetrahedron = " + tetrahedron.obiem());
			System.out.println("square tetrahedron = " +tetrahedron.square());
			System.out.println("Try next figure ..");
			ScannerUtils.getFiguraFromUser();
		}else{
			System.out.println("Enter the side of the Tetrahedron");
			circleFigura() ;
		}
		

	}

}
