public class Funcion1 {

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
}
