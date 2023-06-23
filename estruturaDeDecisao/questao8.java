package estruturaDeDecisao;
//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
// sabendo que a decisão é sempre pelo mais barato.

import java.util.Locale;
import java.util.Scanner;

public class questao8 {
        public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[] preco = new double[3];
        double menor;
        int aux;

        for(int i = 0; i <= preco.length - 1; i++) {
            System.out.printf("Digite o preço do %d produto: ", i + 1);
            preco[i] = sc.nextFloat();
        }
        menor = preco[2];
        aux = 0;
        for(int j = 0; j <= preco.length-1; j++){
            if(preco[j] < menor){ 
                aux = 1;
                menor = preco[j];
                aux++;
            }
        }
        System.out.printf("O produto %d é o mais barato dos 3, custando R$ %.2f.", aux, menor);
        sc.close();
    }
}
