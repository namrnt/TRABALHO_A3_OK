package estruturaDeDecisao;

import java.util.Scanner;

/*

As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe 
contraram para desenvolver o programa que calculará os reajustes.

Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:

salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5%
 
Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.

 */

public class questao11 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, aumento, novoSalario;

        System.out.printf("Digite o seu salário atual: ");
        salario = sc.nextDouble();
        System.out.printf("Salario antes o reajuste: R$ %.2f\n", salario);
        if(salario <= 280){
         System.out.println("Percentual de aumento aplicado: 20%.");
            aumento = (salario * 1.2) - salario;
            System.out.printf("Valor do aumento: R$ %.2f.\n", aumento);
            novoSalario = salario + aumento;
            System.out.printf("Novo salario apos o aumento: R$ %.2f.\n", novoSalario);
        } else if(salario > 280 && salario < 700){
         System.out.println("Percentual de aumento aplicado: 15%.");
            aumento = (salario * 1.15) - salario;
            System.out.printf("Valor do aumento: R$ %.2f.\n", aumento);
            novoSalario = salario + aumento;
            System.out.printf("Novo salario apos o aumento: R$ %.2f.\n", novoSalario);
        } else if(salario > 700 && salario < 1500){
            System.out.println("Percentual de aumento aplicado: 10%.");
            aumento = (salario * 1.10) - salario;
            System.out.printf("Valor do aumento: R$ %.2f.\n", aumento);
            novoSalario = salario + aumento;
            System.out.printf("Novo salario apos o aumento: R$ %.2f.\n", novoSalario);
        } else if(salario >= 1500){
            System.out.println("Percentual de aumento aplicado: 5%.");
            aumento = (salario * 1.05) - salario;
            System.out.printf("Valor do aumento: R$ %.2f.\n", aumento);
            novoSalario = salario + aumento;
            System.out.printf("Novo salario apos o aumento: R$ %.2f.\n", novoSalario);
        } 
        
        sc.close();
    }
}

/*
 *          System.out.println("Percentual de aumento aplicado: 20%.");
            aumento = (salario * 1.2) - salario;
            System.out.printf("Valor do aumento: R$ %.2f.\n", aumento);
            novoSalario = salario + aumento;
            System.out.printf("Novo salario apos o aumento: R$ %.2f.\n", novoSalario);
 */
