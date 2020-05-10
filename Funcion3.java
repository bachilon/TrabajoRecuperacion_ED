package Funciones;

public class Funcion3 {

	public static Integer funcion3(int[] numeros) {

		int resultado = 0;
		int edad = 22;
		int MitadEdad = 11;
			for (int i = 0; i < numeros.length; i++) {
			   if (numeros[i] >= MitadEdad && numeros[i] <= edad) {
			       resultado += numeros[i];
			   }
			}
			return resultado;
	}
}
