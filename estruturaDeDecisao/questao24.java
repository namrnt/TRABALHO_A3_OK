package estruturaDeDecisao;

import java.util.Locale;
import java.util.Scanner;

/*

Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.
O resultado da operação deve ser acompanhado de uma frase que diga se o número é:

par ou ímpar;
positivo ou negativo;
inteiro ou decimal.

 */

public class questao24 {
        public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float numero;

        System.out.printf("Digite um numero: ");
        numero = sc.nextFloat();

        if(numero % 2 == 0)System.out.printf("O numero é par, ");
        else System.out.printf("O numero é impar, ");

        if(numero == (int)numero) System.out.printf("inteiro e ");
        else System.out.printf("decimal e ");

        if(numero > 0) System.out.printf("positivo.\n");
        else System.out.printf("negativo.\n");

        sc.close();
    }
}
