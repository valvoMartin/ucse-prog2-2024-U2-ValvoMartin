package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvionPrivadoTest {

    AvionPrivado avion;
    @Test
    public void testVolarCombustibleIgualA40000() {
        avion = new AvionPrivado(30000,5);
        Assertions.assertEquals(avion.volar(5000),40000);
    }
}