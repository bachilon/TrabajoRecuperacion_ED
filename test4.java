package Tests;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class test4 {		
		static funciones funcion = null;
		static int pruebasrealizadas = 0;
		
		@BeforeAll
		static void prepararPruebas() {
			System.out.println("Estamos esperando para realizar las pruebas");
			funcion = new funciones();
		}
		
		@BeforeEach
		private void EjecutarPruebas() {
			pruebasrealizadas++;
			System.out.println("Cargando pruebas...");
		}
		
		@AfterEach
		private void terminadoPruebas() {
			System.out.println("Ejecutando el test... ");
		}
		
		@AfterAll
		static void finPruebas() {
			System.out.println("Pruebas realizadas con �xito");
			funcion = null;
			}
		
			//****PRUEBAS DE CAJA NEGRA****\\

		@DisplayName("Caja NEGRA particiones equivalentes (Entrada Valida)")
		@Test
		void PruebaFuncion4() {
			assertEquals("Insuficiente", funciones.funcion4( new int[] {4, 4, 3, 5, 6, 5}));
			// Esta prueba consiste en que nos salga como resultado Insuficiente, por tanto a�adimos unas notas cuya media sea menor que 5.
		}
		@DisplayName("Caja NEGRA particiones equivalentes (Entrada Valida)")
		@Test
		void Prueba2Funcion4() {
			assertNotEquals("Suficiente", funciones.funcion4( new int[] {8, 5, 5, 5, 7, 6}));
			
			// Esta prueba consiste en que nos salga como resultado Suficiente, por tanto a�adimos unas notas cuya media sea entre 5-6.
		}
		@DisplayName("Caja NEGRA con valor limite inferior")
		@Test
		void Prueba3Funcion4() {
			assertEquals("Notable", funciones.funcion4( new int[] {7, 5, 10, 8, 9, 10}));
			
			// Esta prueba consiste en que nos salga como resultado Suficiente, por tanto a�adimos unas notas cuya media sea entre 7-9.
		}
		@DisplayName("Caja NEGRA con valor limite inferior -1")
		@Test
		void Prueba4Funcion4() {
			assertEquals("Bien", funciones.funcion4( new int[] {5, 7, 8, 5, 6, 7}));
			
			//Esta prueba consiste en que nos salga como resultado Suficiente, por tanto a�adimos unas notas cuya media sea entre 6-7.
		}
		
			//****PRUEBAS DE CAJA BLANCA****\\
		
		@DisplayName("Prueba caja blanca cobertura de decisiones")
		@Test
		void Prueba5Funcion4() {
			assertEquals("Suficiente", funciones.funcion4( new int[] {9, 8, 5, 2, 1}));
			// Colocamos varias notas y el resultado de todas ella es 5, por lo tanto nos saldria Suficiente.
			
		}
		@DisplayName("Prueba caja blanca cobertura de decisiones")
		@Test
		void Prueba6Funcion4() {
			assertEquals("Bien", funciones.funcion4( new int[] {8, 4, 4, 3, 8, 9}));
			
			// Colocamos las notas del segundo trimestre y el resultado de la media es 6(BIEN).
		}
		@DisplayName("Prueba caja blanca cobertura de decisiones")
		@Test
		void Prueba7Funcion4() {
			assertEquals("Insuficiente", funciones.funcion4( new int[] {5, 4, 4, 3, 3, 6}));
			
			// Ponemos varias notas en la que su media nos daria la nota Insuficiente.
		}
		@DisplayName("Prueba caja blanca cobertura de decisiones")
		@Test
		void Prueba8Funcion4() {
			assertEquals("Sobresaliente", funciones.funcion4( new int[] {10, 10, 10, 10, 10, 10}));
			
			//Esta prueba consiste en que nos salga como resultado Sobresaliente, por tanto a�adimos unas notas cuya media sea entre 9-10.
		}

	}
											//********Fin de nuestra Prueba********\\