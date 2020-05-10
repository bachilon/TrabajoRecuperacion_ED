package Funciones;

public class Funcion2 {

	public static String Funcion2(String palabra, String palabra2) {

		int contVocales = 0;
		int contVocales2 = 0;
		int contConsonantes = 0;
		int contConsonantes2 = 0;
		int longitud = palabra.length();
		int longitud2 = palabra2.length();
			String result = null;
				for (int x = 0; x < longitud; x++) {
				if ((palabra.charAt(x) == 'a') || ((palabra.charAt(x) == 'e')) || ((palabra.charAt(x) == 'o'))
		           || ((palabra.charAt(x) == 'i')) || ((palabra.charAt(x) == 'u'))) {
					contVocales++;
					}
					contConsonantes = longitud - contVocales;
					}
				for (int y = 0; y < longitud2; y++) {
				   if ((palabra2.charAt(y) == 'a') || ((palabra2.charAt(y) == 'e')) || ((palabra2.charAt(y) == 'o'))
				           || ((palabra2.charAt(y) == 'i')) || ((palabra2.charAt(y) == 'u'))) {
				   contVocales2++;
				   }
				   contConsonantes2 = longitud2 - contVocales2;
				   }
		if (contConsonantes > contConsonantes2) {
	   result = palabra;
		} else if (contConsonantes < contConsonantes2) {
	   result = palabra2;
		} else if (contConsonantes == contConsonantes2) {
	   result = null;
		}
		return result;
	}
}