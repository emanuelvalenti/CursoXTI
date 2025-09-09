package br.com.emanuelvalenti.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.emanuelvalenti.poo.Aula052Cubo;

class Aula115TesteUnitarioJUnitCuboTeste {

	Aula052Cubo cubo;
	
	@BeforeEach
	void setUp() throws Exception {
		
		cubo = new Aula052Cubo(10);
	}

	@Test
	void testCalculaArea() {
		assertEquals(1000, cubo.calculaArea());
	}

	@Test
	void testCalculaVolume() {
		assertEquals(600, cubo.calculaVolume(),0);
	}

}
