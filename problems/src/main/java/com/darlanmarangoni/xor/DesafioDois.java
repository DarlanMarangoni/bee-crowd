package com.darlanmarangoni.xor;

public class DesafioDois {

    public int[] swap(int a, int b) {
        a ^= b;
        b ^= a;
        a ^= b;
        return  new int[]{a,b};
    }
}