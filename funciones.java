public class funciones {
	    //////////////////// FUNCION 1 //////////////////////

	 public static Boolean Funcion1(String palabra) {

	    int edad = 22;
	    int cont = 0;
	    Boolean result = null;
	    for (int y = 0; y < palabra.length(); y++) {
	         if ((palabra.charAt(y) == 'a') || ((palabra.charAt(y) == 'e')) || ((palabra.charAt(y) == 'o'))
	             || ((palabra.charAt(y) == 'i')) || ((palabra.charAt(y) == 'u'))) {
	                cont++;
	                if (cont >= edad) {
	                    result = true;
	                } else {
	                    result = false;
	                }
	            }
	        }
	   return result;
}
////////////////////FUNCION 2 //////////////////////

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
//////////////////// FUNCION 3 //////////////////////

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
//////////////////// FUNCION 4 //////////////////////

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
//////////////////// FUNCION 5 //////////////////////

public static Integer funcion5(String signo, int numero1, int numero2) {

	int result = 0;
			if (signo == "+") {
			result = numero1 + numero2;
		} else if (signo == "-") {
		   result = numero1 - numero2;
		} else if (signo == "*") {
		   result = numero1 * numero2;
		}
		else if(signo == "") {
			return null;
			
		} else {
		   result = 0;
		}
		return result;
 	}
} 

