package es.studium.Peaje;

import java.util.Scanner;

public class Peaje {

	public static void main(String[] args) {
		//VARIABLES
		//REAL km,td
		double km,td;
		//CADENA vehiculo, coche, camion, moto, autobus
		String vehiculo;
		// Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		//INICIO
		//ESCRIBIR “Indicar el tipo de vehículo:”
		System.out.println("Indicar el tipo de vehículo");
		//LEER vehiculo
		vehiculo=teclado.next();
		//ESCRIBIR “Indicar los km recorridos:”
		System.out.println("Indicar los km recorridos");
		//LEER km
		km=teclado.nextDouble();
		//SEGUN vehiculo HACER
		switch (vehiculo) 
		{
		//CASO motos:
		case "moto":
		//ESCRIBIR “La cantidad a pagar es 3.2 €”
			System.out.println("La cantidad a pagar es 3,2€");
			break;
		//CASO coches:
		case "coche":
		//ESCRIBIR “La cantidad a pagar es”+0.1*km+”€”
			System.out.println("La cantidad a pagar es" +0.1*km+"€");
			break;
		//CASO camiones:
		case "camion":
		//ESCRIBIR “Indicar las toneladas transportadas:”
			System.out.println("Indicar las toneladas transportadas");
		//LEER td
			td=teclado.nextDouble();
		//ESCRIBIR “La cantidad a pagar es”+((0,1*km)+(0,1*td))+”€”
			System.out.println("La cantidad a pagar es"+((0.1*km)+(0.1*td))+"€");
			break;
		//CASO autobuses:
		case "autobuses":
		//ESCRIBIR “La cantidad a pagar es”+0,2*km+”€”
			System.out.println("La cantidad a pagar es"+0.2*km+"€");
			break;
		//DEFECTO:
			default:
		//ESCRIBIR “Los datos indicados no son correctos”
				System.out.println("Los datos indicados no son correctos");
		//	FIN SEGUN
		}
		//FIN 
		teclado.close();

	}

}
