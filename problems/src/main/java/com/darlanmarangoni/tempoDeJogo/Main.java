package com.darlanmarangoni.tempoDeJogo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        var horaInicial = scanner.nextInt();
        var horaFinal = scanner.nextInt();

        if (horaInicial == horaFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (horaInicial < horaFinal) {
            var tempoDeJogo = -(horaInicial - horaFinal);
            System.out.println("O JOGO DUROU " + tempoDeJogo + " HORA(S)");
        } else {
            var tempoDeJogo = (24 - horaInicial) + horaFinal;
            System.out.println("O JOGO DUROU " + tempoDeJogo + " HORA(S)");
        }
    }
}
