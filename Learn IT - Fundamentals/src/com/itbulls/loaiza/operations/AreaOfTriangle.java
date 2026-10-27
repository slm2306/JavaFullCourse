package com.itbulls.loaiza.operations;
import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el valor del la BASE del triangulo: ");
		double base = sc.nextDouble();
		System.out.println("Ingrese el valor de la ALTURA del triangulo: ");
		double altura = sc.nextDouble();
		
		double area = (base*altura)/2;
		
		if(area>=0) {
		System.out.println("El area del triangulo es: "+ area);
		} else {
			System.out.println("El area es invalida");
		}

	}

}
