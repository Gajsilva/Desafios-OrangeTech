package Intermediario.Ex05;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = 25;
        int pessoasNoCamarote = 0;

        for (int i = 0; i < tamanhoDaFila; i++) {
            if (i % 2 != 1) {
                pessoasNoCamarote++;
            }
        }

        System.out.println(pessoasNoCamarote);

    }
}
