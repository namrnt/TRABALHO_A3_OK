//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
//Calcule e mostre o total do seu salário no referido mês.
import java.util.Scanner;
import java.util.Locale;

public class questao8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float valorHora;
        int horaMes;

        System.out.printf("Digite quanto voce ganha por hora: ");
        valorHora = sc.nextFloat();
        System.out.printf("Digite o valor das horas trabalhadas no mes: ");
        horaMes = sc.nextInt();

        System.out.printf("O valor total do seu salario no mes é R$ %.2f.", valorHora * horaMes);
        sc.close();
    }
}
