package estruturaDeDecisao;
//Faça um Programa que leia um número e exiba o dia correspondente da semana.
// (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.

import java.util.Locale;
import java.util.Scanner;

public class questao13 {
        public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int dia;

        System.out.printf("Digite um numero correspondente a um dia da semana: ");
        dia = sc.nextInt();

        switch(dia){
            case 1:
            System.out.println("Domingo!");
            break;
            case 2:
            System.out.println("Segunda!");
            break;
            case 3:
            System.out.println("Terça!");
            break;
            case 4:
            System.out.println("Quarta!");
            break;
            case 5:
            System.out.println("Quinta!");
            break;
            case 6:
            System.out.println("Sexta!");
            break;
            case 7:
            System.out.println("Sabado!");
            break;
            default:
            System.out.println("Valor Inválido!");
            break;
        }
        sc.close();
    }
}
