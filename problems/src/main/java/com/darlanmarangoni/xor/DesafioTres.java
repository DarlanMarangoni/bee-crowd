package com.darlanmarangoni.xor;

public class DesafioTres {

    public boolean isSet(int n, int i) {
        int mask = 1 << i; // monta liga o bit na posicao indicada por i
        return (n & mask) != 0;
    }
    public int setBit(int n, int i) {
        int mask = 1 << i;
        return n | mask;
    }
    public int toggleBit(int n, int i) {
        int mask = 1 << i;
        return n ^ mask;
    }
}
