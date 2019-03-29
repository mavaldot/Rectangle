package ui;

import model.Rectangulo;
import java.util.Scanner;


public class Main {
	
	public Main() {}
	
	public static void main(String[] args) {
		
		Main m = new Main();
		m.run();
		

	}
	
	public void run() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Por favor digite la altura del rectangulo en metros");
		double a = s.nextDouble();
		System.out.println("Por favor digite la longitud del rectangulo en metros");
		double l = s.nextDouble();
		
		Rectangulo r = new Rectangulo(a, l);
		
		System.out.println("El area del rectangulo es de " + r.calcularArea() + " metros cuadrados.");
		System.out.println("El perimetro del rectangulo es de " + r.calcularPerimetro() + " metros.");
		System.out.println("La longitud de la diagonal del rectangulo es de " + r.calcularLongitudDiagonal() + " metros.");
		
	}
	
}