/*
 *
 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
 * Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo
 * (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia
 * a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além
 * do limite e na variável multa o valor da multa que João deverá pagar. 
 * Imprima os dados do programa com as mensagens adequadas.
 * 
 */
import java.util.Scanner;
import java.util.Locale;

public class questao14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float peso, multa;
        int excesso;

        System.out.printf("Digite quantos quilos foram pescados: ");
        peso = sc.nextFloat();

        excesso = (int)(peso - 50);
        multa = excesso * 4;

        System.out.printf("O peso total pescado foi %.2f Kg.\nO valor do excesso chegou ao total de %d Kg.\nO valor total da multa que deverá ser paga é R$ %.2f.", peso, excesso, multa);
        sc.close();
    }
}
