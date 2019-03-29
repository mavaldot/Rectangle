package model;

import java.lang.Math;

public class Rectangulo {
	
	private double altura;
	private double longitud;
	
	public Rectangulo(double a, double l) {
		altura = a;
		longitud = l;
	}
	
	public double calcularArea() {
		double area = altura * longitud;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2*altura + 2*longitud;
		return perimetro;
	}
	
	public double calcularLongitudDiagonal() {
		double longitudDiagonal = Math.sqrt(altura*altura + longitud*longitud);
		return longitudDiagonal;
	}
	
	public double getAltura() { 
		return altura;
	}
	
	public double getLongitud() {
		return longitud;
	}
	
	public void setAltura(double a) {
		altura = a;
	}		
	
	public void setLongitud(double l) {
		longitud = l;
	}
}