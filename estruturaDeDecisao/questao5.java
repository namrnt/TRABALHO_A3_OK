package estruturaDeDecisao;

import java.util.Locale;
import java.util.Scanner;

/*

Faça um programa para a leitura de duas notas parciais de um aluno. 
O programa deve calcular a média alcançada por aluno e apresentar:

A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez.

 */
public class questao5 {
        public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, media;

        System.out.println("Digite as duas notas parciais do aluno: ");
        nota1 = sc.nextFloat();
        nota2 = sc.nextFloat();

        media = (nota1 + nota2) / 2;

        if(media >= 7 && media < 10) System.out.println("Aprovado!");
        else if(media == 10)System.out.println("Aprovado com Distincao!");
        else System.out.println("Reprovado!");
        sc.close();
        
    }
}
