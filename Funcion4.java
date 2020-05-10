public class Funcion4 {

	public static String funcion4(int[] notas) {

		String resultado = null;
		int suma = 0;
		int media = 0;
		int numNotas = notas.length;
		for (int x = 0; x < numNotas; x++) {
		   suma += notas[x];
		}
			media = suma / numNotas;
			if (media < 5) {
			   resultado = "Insuficiente";
			} else if (media >= 5 && media < 6) {
			   resultado = "Suficiente";
			} else if (media >= 6 && media < 7) {
			   resultado = "Bien";
			} else if (media >= 7 && media < 9) {
			   resultado = "Notable";
			} else if (media > 9 && media == 10) {
			   resultado = "Sobresaliente";
			}
			return resultado;
	}
}
