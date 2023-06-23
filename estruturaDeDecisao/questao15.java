package estruturaDeDecisao;
/*

Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo.
Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.

Dicas:
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes;

 */

import java.util.Locale;
import java.util.Scanner;

public class questao15 {
        public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int lado1, lado2, lado3;

        System.out.println("Digite os 3 lados do triangulo: ");
        lado1 = sc.nextInt();
        lado2 = sc.nextInt();
        lado3 = sc.nextInt();

        if((lado1 + lado2) < lado3 || (lado2 + lado3) < lado1 || (lado1 + lado3) < lado2) System.out.println("Impossível formar um triangulo.");
        else if(lado1 == lado2 && lado1 == lado3) System.out.println("Os lados formam um triangulo equilatero.");
        else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) System.out.println("Os lados formam um triangulo escaleno.");
        else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) System.out.println("Os lados formam um triangulo isoceles.");
        sc.close();
    }
}
