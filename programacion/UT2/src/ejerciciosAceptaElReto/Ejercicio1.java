package ejerciciosAceptaElReto;
import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
		/*Nuestra tarea es hacer un programa que permita a nuestros niños saber si es Navidad o no.La entrada comenzará con un número N indicando cuántas fechas se consultarán. A continuación vendrán esas N fechas, con dos números enteros, día y mes en el formato DD MM indicando el día y el mes a consultar. Todas las fechas serán correctas.Por cada fecha de la entrada, el programa deberá escribir SI si la fecha es la del día de Navidad, 25 de diciembre, y NO en otro caso.*/
		Scanner entrada = new Scanner(System.in);
		int numeroFechas;
		String fechas = "\n", comodin;
		final String NAVIDAD = "25 12";
		
		System.out.printf("Introduce cuantas fechas quieres evaluar: ");
		numeroFechas = entrada.nextInt();
		entrada.nextLine();
		
		for (int contador = 0; contador < numeroFechas; contador++) {
			System.out.printf("%nIntroduce la fecha: ");
			comodin = entrada.nextLine();
			System.out.println("¿Ya es Navidad?");
			
			if (NAVIDAD.equalsIgnoreCase(comodin)) {
				fechas += comodin + " " +"SI"+"\n";
			} else {
				fechas += comodin + " " + "NO"+"\n";
			}
			
		}
		System.out.println(fechas);
		entrada.close();
	}

}
