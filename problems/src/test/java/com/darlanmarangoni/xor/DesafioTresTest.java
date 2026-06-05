package com.darlanmarangoni.xor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesafioTresTest {

    DesafioTres desafioTres = new DesafioTres();

    @Test
    void isSet() {
        Assertions.assertTrue(desafioTres.isSet(5, 0));
        Assertions.assertFalse(desafioTres.isSet(5, 1));
    }

    @Test
    void setBit() {
        Assertions.assertEquals(7, desafioTres.setBit(5, 1));
        Assertions.assertEquals(7, desafioTres.setBit(5, 1));
    }

    @Test
    void toggleBit() {
        Assertions.assertEquals(4, desafioTres.toggleBit(5, 0));
        Assertions.assertEquals(7, desafioTres.toggleBit(5, 1));
    }
}