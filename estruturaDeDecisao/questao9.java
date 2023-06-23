package estruturaDeDecisao;
//Faça um Programa que leia três números e mostre-os em ordem decrescente.

import java.util.Locale;
import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float num1, num2, num3;

        System.out.println("Escreva os 3 numeros abaixo: ");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        num3 = sc.nextFloat();
        System.out.println();
        System.out.println("NUMEROS EM ORDEM DECRESCENTE!\n");
        if (num1 > num2 && num1 > num3) {
            System.out.printf("%.2f\n", num1);
            if (num2 > num3)
                System.out.printf("%.2f\n%.2f", num2, num3);
            else
                System.out.printf("%.2f\n%.2f\n", num3, num2);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf("%.2f\n", num2);
            if (num1 > num3)
                System.out.printf("%.2f\n%.2f", num1, num3);
            else
                System.out.printf("%.2f\n%.2f\n", num3, num1);
        } else if (num3 > num1 && num3 > num2) {
            System.out.printf("%.2f\n", num3);
            if (num1 > num2)
                System.out.printf("%.2f\n%.2f", num1, num2);
            else
                System.out.printf("%.2f\n%.2f\n", num2, num1);
        }
        sc.close();
    }
}
