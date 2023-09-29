package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraMediaTest {
    @Test
    public void testCalcularMedia(){
        CalculadoraMedia calculadora = new CalculadoraMedia();
        double resultado = calculadora.calcularMedia(3.0, 5.0);
        assertEquals(4.0, resultado, 0.001);
    }
}