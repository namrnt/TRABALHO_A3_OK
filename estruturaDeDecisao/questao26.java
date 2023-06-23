package estruturaDeDecisao;
/*
Um posto está vendendo combustíveis com a seguinte tabela de descontos:

Álcool:
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro

Gasolina:
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia o número de litros vendidos,
o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina),
calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do
litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.

 */

import java.util.Locale;
import java.util.Scanner;

public class questao26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float quantidadeLitros;
        String tipoCombustivel;

        System.out.printf("Digite a letra de acorco com o combustível desejado!\nA para Alcool - R$1.90/L\nG para gasolina - R$2.50/L\n");
        tipoCombustivel = sc.nextLine().toUpperCase();

        System.out.printf("Informe a quantidade de litros que serão abastecidos: ");
        quantidadeLitros = sc.nextFloat();

        float valor, desconto;
        if (tipoCombustivel.equals("A")) {
            valor = 1.9f;
            if (quantidadeLitros <= 20) {
                desconto = 3;
            } else {
                desconto = 5;
            }
        } else {
            valor = 2.5f;
            if (quantidadeLitros <= 20) {
                desconto = 4;
            } else {
                desconto = 6;
            }
        }

        float totalPagar = (valor * quantidadeLitros) * ((100 - desconto) / 100.0f);

        System.out.println("Total a pagar: " + totalPagar);

        sc.close();
    }
}

