package ejerciciosAceptaElReto;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*La entrada comenzará con un entero que indica el número de casos de prueba. Cada uno de ellos está formado por dos líneas; la primera indica el titular donde buscar un mensaje oculto y la segunda indica el mensaje a buscar. La longitud de cada una de las cadenas no excederá los 2000 caracteres. Ten en cuenta que no hace falta distinguir entre mayúsculas y minúsculas y que los espacios del mensaje oculto no son relevantes, es decir, no hace falta que existan en el mensaje original, pero sí deben aparecer el resto de caracteres (signos de puntuación, comillas, etc.). Se garantiza que el mensaje oculto a buscar no empieza ni termina por espacios.
		La entrada contendrá únicamente letras del alfabeto inglés, por lo que no aparecerán vocales con tilde. Además, podrían aparecer múltiples espacios consecutivos. Para cada caso de prueba el programa escribirá SI si el mensaje buscado aparece en el titular y NO en caso contrario.*/
		Scanner entrada = new Scanner(System.in);
		int numeroCasos;
		String titular, mensaje;
		
		System.out.printf("Introduce el numero de casos a evaluar: ");
		numeroCasos = entrada.nextInt();
		entrada.nextLine();
		
		for (int contador = 0; contador < numeroCasos; contador++) {
			System.out.printf("%nTitular: ");
			titular = entrada.nextLine();
			
			System.out.printf("%nMensaje: ");
			mensaje = entrada.nextLine();
			
			
		}
		

	}

}
