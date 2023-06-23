package estruturaDeDecisao;
/*
Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor
do saque e depois informar quantas notas de cada valor serão fornecidas.
As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais.
O valor mínimo é de 10 reais e o máximo de 600 reais.
O programa não deve se preocupar com a quantidade de notas existentes na máquina.

Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50,
uma nota de 5 e uma nota de 1;

Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50,
quatro notas de 10, uma nota de 5 e quatro notas de 1.

 */

import java.util.Locale;
import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int saque;

        System.out.print("Informe o valor que deseja sacar: ");
        saque = sc.nextInt();

        if (saque < 10 || saque > 600) System.out.println("Valor inválido para saque");
        else {
            int notas100 = saque / 100;
            int notas50 = (saque - (notas100 * 100)) / 50;
            int notas10 = (saque - (notas100 * 100) - (notas50 * 50)) / 10;
            int notas5 = (saque - (notas100 * 100) - (notas50 * 50) - (notas10 * 10)) / 5;
            int notas1 = saque - (notas100 * 100) - (notas50 * 50) - (notas10 * 10) - (notas5 * 5);

            System.out.printf("Notas de 100: %d\n", notas100);
            System.out.printf("Notas de  50: %d\n", notas50);
            System.out.printf("Notas de  10: %d\n", notas10);
            System.out.printf("Notas de   5: %d\n", notas5);
            System.out.printf("Notas de   1: %d\n", notas1);
        }
        sc.close();
    }
}

