package estruturaDeDecisao;
/*

  Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre,
  e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:

  Média de Aproveitamento  Conceito
  Entre 9.0 e 10.0        A
  Entre 7.5 e 9.0         B
  Entre 6.0 e 7.5         C
  Entre 4.0 e 6.0         D
  Entre 4.0 e zero        E

  O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO”
  se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.

 */

import java.util.Locale;
import java.util.Scanner;

public class questao14 {
        public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;
        String conceito, situacao;

        System.out.println("Digite as duas notas parciais do aluno: ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();

        System.out.println();

        System.out.println("INFORMACOES DO ALUNO!\n");
        System.out.printf("NOTA 1: %.2f \t NOTA 2: %.2f\n\n", nota1, nota2);
        media = (nota1 + nota2) / 2;
        System.out.printf("MEDIA DO ALUNO: %.2f\n\n", media);

        conceito = " ";
        
        if(media > 9 && media <= 10) conceito = "A";
        else if(media > 7.5 && media <= 9) conceito = "B";
        else if(media > 6.0 && media <= 7.5) conceito = "C";
        else if(media > 4.0 && media <= 6) conceito = "D";
        else if(media <= 4 & media > 0) conceito = "E";

        if(conceito == "A" || conceito == "B" || conceito == "C"){
          situacao = "APROVADO!";
        } else situacao = "REPROVADO!";
        System.out.printf("CONCEITO: %s\t%s\n", conceito, situacao);
        sc.close();
    }
}
