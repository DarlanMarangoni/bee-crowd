package com.darlanmarangoni.xor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class DesafioUmTest {

    @Test
    void getNumeroUnico() {
        DesafioUm desafioUm = new DesafioUm();

        Assertions.assertEquals(4, desafioUm.getNumeroUnico(List.of(4, 1, 2, 1, 2)));
        Assertions.assertEquals(3, desafioUm.getNumeroUnico(List.of(2, 2, 3, 4, 4)));
        Assertions.assertEquals(7, desafioUm.getNumeroUnico(List.of(7)));
        Assertions.assertEquals(1, desafioUm.getNumeroUnico(List.of(0, 1, 0)));

    }
}