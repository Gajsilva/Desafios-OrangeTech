package Intermediario.Ex02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();

        boolean limitVelocidade = velocidade <= 80;
        // TODO2: Crie a condição para verificar se os motoristas receberão ou não pontos na carteira de habilitação
        if(!limitVelocidade){
            multas++;
        }
        if(multas >= 3){
            System.out.println(multas + " multas. " + "Levou pontos na carteira");
        }else{
            System.out.println(multas + " multas. " + "Nao levou pontos na carteira");
        }
    }
}
