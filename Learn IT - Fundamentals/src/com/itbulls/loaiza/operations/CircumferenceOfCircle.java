package com.itbulls.loaiza.operations;

import java.util.Scanner;

public class CircumferenceOfCircle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el valor del RADIO del circulo: ");
		double radio = sc.nextDouble();
		
		double circunferencia = 2*3.14*radio;
		
		if(circunferencia >=0) {
			System.out.println("La circunferencia es: "+ circunferencia);
		}else {
			System.out.println("Circunferencia invalida");
		}
	}
}
