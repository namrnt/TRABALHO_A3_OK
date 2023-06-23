package estruturaDeDecisao;
//Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
// Dica: utilize o operador módulo (resto da divisão).

import java.util.Locale;
import java.util.Scanner;

public class questao22 {
        public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.printf("Digite um numero inteiro: ");
        numero = sc.nextInt();

        if(numero % 2 == 0)System.out.println("O numero é par!");
        else System.out.println("O numero é impar!");
        sc.close();
    }
}
