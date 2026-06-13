package com.darlanmarangoni.FestivalDasEstatuasDeGelo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroDeInstancias = scanner.nextInt();

        for (int i = 0; i < numeroDeInstancias; i++) {
            int numeroTipoDeBlocos = scanner.nextInt();
            int comprimentoDesejado = scanner.nextInt();
            int[] blocos = new int[numeroTipoDeBlocos];
            for (int j = 0; j < numeroTipoDeBlocos; j++) {
                blocos[j] = scanner.nextInt();
            }

            int[] dp = new int[comprimentoDesejado + 1];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[0] = 0;
            for (int len = 1; len <= comprimentoDesejado; len++) {
                for (int bloco : blocos) {
                    if (bloco <= len && dp[len - bloco] != Integer.MAX_VALUE) {
                        dp[len] = Math.min(dp[len], dp[len - bloco] + 1);
                    }
                }
            }
            System.out.println(dp[comprimentoDesejado]);
        }
    }
}
