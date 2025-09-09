package br.com.emanuelvalenti.testes;

import static org.junit.jupiter.api.Assertions.*;
import br.com.emanuelvalenti.poo.Aula037Matematica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class Aula114TesteUnitarioJUnitMatematicaTeste {

	
	Aula037Matematica m;
	@BeforeEach
	void setUp() throws Exception {
		
		m = new Aula037Matematica();
	}

	@Test
	void testMaior() {
		/**
		 * método sem utilizar a importação estática
		 */
		//org.junit.Assert.assertEquals(4, m.maior(4, 2));
		
		
		assertEquals(4, m.maior(4, 2)); //correto

	}

	@Test
	void testSoma() {
		
		assertEquals(5, m.soma(4, 2)); //falha
		

	}

	@Test
	void testDivide() {
		assertEquals(5, m.divide(4, 0)); //erro

	}
	
	
}
