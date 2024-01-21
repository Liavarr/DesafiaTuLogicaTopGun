package desafiaTuLogica;

import java.util.Iterator;
import java.util.Scanner;

public class TopGun {
	public static void main(String[] args) {
		//Variables creacion pilotos y aviones:
		//Pilotos
		String idPiloto = "";
		int horasVuelo = 0;
		String rangoPiloto = "";
		
		//Aviones
		String idAvion = "";
		int capAvion = 0;
		boolean tieneDobleMando;
		int numPiloto = 0;
		
		//Declaracion Scanner
		
		Scanner sc = new Scanner(System.in);

		//Creacion de Pilotos
		//Predefinidos
		Piloto piloto1 = new Piloto ("Pete Maverick", 10000, "capitán");
		Piloto piloto2 = new Piloto ("Natasha Phoenix", 3000, "teniente");
		Piloto piloto3 = new Piloto ("Bradley Rooster", 3500 , "teniente");
	
		//Por entrada
		//Piloto 4
		
		System.out.println("Introduce el nombre del piloto 4:");
		idPiloto = sc.nextLine();
		System.out.println("Introduce las horas de vuelo del piloto 4");
		horasVuelo = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce el rango del piloto 4");
		rangoPiloto = sc.nextLine();
		Piloto piloto4 = new Piloto(idPiloto, horasVuelo, rangoPiloto);
		System.out.println("Piloto 4 creado");
		
		//Piloto5		
		System.out.println("Introduce el nombre del piloto 5:");
		idPiloto = sc.nextLine();
		System.out.println("Introduce las horas de vuelo del piloto 5");
		horasVuelo = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce el rango del piloto 5");
		rangoPiloto = sc.nextLine();
		Piloto piloto5 = new Piloto(idPiloto, horasVuelo, rangoPiloto);
		System.out.println("Piloto 5 creado");
		
		//Mostramos a Maverick y Rooster
		System.out.println("Estos son los pilotos menos Natasha que es el piloto 2:");
		System.out.println(piloto1.mostrarPiloto());
		System.out.println(piloto3.mostrarPiloto());
		System.out.println(piloto4.mostrarPiloto());
		System.out.println(piloto5.mostrarPiloto());
		
		//CREACION DE AVIONES
		//Predefinidos=============
		Combate avion1 = new Combate ("Hydra", 1, piloto1, false);
		Combate avion2 = new Combate ("F22", 1, piloto4, true);
		Entrenamiento avion3 = new Entrenamiento ("F18", 2, piloto5, true);
		
		//Por entrada===========
		//Avion 4
		System.out.println("Introduce el nombre del Avion de Entrenamiento 4:");
		idAvion = sc.nextLine();
		System.out.println("Introduce los asientos del Avion de Entrenamiento 4:");
		capAvion = sc.nextInt();
		sc.nextLine();
		System.out.println("¿Tiene doble mando este avion? (Escribe true o false)");
		tieneDobleMando = sc.nextBoolean();
		System.out.println("Del 1 al 5, ¿que piloto quieres añadir?");
		numPiloto = sc.nextInt();
		sc.nextLine();
		
		Entrenamiento avion4 = new Entrenamiento ();
		avion4.setIdAvion(idAvion);
		avion4.setCapAvion(capAvion);
		avion4.setTieneDobleMando(tieneDobleMando);
		switch (numPiloto) {
			case 1: {
				avion4.setPiloto(piloto1);
				break;
			} case 2: {
				avion4.setPiloto(piloto2);
				break;
			} case 3:{
				avion4.setPiloto(piloto3);
				break;
			} case 4:{
				avion4.setPiloto(piloto4);
				break;
			} case 5:{
				avion4.setPiloto(piloto5);
				break;
			} default:
				throw new IllegalArgumentException("Has añadido un piloto que no está soportado: " + numPiloto);
		}
		//Avion 5==========
		System.out.println("Introduce el nombre del Avion de Entrenamiento 5:");
		idAvion = sc.nextLine();
		System.out.println("Introduce los asientos del Avion de Entrenamiento 5:");
		capAvion = sc.nextInt();
		sc.nextLine();
		System.out.println("¿Tiene doble mando este avion? (Escribe true o false)");
		tieneDobleMando = sc.nextBoolean();
		System.out.println("Del 1 al 5, ¿que piloto quieres añadir?");
		numPiloto = sc.nextInt();
		sc.nextLine();
		
		Entrenamiento avion5 = new Entrenamiento ();
		avion5.setIdAvion(idAvion);
		avion5.setCapAvion(capAvion);
		avion5.setTieneDobleMando(tieneDobleMando);
		switch (numPiloto) {
			case 1: {
				avion5.setPiloto(piloto1);
				break;
			} case 2: {
				avion5.setPiloto(piloto2);
				break;
			} case 3:{
				avion5.setPiloto(piloto3);
				break;
			} case 4:{
				avion5.setPiloto(piloto4);
				break;
			} case 5:{
				avion5.setPiloto(piloto5);
				break;
			} default:
				throw new IllegalArgumentException("Has añadido un piloto que no está soportado: " + numPiloto);
		}
		
		System.out.println(avion1.mostrarAvionCombate());
		System.out.println(avion2.mostrarAvionCombate());
		System.out.println(avion3.mostrarAvionEntrenamiento());
		System.out.println(avion4.mostrarAvionEntrenamiento());
		System.out.println(avion5.mostrarAvionEntrenamiento());
		
		sc.close();
	}
}
