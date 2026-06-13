package com.darlanmarangoni.FestivalDasEstatuasDeGelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroDeInstancias = scanner.nextInt();

        for (int i = 0; i < numeroDeInstancias; i++) {
            int numeroTipoDeBlocos = scanner.nextInt();
            int comprimentoDesejado = scanner.nextInt();
            List<Integer> blocos = new ArrayList<>(0);
            for (int j = 0; j < numeroTipoDeBlocos; j++) {
                blocos.add(scanner.nextInt());
            }
            blocos.sort(Comparator.reverseOrder());
            int quandidadeDeBlocos = 0;
            for (Integer bloco : blocos) {
                int quantidadeDeBlocosPorMedida = comprimentoDesejado / bloco;
                quandidadeDeBlocos += quantidadeDeBlocosPorMedida;
                comprimentoDesejado = comprimentoDesejado % bloco;
                if (comprimentoDesejado % bloco == 0) {
                    break;
                }
            }
            System.out.println(quandidadeDeBlocos);
        }

    }
}
