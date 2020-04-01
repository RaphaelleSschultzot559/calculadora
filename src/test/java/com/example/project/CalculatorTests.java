/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.example.project.calculadoras.Calculator;
import com.example.project.historico.HistoricoSimple;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.sumar(1, 1), "1 + 1 should equal 2");
	}

	@Test
	@DisplayName("Histórico definido")
	void historicoDefinido() {
		Calculator calculator = new Calculator();
		assertNotNull(calculator.getHistoricoSimple(), "El histórico no debería ser nulo");
	}

	@ParameterizedTest(name = "Tamaño histórico")
	@CsvSource({
			"0,    0",
			"1,    1",
			"49,  49",
			"100,  100"
	})
	void tamanyoHistoricoTrasOperaciones(int operaciones, int expectedResult) {
		Calculator calculator = new Calculator();
		for (int i = 0; i < operaciones; i++) {
			calculator.sumar(1, 1);
		}
		HistoricoSimple historicoSimple = calculator.getHistoricoSimple();

		assertEquals(expectedResult, historicoSimple.tamanyoHistorico(),
				() -> "El tamaño del histórico debería ser " + expectedResult + " si se han ejecutado " + operaciones + " operaciones");
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.sumar(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
}
