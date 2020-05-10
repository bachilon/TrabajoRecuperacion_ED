import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class test1 {
		static funciones Funcion1 = null;
		static int pruebasrealizadas = 0;
		
		@BeforeAll
		static void prepararPruebas() {
			System.out.println("Estamos esperando para realizar las pruebas");
			Funcion1 = new funciones();
		}
		
		@BeforeEach
		private void EjecutarPruebas() {
			pruebasrealizadas++;
			System.out.println("Cargando pruebas...");
		}
		
		@AfterEach
		private void terminadoPruebas() {
			System.out.println("Ejecutando el test...");
		}
		
		@AfterAll
		static void finPruebas() {
			System.out.println("Pruebas realizadas con éxito");
			Funcion1 = null;
		}
			
			//****PRUEBAS DE CAJA NEGRA****\\
		
		@Test
		@DisplayName("Caja NEGRA con valor limite inferior")
		void PruebaFuncion1(){
			assertEquals(true, funciones.Funcion1("hola me llamo carlos y estoy haciendo una pruebas para recu")); // Hay 22 "vocales" por lo tanto entraria
			// dentro del true porque ha llegado al limite de la edad que es 22.
		}
		
		@Test
		@DisplayName("Caja NEGRA con valor limite inferior -1")
		void Prueba2Funcion1(){
			assertEquals(false, funciones.Funcion1("hola me llamo carlos y estoy haciendo una pruebas para re")); // Hay 21 "vocales" por lo tanto NO entraria
			// dentro del true porque ha BAJADO el limite de la edad que es 22.	
		}
		
		@Test
		@DisplayName("Caja NEGRA con valor nulo")
		void Prueba3Funcion1() {
			assertNull(null, funciones.Funcion1("")); 
		}
		
		@Test
		@DisplayName("Caja NEGRA con equivalentes")
		void Prueba4Funcion1() {
			assertEquals(true, funciones.Funcion1("Huele a aire de primavera, tengo alergia en el corazón, voy cantando por la carretera"));
			// Seria un caso valido porque hemos colocado una cadena de String y es de caso positivo, porque supera el total de vocales mi edad.
		}
		
			//****PRUEBAS DE CAJA BLANCA****\\
		
		@Test
		@DisplayName("Prueba caja blanca, cobertura de decisiones")
		void Prueba5Funcion1() {
			assertEquals(true, funciones.Funcion1("la giralda presume orgulloza de ver al sevilla en el sanchez pizjuan"));
			// La primera decision es que nos salga True, para eso el String que hemos puesto tiene que tener mas vocales y supera
			// mi edad(22)
		}
			
		@Test
		@DisplayName("CPrueba caja blanca, cobertura de decisiones")
		void Prueba6Funcion1() {
			assertEquals(false, funciones.Funcion1("Un catorce de octubre nacio una ilusion"));
			// La segunda decision es que nos salga false, para eso el numero de vocales no debe superar al numero de mi edad(22)
			
		}
		
		@Test
		@DisplayName("Prueba caja blanca, cobertura de condiciones")
		void Prueba7Funcion1() {
			assertEquals(true, funciones.Funcion1("Helooooooooooooooooooooo"));
			//Condicion de edad es igual vocales en el string = TRUE;
	
		}
		@Test
		@DisplayName("CPrueba caja blanca, cobertura de condiciones")
		void Prueba8Funcion1() {
		assertEquals(true, funciones.Funcion1("Byeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"));
		//Condicion de edad tiene menos cifra que vocales en un String = TRUE;
		}
	}
											//********Fin de nuestra Prueba********\\
