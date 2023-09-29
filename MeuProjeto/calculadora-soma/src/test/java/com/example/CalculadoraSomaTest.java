package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraSomaTest {
	@Test
	public void testCalcularSoma () {
		CalculadoraSoma calculadora = new CalculadoraSoma();
		double resultado = calculadora.calcularSoma(2,2);
		assertEquals(4, resultado, 0.001);
	}
}
