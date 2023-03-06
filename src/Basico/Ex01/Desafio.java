package Basico.Ex01;

import java.util.Scanner;

public class Desafio {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite a quantidade de meses: ");
            int entrada = leitor.nextInt();
            int mesada = 50;


                int j = entrada * mesada;
                System.out.println("Voce tera "+j+" reais");
            }
}
