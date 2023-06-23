//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

import java.util.Scanner;

public class questao2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.printf("Digite um numero: ");
        numero = sc.nextInt();

        System.out.printf("Numero digitado: %d\n", numero);

        sc.close();
    }
}
