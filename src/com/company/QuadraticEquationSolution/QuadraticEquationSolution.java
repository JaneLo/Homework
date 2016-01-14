package com.company.QuadraticEquationSolution;
/**
 * Created by Admin on 23.12.2015.
 */

import java.util.Scanner;

public class QuadraticEquationSolution {

    public static void main(String arqs []){

        double a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("== Решение квадратного уравнения ==");
        System.out.println("Введите коэффициенты");
        System.out.print("a = ");
        a = s.nextDouble();
        System.out.print("b = ");
        b = s.nextDouble();
        System.out.print("c = ");
        c = s.nextDouble();

        double D = Math.pow(b, 2) - 4 * a * c; // pow - power

        if (Math.abs(D) < 1e-16) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
            return;
        }
        if (D < 0.0) {
            System.out.println("Решений нет!");
        } else {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + "   x2 = " + x2);
        }
    }

}

