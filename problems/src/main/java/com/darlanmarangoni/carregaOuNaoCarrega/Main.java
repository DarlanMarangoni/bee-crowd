package com.darlanmarangoni.carregaOuNaoCarrega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Lê pares de números inteiros (um por linha) da entrada padrão e imprime
 * o resultado do XOR bit a bit entre eles.
 *
 * O XOR retorna 1 apenas quando os bits diferem, que é exatamente o comportamento
 * de "carrega ou não carrega" — bits iguais cancelam, bits diferentes somam.
 *
 * Otimizações aplicadas:
 * - BufferedReader no lugar de Scanner para I/O mais rápido
 * - StringBuilder acumulando toda a saída antes de imprimir (evita flush por linha)
 * - Operador ^ aplicado diretamente nos longs, sem conversão para binário
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] parts = line.split(" ");
            long a = Long.parseLong(parts[0]);
            long b = Long.parseLong(parts[1]);
            sb.append(a ^ b).append('\n');
        }

        System.out.print(sb);
    }
}

