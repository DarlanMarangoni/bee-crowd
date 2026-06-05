package com.darlanmarangoni.xor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesafioDoisTest {

    @Test
    void swap() {
        int[] swap1 = new DesafioDois().swap(0, 1);
        Assertions.assertEquals(1, swap1[0]);
        Assertions.assertEquals(0, swap1[1]);
        int[] swap2 = new DesafioDois().swap(5, 3);
        Assertions.assertEquals(3, swap2[0]);
        Assertions.assertEquals(5, swap2[1]);
        int[] swap3 = new DesafioDois().swap(0, 7);
        Assertions.assertEquals(7, swap3[0]);
        Assertions.assertEquals(0, swap3[1]);
        int[] swap4 = new DesafioDois().swap(1, 10);
        Assertions.assertEquals(10, swap4[0]);
        Assertions.assertEquals(1, swap4[1]);
        int[] swap5 = new DesafioDois().swap(4, 4);
        Assertions.assertEquals(4, swap5[0]);
        Assertions.assertEquals(4, swap5[1]);
    }
}