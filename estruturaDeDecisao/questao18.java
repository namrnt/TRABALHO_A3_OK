package estruturaDeDecisao;

import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.

public class questao18 {
        public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String data;

        System.out.printf("Digite uma data no formato dd/mm/nn: ");
        data = sc.nextLine();
        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        int ano = Integer.parseInt(data.substring(6));

        System.out.println(dia + " " + mes + " " + ano);

        boolean bissexto = false;

        if(ano % 4 == 0){
            bissexto = true;
        } else bissexto = false;

        boolean valida = false;
        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) {
            if (dia < 1 || dia > 31) {
                valida = false;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia < 1 || dia > 30) {
                valida = false;
            }
        } else {
            if (bissexto) {
                if (dia < 1 || dia > 29) {
                    valida = false;
                }
            } else {
                if (dia < 1 || dia > 28) {
                    valida = false;
                }
            }
        }
        if (valida) {
            System.out.println("Data VALIDA");
        } else {
            System.out.println("Data INVALIDA");
        }
        sc.close();
    }
}
