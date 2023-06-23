package estruturaDeDecisao;
/*
O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:

                      Até 5 Kg           Acima de 5 Kg
File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg

Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção,
porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o
cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo
e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da
compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.

*/

import java.util.Locale;
import java.util.Scanner;

public class questao28 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String carne, terCartao;
        float quantidade, valorBruto = 0.0f, desconto = 0.0f;

        System.out.print("Digite qual sera a carne de acordo com a relação abaixo: ");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        carne = sc.nextLine().toUpperCase();

        System.out.print("Informe a quantidade comprada: ");
        quantidade = sc.nextFloat();
        sc.nextLine();

        System.out.print("Usará cartão Tabajara (S/N): ");
        terCartao = sc.nextLine().toUpperCase();

        System.out.println("CUPOM FISCAL");

        if (carne.equals("1")) {
            System.out.println("Carne: Filé Duplo");
            if (quantidade <= 5) valorBruto = quantidade * 4.9f;
            else valorBruto = quantidade * 5.8f;
            }
            else if (carne.equals("2")) {
            System.out.println("Carne: Alcatra");
            if (quantidade <= 5) valorBruto = quantidade * 5.9f;
            else valorBruto = quantidade * 6.8f;
        }
        else {
            System.out.println("Carne: Picanha");
            if (quantidade <= 5) valorBruto = quantidade * 6.9f;
            else valorBruto = quantidade * 7.8f; 
        }

        System.out.println("Valor Bruto: " + valorBruto);

        if (terCartao.equals("S")) {
            System.out.println("Pagamento com cartão!");
            desconto = valorBruto * 0.05f;
        } else System.out.println("Pagamento sem o cartão!");
        

        System.out.println("Desconto: " + desconto);
        System.out.println("Valor a Pagar: " + (valorBruto - desconto));
        sc.close();
    }
}
