/*

Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
utilizando as seguintes fórmulas:

- Para homens: (72.7*h) - 58
- Para mulheres: (62.1*h) - 44.7

 */
import java.util.Scanner;
import java.util.Locale;

public class questao13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float h;

        System.out.printf("Digite a altura: ");
        h = sc.nextFloat();

        System.out.printf("Peso ideal para homens = %.2f Kg.\n", (72.7*h) - 58);
        System.out.printf("Peso ideal para homens = %.2f Kg.", (62.1*h) - 44.7);
        sc.close();
    }
}
