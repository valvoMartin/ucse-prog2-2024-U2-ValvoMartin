package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

class CalculadorCombustibleTest {

    @Test
    public void testCalcularCombustibleIgualA15000() {
        //Distancia * consumoCombustible = 5000 * 3 = 15000

        CalculadorCombustible method = CalculadorCombustible.getInstance();
        Avion avion = mock(Avion.class);
        when(avion.volar(5000)).thenReturn(15000);
        Assertions.assertEquals(method.calcularCombustible(avion,5000),15000);
    }

}