/*

Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
- o produto do dobro do primeiro com metade do segundo .
- a soma do triplo do primeiro com o terceiro.
- o terceiro elevado ao cubo.

 */
import java.util.Scanner;
import java.util.Locale;

public class questao11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        double num3;

        System.out.println("Escreva 2 numeros inteiros e um numero real respectivamente: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextFloat();

        System.out.printf("O produto do dobro do primeiro com metade do segundo = %d.\n", (num1*2) * (num2 / 2)) ;
        System.out.printf("A soma do triplo do primeiro com o terceiro = %.3f.\n", (num1 * 3) + num3);
        System.out.printf("O terceiro elevado ao cubo = %.3f.\n", Math.pow(num3, 3));
        sc.close();
    }
}
