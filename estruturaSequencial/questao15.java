/*
Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 
8% para o INSS e 5% para o sindicato, faça um programa que nos dê:

salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.

calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.
*/

import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class questao15 {

    public static double valorHora, salarioBruto, ir, inss, sindicato, salarioLiquido;
    public static int horaMes;
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt","BR");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quanto voce ganha por hora e o numero de horas trabalhadas no mes respectivamente: ");
        valorHora = sc.nextFloat();
        horaMes = sc.nextInt();

        salarioBruto = valorHora * horaMes;
        ir = salarioBruto * 0.11;
        inss = salarioBruto * 0.08;
        sindicato = salarioBruto * 0.05;
        salarioLiquido = salarioBruto - (ir + inss + sindicato);

        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        System.out.println("Salario Bruto : R$ "+ dinheiro.format(salarioBruto));
        System.out.println("IR (11%) : R$" + dinheiro.format(ir));
        System.out.println("INSS (8%) : R$ "+ dinheiro.format(inss));
        System.out.println("Sindicato ( 5%) : R$ "+ dinheiro.format(sindicato));
        System.out.println("Salario Liquido : R$ "+ dinheiro.format(salarioLiquido));
        sc.close();

    }
}
