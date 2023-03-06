package Basico.Ex02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        for (int i = 0; i < tamanho; i++) {
            System.out.print("/");
        }

    }
}
