package estruturaDeDecisao;
//Faça um Programa que peça um número correspondente a um determinado ano e em seguida
// informe se este ano é ou não bissexto.

import java.util.Locale;
import java.util.Scanner;

public class questao17 {
       public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int ano;

        System.out.printf("Escreva um numero correspondente a um determinado ano: ");
        ano = sc.nextInt();

        if(ano % 4 == 0) {
            System.out.println("O ano bissexto!");
        } else System.out.println("O ano nao e bissexto");
        sc.close();
    } 
}
