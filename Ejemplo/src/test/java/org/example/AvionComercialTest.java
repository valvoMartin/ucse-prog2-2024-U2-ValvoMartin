package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvionComercialTest {
    AvionComercial avion;
    @BeforeEach
    void setUp() {
        avion = new AvionComercial(30000, 5);
    }

    @Test
    public void testVolarCombustibleIgualA25000() {
        //Distancia * consumoCombustible = 5000 * 5 = 25000
        Assertions.assertEquals(avion.volar(5000),25000);
    }


    @Test
    public void testGetConsumoCombustibleIgualA30000(){
        //Se espera que el consumo de combustible sea 5
        Assertions.assertEquals(avion.getConsumoCombustible(),5);
    }
}