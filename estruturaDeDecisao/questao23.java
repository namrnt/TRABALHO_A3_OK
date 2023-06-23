package estruturaDeDecisao;
// Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
// Dica: utilize uma função de arredondamento.

import java.util.Locale;
import java.util.Scanner;

public class questao23 {
        public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float numero;

        System.out.printf("Digite um numero: ");
        numero = sc.nextFloat();

        if(numero == (int)numero) System.out.printf("O numero é inteiro.");
        else System.out.printf("O numero é decimal.");

        sc.close();
    }
}
