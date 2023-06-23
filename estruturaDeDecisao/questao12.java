package estruturaDeDecisao;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda,
que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do
Salário Bruto, mas não é descontado (é a empresa que deposita).
O Salário Líquido corresponde ao Salário Bruto menos os descontos.
O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20%

Imprima na tela as informações, dispostas conforme o exemplo abaixo.
No exemplo o valor da hora é 5 e a quantidade de hora é 220.

        Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00  
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Salário Liquido                 : R$  935,00
 */

public class questao12 {
        public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valorHora, salarioBruto, inss, imposto, fgts, totalDescontos;
        int horaMes;

        System.out.printf("Digite quanto voce ganha por hora trabalhada: ");
        valorHora = sc.nextFloat();
        System.out.printf("Digite agora quantas horas voce trabalha no mes: ");
        horaMes = sc.nextInt();

        System.out.println();
        salarioBruto = horaMes * valorHora;
        System.out.printf("Salário Bruto: (%.2f * %d)\t\t : R$ %.2f\n", valorHora, horaMes, salarioBruto);

        imposto = 0;

        if(salarioBruto <= 900){
            imposto = 0 * salarioBruto;
            System.out.printf("(-) IR (0 %%) \t\t\t\t : R$ %.2f.\n", imposto);
        } else if(salarioBruto > 900 && salarioBruto <= 1500){
            imposto = 0.05 * salarioBruto;
            System.out.printf("(-) IR (5 %%) \t\t\t\t : R$ %.2f.\n", imposto);
        } else if(salarioBruto > 1500 && salarioBruto <= 2500){
            imposto = 0.1 * salarioBruto;
            System.out.printf("(-) IR (10 %%) \t\t\t\t : R$ %.2f.\n", imposto);
        } else if(salarioBruto > 2500){
            imposto = 0.2 * salarioBruto;
            System.out.printf("(-) IR (20 %%) \t\t\t\t : R$ %.2f.\n", imposto);
        }

        inss = salarioBruto * 0.10;
        fgts = salarioBruto * 0.11;
        totalDescontos = imposto + inss;

        System.out.printf("(-) INSS (10%%)\t\t\t\t : R$ %.2f.\n", inss);
        System.out.printf("FGTS (11%%)\t\t\t\t : R$ %.2f.\n", fgts);
        System.out.printf("Total de Descontos\t\t         : R$ %.2f.\n", totalDescontos);
        System.out.printf("Salario Liquido \t\t\t : R$ %.2f\n", salarioBruto - totalDescontos);

        sc.close();
    }
}