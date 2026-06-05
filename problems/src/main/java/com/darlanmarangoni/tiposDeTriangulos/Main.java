package com.darlanmarangoni.tiposDeTriangulos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 1045 - Tipos de Triângulos
 * **/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var values = new ArrayList<Double>(0);

        for (int i = 0; i < 3; i++) {
            var value = scanner.nextDouble();
            values.add(value);
        }

        values.sort(Comparator.reverseOrder());
        var a = values.get(0);
        var b = values.get(1);
        var c = values.get(2);

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if ((a * a) == ((b * b) + (c * c))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if ((a * a) > ((b * b) + (c * c))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if ((a * a) < ((b * b) + (c * c))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a.equals(b) && b.equals(c)) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (a.equals(b) && !b.equals(c) || b.equals(c) && !a.equals(b)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

    }
}