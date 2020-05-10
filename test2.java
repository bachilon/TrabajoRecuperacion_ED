import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class test2 {

		static funciones funcion = null;
		static int pruebasrealizadas = 0;
		
		@BeforeAll
		static void prepararPruebas() {
			System.out.println("PEstamos esperando para realizar las pruebas");
			funcion = new funciones();
		}
		
		@BeforeEach
		private void EjecutarPruebas() {
			pruebasrealizadas++;
			System.out.println("Cargando pruebas...");
		}
		
			//****PRUEBAS DE CAJA NEGRA****\\
		
		@AfterEach
		private void terminadoPruebas() {
			System.out.println("Ejecutando el test...");
		}
		
		@AfterAll
		static void finPruebas() {
			System.out.println("Pruebas realizadas con éxito");
			funcion = null;
		}
		
		//****PRUEBAS DE CAJA NEGRA****\\
		
		@Test
		@DisplayName("Caja NEGRA con valor nulo")
		void PruebaFuncion2(){
			assertNull(null, funciones.Funcion2("carlos", "carlos")); 
			// Si las dos cadenas tienen el mismo numero de consonantes nos saldria null.
		}
		
		@Test
		@DisplayName("Caja NEGRA aleatoria con grupo equivalente")
		void Prueba2Funcion2() {
			assertEquals("carlos", funciones.Funcion2("carlos", "garcia")); //
			//Probamos que la cadena "Palabra" tiene mas consonantes que la cadena "Palabra2"
		}
		
		@Test
		@DisplayName("Caja NEGRA aleatoria con grupo equivalente")
		void Prueba3Funcion2() {
			assertEquals("carlos", funciones.Funcion2("sol", "carlos")); //
			//Probamos que la cadena "Palabra2" tiene mas consonantes que la cadena "Palabra"
		}
		
		@Test
		@DisplayName("Caja NEGRA con valor vacio")
		void Prueba4Funcion2() {
			assertEquals(null, funciones.Funcion2(" ", " ")); //
			//Prueba de caja negra en la que probamos que las dos cadenas no tienen valor y saldria nulo.
		}
		
			//****PRUEBAS DE CAJA BLANCA****\\
		
		@Test
		@DisplayName("Caja BLANCA de cobertura de caminos")
		void Prueba5Funcion2() {
			assertEquals(null, funciones.Funcion2("Hola", "Hola")); //
			//La cadena "Palabra(Hola)" y "Palabra2(Hola)" tiene el mismo numero de consonantes = NULL;
		}
		
		@Test
		@DisplayName("Caja BLANCA de cobertura de caminos")
		void Prueba6Funcion2() {
			assertEquals("carlos garcia", funciones.Funcion2("carlos garcia", "sevilla")); //
			//El string "Palabra(carlos garcia)" tiene mas consonantes que la cadena "Palabra2(sevilla)" = "PALABRA" (sevilla);
		}
		
		@Test
		@DisplayName("Caja BLANCA de cobertura de caminos")
		void Prueba7Funcion2() {
			assertEquals("sevillista", funciones.Funcion2("Sol", "sevillista")); //
			//La cadena "Palabra(sol)" tiene menos consonantes que la cadena "Palabra2(sevillista)" = PALABRA2 (sevillista);
		}
		
		@Test
		@DisplayName("Prueba caja blanca, cobertura de decisiones ")
		void Prueba8Funcion1() {
			assertEquals("estrella", funciones.Funcion2("luna", "estrella"));
			// Queremos una decision en la que "Palabra2" tenga mas consonantes que la "Palabra".
			
		}
}

										//********Fin de nuestra Prueba********\\
