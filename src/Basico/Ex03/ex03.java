package Basico.Ex03;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;

        System.out.println( paginas / paginasLidas +" dias");

    }
}
