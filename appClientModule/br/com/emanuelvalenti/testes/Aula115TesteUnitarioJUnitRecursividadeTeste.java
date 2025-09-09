package br.com.emanuelvalenti.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.emanuelvalenti.refinado.Aula099Recursivo;

class Aula115TesteUnitarioJUnitRecursividadeTeste {


	Aula099Recursivo r;

	@BeforeEach
	void setUp() throws Exception {
		r = new Aula099Recursivo();
	}

	@Test
	void testSomaUm() {
		assertEquals(55, r.somaUm(10));
	}

	@Test
	void testPotencia() {
		assertEquals(81, r.potencia(3, 4));
	}

}
