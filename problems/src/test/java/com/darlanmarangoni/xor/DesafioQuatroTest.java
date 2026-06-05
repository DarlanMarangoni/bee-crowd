package com.darlanmarangoni.xor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesafioQuatroTest {

    @Test
    void twoUnique() {
        int[] ints = DesafioQuatro.twoUnique(new int[]{1, 2, 3, 2, 1, 4});
        Assertions.assertEquals(3, ints[0]);
        Assertions.assertEquals(4, ints[1]);
    }
}