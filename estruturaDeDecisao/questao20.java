package estruturaDeDecisao;

import java.util.Locale;
import java.util.Scanner;

/*
 
Faça um Programa para leitura de três notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e presentar:

A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
A mensagem "Aprovado com Distinção", se a média for igual a 10.

 */
public class questao20 {
        public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3, media;

        System.out.println("Digite as tres notas parciais do aluno: ");
        nota1 = sc.nextFloat();
        nota2 = sc.nextFloat();
        nota3 = sc.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7 && media < 10) System.out.println("Aprovado!");
        else if(media == 10)System.out.println("Aprovado com Distincao!");
        else System.out.println("Reprovado!");
        sc.close();
        
    }
}
