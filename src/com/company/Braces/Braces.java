package com.company.Braces;

import java.util.Scanner;

/**
 * Created by Admin on 22.12.2015.
 */
public class Braces {
    public static void main (String args []){

        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("== Рекурсивный вывод фигурных скобок  ==");
        System.out.println("Введите количество скобок");
        System.out.print("n = ");
        n = s.nextInt();

        CreatingSequences Sequence = new CreatingSequences();
        Sequence.SetNumberOfBraces(n);
        Sequence.StartPrinting();
    }

}