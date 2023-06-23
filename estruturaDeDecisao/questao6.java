package estruturaDeDecisao;
//Faça um Programa que leia três números e mostre o maior deles.

import java.util.Locale;
import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float num1, num2, num3;

        System.out.println("Digite tres numeros abaixo:");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        num3 = sc.nextFloat();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior numero é " + num1);
        } else if (num2 > num3) {
            System.out.println("O maior numero é " + num2);
        } else System.out.println("O maior numero é " + num3);
        
        sc.close();
    }

}
