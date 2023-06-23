package estruturaDeDecisao;

import java.util.Locale;
import java.util.Scanner;

/*
Uma fruteira está vendendo frutas com a seguinte tabela de preços:

                      Até 5 Kg           Acima de 5 Kg
Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg)
de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

 */

public class questao27 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float totalMorangos, totalMacas, valorMorangos, valorMacas, valorBruto; 
        System.out.print("Digitee a quantidade de morangos comprados (em KG): ");

        totalMorangos = sc.nextFloat();
        System.out.print("Agora digite a quantidade de maçãs compradas: (em KG)");
        totalMacas = sc.nextFloat();

        if (totalMorangos <= 5) valorMorangos = totalMorangos * 2.5f;
        else valorMorangos = totalMorangos * 2.2f;

        if(totalMacas <= 5) valorMacas = totalMacas * 1.8f;
        else valorMacas = totalMacas * 1.5f;
        
        valorBruto = valorMorangos + valorMacas;

        if ((totalMorangos + totalMacas) >= 8 || valorBruto >= 25) valorBruto = valorBruto * 0.9f;
    
        System.out.println("Valor a pagar: " + valorBruto);

        sc.close();
    }
}