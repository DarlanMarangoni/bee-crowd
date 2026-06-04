package com.darlanmarangoni.carregaOuNaoCarrega;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            var a = String.format("%32s", Long.toBinaryString(sc.nextLong()))
                    .replace(' ', '0');
            var b = String.format("%32s", Long.toBinaryString(sc.nextLong()))
                    .replace(' ', '0');
            var resultado = new char[32];

            for (int i = a.length() - 1; i >= 0; i--) {
                if (a.charAt(i) == b.charAt(i)) {
                    resultado[i] = '0';
                } else {
                    resultado[i] = '1';
                }
            }

            System.out.println(Integer.parseUnsignedInt(new String(resultado), 2));
        }
    }
}
